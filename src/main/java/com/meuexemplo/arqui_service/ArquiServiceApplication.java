package com.meuexemplo.arqui_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ArquiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquiServiceApplication.class, args);
	}

}
