package com.example.springCloudConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class EurekaCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCloudConfigApplication.class, args);
	}

}

