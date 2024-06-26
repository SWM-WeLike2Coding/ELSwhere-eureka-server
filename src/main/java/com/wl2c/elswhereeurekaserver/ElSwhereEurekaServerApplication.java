package com.wl2c.elswhereeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ElSwhereEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElSwhereEurekaServerApplication.class, args);
	}

}
