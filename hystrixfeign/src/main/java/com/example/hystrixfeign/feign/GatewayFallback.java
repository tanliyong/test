package com.example.hystrixfeign.feign;

import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public class GatewayFallback implements GatewayFeignClient {


    @Override
    public Map<String, String> getjj(Map<String, String> map) throws Exception {
        map.put("fallBack","this is hystrixFeign fallback");
        return map;
    }
}
