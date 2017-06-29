package com.ccc.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by ccc on 2017/6/6.
 */

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }
}
