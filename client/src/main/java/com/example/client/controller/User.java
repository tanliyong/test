package com.example.client.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Scope("prototype")
@Api(tags = "测试接口")
public class User {
    @GetMapping("/gateway")
    @ApiOperation("测试接口")
    public String getclient() throws Exception{
        return "this is provider--1!";
    }
    @PostMapping(value = "/name")
    @ApiOperation("测试接口1")
    public String getName(@RequestParam(value = "name")String name) throws Exception{
        return "client name is "+name;
    }
    @PostMapping(value = "/getjj")
    @ApiOperation("测试接口2")
    public Map<String ,String> getjj(@RequestBody Map<String ,String> req){
        req.put("client","client");
        return  req;
    }
}
