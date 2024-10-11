package com.onlyu.boot2;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@DependsOn({"config", "config2"})
public class ServletRegistrationConfig
{
    @Autowired
    private Config config;

    @Autowired
    private Config2 config2;

    @Bean
    public ServletRegistrationBean publicJersey() {
        ServletRegistrationBean j1 = new ServletRegistrationBean(new ServletContainer(config));
        j1.addUrlMappings("/jersey/*");
        j1.setName("v1");
        j1.setLoadOnStartup(0);
        return j1;
    }

    @Bean
    public ServletRegistrationBean privateJersey() {
        ServletRegistrationBean j2 = new ServletRegistrationBean(new ServletContainer(config2));
        j2.addUrlMappings("/jersey2/*");
        j2.setName("v2");
        j2.setLoadOnStartup(1);
        return j2;
    }

}
