package com.example.EurekaServerTest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServerTest2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerTest2Application.class, args);
	}

}
