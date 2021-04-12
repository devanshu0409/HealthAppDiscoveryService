package com.healthcareapp.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HealthAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthAppDiscoveryServiceApplication.class, args);
	}

}
