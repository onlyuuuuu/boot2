package com.onlyu.boot2;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component("config")
public class Config extends ResourceConfig
{
    public Config()
    {
        register(JerseyResource.class);
    }
}
