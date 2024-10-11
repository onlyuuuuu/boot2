package com.onlyu.boot2;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/jersey")
public class Config extends ResourceConfig
{
    public Config()
    {
        packages("com.onlyu.boot2");
        register(JerseyResource.class);
    }
}
