package com.onlyu.boot2;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletRegistrationConfig
{
    @Bean
    public ServletRegistrationBean j1() {
        ServletRegistrationBean j1 = new ServletRegistrationBean(new ServletContainer(new Config()));
        j1.addUrlMappings("/*");
        j1.setName("v1");
        j1.setLoadOnStartup(0);
        return j1;
    }

    @Bean
    public ServletRegistrationBean j2() {
        ServletRegistrationBean j2 = new ServletRegistrationBean(new ServletContainer(new Config2()));
        j2.addUrlMappings("/jersey2/*");
        j2.setName("v2");
        j2.setLoadOnStartup(1);
        return j2;
    }
}
