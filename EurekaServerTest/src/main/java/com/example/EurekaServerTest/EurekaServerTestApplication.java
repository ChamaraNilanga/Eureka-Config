package com.example.EurekaServerTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTestApplication.class, args);
	}

}
