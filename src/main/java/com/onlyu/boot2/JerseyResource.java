package com.onlyu.boot2;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Map;

@Component
@Path("/")
public class JerseyResource
{
    @GET
    public String message() {
        return "Hello";
    }

    @GET
    @Path("/exception")
    @Produces(MediaType.APPLICATION_JSON)
    public String exception() {
        throw new WebApplicationException("Test exception", Response.status(Response.Status.BAD_REQUEST.getStatusCode()).entity(Map.of("errorMessage", "This is a test exception!")).build());
    }
}
