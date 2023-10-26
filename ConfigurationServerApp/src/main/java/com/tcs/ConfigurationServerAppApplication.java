package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigurationServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationServerAppApplication.class, args);
	}

}
