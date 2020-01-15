package com.example.provider.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Scope("prototype")
public class PrividerController {
    @GetMapping(value = "/gateway")
    public String gateway() throws Exception {
        return "hello world,this is spring-boot-provider-v2";
    }
    @PostMapping(value = "/name")
    public String getName(@RequestParam(value = "name")String name) throws Exception{
        return "privider name is "+name;
    }
    @PostMapping(value="/getjj")
    public Map<String ,String> getjj(@RequestBody Map<String ,String > request){
        request.put("privider","privider ");
        return request;

    }
}
