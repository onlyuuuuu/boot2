package com.onlyu.boot2;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/")
public class JerseyResource2
{
    @GET
    public String message() {
        return "Hello2";
    }
}
