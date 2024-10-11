package com.onlyu.boot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class Controller
{
    @GetMapping("/entry0")
    private Map<String, Object> entry0()
    {
        Map<String, Object> map = new HashMap<>();
        map.put("foo", "bar");
        map.put("dog", "cat");
        map.put("number", 19);
        return map;
    }
}
