package com.example.zuul;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> list = new ArrayList<>();
        list.add(swaggerResource("privider","/spring-boot-provider/springbootprovider/v2/api-docs","1.0.0"));
        return list;
    }
    public  SwaggerResource swaggerResource(String name,String url ,String version){
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(url);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
