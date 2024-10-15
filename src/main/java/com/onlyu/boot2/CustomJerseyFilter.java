package com.onlyu.boot2;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class CustomJerseyFilter implements ContainerRequestFilter
{
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException
    {
        System.out.println("Jersey ContainerRequestFilter...");
        //throw new WebApplicationException("Test exception from filteraaaa", Response.status(Response.Status.BAD_REQUEST.getStatusCode()).type(MediaType.APPLICATION_JSON).entity(Map.of("errorMessageaaa", "Test exception from filteraaaa")).build());
    }
}
