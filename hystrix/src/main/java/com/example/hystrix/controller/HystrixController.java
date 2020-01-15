package com.example.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@Scope("prototype")
public class HystrixController {
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/user")
    @HystrixCommand(fallbackMethod = "backMethod")
    public Map<String ,String > getjj(@RequestBody Map<String ,String > request) throws  Exception{
        Thread.sleep(2000);
        ResponseEntity< Map> responseEntity = restTemplate.postForEntity("http://spring-boot-provider/springbootprovider/getjj",request, Map.class);
        return  responseEntity.getBody();
    }
    public  Map<String ,String> backMethod(Map<String ,String > request){
        request.put("fail","the backMethod");
        return request;
    }

}
