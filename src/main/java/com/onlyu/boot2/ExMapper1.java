package com.onlyu.boot2;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExMapper1 implements ExceptionMapper<WebApplicationException>
{
    @Override
    public Response toResponse(WebApplicationException exception)
    {
        return Response.ok(new ExceptionResponse(exception.getResponse().getStatus(), exception.getMessage())).status(exception.getResponse().getStatus()).build();
    }

    static class ExceptionResponse
    {
        int status;
        String message;
        public ExceptionResponse(int status, String message)
        {
            this.status = status;
            this.message = message;
        }
    }
}
