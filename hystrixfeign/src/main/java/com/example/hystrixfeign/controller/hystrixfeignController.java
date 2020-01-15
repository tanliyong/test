package com.example.hystrixfeign.controller;

import com.example.hystrixfeign.feign.GatewayFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Scope("prototype")
public class hystrixfeignController {
    @Autowired
    GatewayFeignClient gatewayFeignClient;
    @PostMapping(value = "getjj")
    public Map<String ,String > getjj(@RequestBody Map<String ,String > map) throws Exception{

        return gatewayFeignClient.getjj(map);
    }
}
