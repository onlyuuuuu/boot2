package com.onlyu.boot2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.ws.rs.WebApplicationException;
import java.util.Map;

@RestControllerAdvice
public class ExHandleController
{
    @ExceptionHandler(WebApplicationException.class)
    public ResponseEntity<Map<String, Object>> handleEx(WebApplicationException e)
    {
        return ResponseEntity.status(e.getResponse().getStatus()).body(Map.of("errorMessage", e.getMessage()));
    }
}
