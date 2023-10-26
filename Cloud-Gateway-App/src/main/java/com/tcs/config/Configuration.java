package com.tcs.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	public RouteLocator getRoute(RouteLocatorBuilder builder) {
		
		
		return builder.routes().
				route("bankservice",r->r.path("/bank/**")
				.uri("lb://BankRESTAPI"))
				.route("customerService",r->r.path("/customer/**")
						.uri("lb://CustomerRestApi"))
				.build();
	}
	
}
