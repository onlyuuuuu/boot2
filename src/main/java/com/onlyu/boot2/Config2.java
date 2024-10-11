package com.onlyu.boot2;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component("config2")
public class Config2 extends ResourceConfig
{
    public Config2()
    {
        register(JerseyResource2.class);
    }
}
