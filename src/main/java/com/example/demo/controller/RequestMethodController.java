package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class RequestMethodController {

    @GetMapping("request/get")
    public String requestGet()
    {
        return  "This is get method!";
    }

    @PostMapping("request/post")
    public String requestPost()
    {
        return  "This is post method!";
    }

    @PutMapping("request/put")
    public String requestPut()
    {
        return  "This is put method!";
    }

    @DeleteMapping("request/delete")
    public String requestDelete()
    {
        return  "This is delete method!";
    }
}
