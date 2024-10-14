package com.onlyu.boot2;

import org.glassfish.jersey.server.ResourceConfig;

public class Config2 extends ResourceConfig
{
    public Config2()
    {
        register(JerseyResource2.class);
        register(CustomJerseyFilter.class);
        //register(ExMapper.class);
    }
}
