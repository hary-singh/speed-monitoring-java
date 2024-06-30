package com.speedwatch.speedwatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpeedwatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeedwatchApplication.class, args);
	}

}
