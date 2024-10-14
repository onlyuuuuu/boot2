package com.onlyu.boot2;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.Map;

@Provider
public class CustomJerseyFilter implements ContainerRequestFilter, ContainerResponseFilter
{
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException
    {
        System.out.println("Jersey ContainerRequestFilter...");
        throw new WebApplicationException("Test exception from filter", Response.status(Response.Status.BAD_REQUEST.getStatusCode()).type(MediaType.APPLICATION_JSON).entity(Map.of("errorMessage", "Test exception from filter")).build());
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException
    {
    }
}
