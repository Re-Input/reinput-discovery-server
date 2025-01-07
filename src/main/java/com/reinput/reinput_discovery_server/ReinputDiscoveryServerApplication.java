package com.reinput.reinput_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ReinputDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReinputDiscoveryServerApplication.class, args);
	}

}
