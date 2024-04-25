package com.edureka.feesms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@SpringBootApplication
public class FeesmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeesmsApplication.class, args);
	}

}
