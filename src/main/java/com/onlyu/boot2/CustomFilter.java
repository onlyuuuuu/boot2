package com.onlyu.boot2;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class CustomFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        //throw new WebApplicationException("Test exception", Response.status(Response.Status.BAD_REQUEST.getStatusCode()).entity(Map.of("message", "asdasdsd")).build());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
