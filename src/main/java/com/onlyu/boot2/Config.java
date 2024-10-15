package com.onlyu.boot2;

import org.glassfish.jersey.server.ResourceConfig;

public class Config extends ResourceConfig
{
    public Config()
    {
        register(JerseyResource.class);
        //register(CustomJerseyFilter.class);
        register(CustomJerseyFilter2.class);
        //register(ExMapper.class);
    }
}
