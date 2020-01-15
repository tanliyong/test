package com.example.feign.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScanExclude
public class GlobalConfiguration {
    @Bean
    public Contract globalCOntract(){
        return new Contract.Default();
    }
}
