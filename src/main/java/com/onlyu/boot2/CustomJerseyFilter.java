package com.onlyu.boot2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class CustomJerseyFilter implements ContainerRequestFilter, ContainerResponseFilter
{
    @Context
    private HttpServletRequest httpServletRequest;

    @Context
    private HttpServletResponse httpServletResponse;

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException
    {
        System.out.println("Jersey ContainerRequestFilter...");
        //throw new WebApplicationException("Test exception from filter", Response.status(Response.Status.BAD_REQUEST.getStatusCode()).type(MediaType.APPLICATION_JSON).entity(Map.of("errorMessage", "Test exception from filter")).build());
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException
    {
        System.out.println(httpServletRequest.getRemoteAddr());
        httpServletResponse.setHeader("foo", "bar");
    }
}
