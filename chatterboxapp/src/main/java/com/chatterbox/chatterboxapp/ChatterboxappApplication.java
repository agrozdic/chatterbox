package com.chatterbox.chatterboxapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EntityScan(basePackages = {"com.chatterbox.model"}) //Here we give the root to our package containing Post and User Classes.
@SpringBootApplication
public class ChatterboxappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatterboxappApplication.class, args);
	}

}
