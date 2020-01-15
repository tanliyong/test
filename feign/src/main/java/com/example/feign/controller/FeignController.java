package com.example.feign.controller;

import com.example.feign.inter.GatewayFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@Scope("prototype")
public class FeignController {
    @Autowired
    GatewayFeign gatewayFeign;
    @GetMapping("/gateway")
    public  String gateWay() throws Exception {
        return gatewayFeign.gateWay();
    }
    @PostMapping(value = "/getName")
    public  String getName(@RequestParam(value = "name")String name) throws Exception {
        return gatewayFeign.getName(name);
    }
    @PostMapping(value = "/getjj")
    public Map<String,String> getjj(@RequestBody Map<String,String> map) throws Exception{
        return gatewayFeign.getjj(map);
    }


}
