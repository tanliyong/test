package com.example.hystrixfeign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Component
@FeignClient(value = "spring-boot-provider",fallbackFactory = GatewayFallbackFactory.class)
public interface GatewayFeignClient {
    @PostMapping(value = "/springbootprovider/getjj")
    Map<String ,String > getjj(Map<String ,String> map) throws Exception;
}
