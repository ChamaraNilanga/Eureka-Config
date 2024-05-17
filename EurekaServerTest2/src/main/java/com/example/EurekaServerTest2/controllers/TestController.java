package com.example.EurekaServerTest2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Configuration
class MyConfiguration {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

@RestController
@CrossOrigin
@RequestMapping("/test")
@EnableDiscoveryClient
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/data")
    public String hello(){
        String response = restTemplate.getForObject("http://server2/test/data",String.class);
        return response;
    }
}