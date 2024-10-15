package com.onlyu.boot2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.Map;

@Provider
public class CustomJerseyFilter2 implements ContainerRequestFilter
{
    @Context
    private HttpServletRequest httpServletRequest;

    @Context
    private HttpServletResponse httpServletResponse;

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException
    {
        System.out.println("Comming from filter2");
        if ( httpServletRequest.getParameter("ex") == null || httpServletRequest.getParameter("ex").isEmpty() )
        {
            httpServletResponse.setHeader("fii", "ber");
            return;
        }
        httpServletResponse.setHeader("foo", "bar");
        throw new WebApplicationException("Test exception from filterbbbb", Response.status(Response.Status.BAD_REQUEST.getStatusCode()).type(MediaType.APPLICATION_JSON).entity(Map.of("errorMessagebbbb", "Test exception from filterbbbbbb")).build());
    }
}
