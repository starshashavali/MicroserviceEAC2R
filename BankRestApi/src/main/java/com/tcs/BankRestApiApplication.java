package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankRestApiApplication.class, args);
	}

}
