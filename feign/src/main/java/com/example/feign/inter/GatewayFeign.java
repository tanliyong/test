package com.example.feign.inter;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "spring-boot-provider",configuration = com.example.feign.config.GlobalConfiguration.class)
@Component
public interface GatewayFeign {
    @RequestLine("GET /springbootprovider/gateway")
    public String gateWay() throws Exception;
    @RequestLine("POST /springbootprovider/name?name={name}")
    public  String getName(@Param(value = "name") String name)throws  Exception;
    @RequestLine("POST /springbootprovider/getjj")
    @Headers("Content-Type: application/json")
    public Map<String ,String > getjj(Map<String,String > map) throws Exception;

}

