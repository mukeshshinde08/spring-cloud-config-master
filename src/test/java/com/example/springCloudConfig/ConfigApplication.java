package com.example.springCloudConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication  {

	 public static void main(String[] args) {

		  new SpringApplicationBuilder(ConfigApplication.class).run(args);

		 }

}

