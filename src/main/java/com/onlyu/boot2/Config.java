package com.onlyu.boot2;

import org.glassfish.jersey.server.ResourceConfig;

public class Config extends ResourceConfig
{
    public Config()
    {
        register(JerseyResource.class);
        //register(ExMapper1.class);
    }
}
