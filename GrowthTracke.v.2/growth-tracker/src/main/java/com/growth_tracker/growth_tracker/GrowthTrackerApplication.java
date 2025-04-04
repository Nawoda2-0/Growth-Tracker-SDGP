package com.growth_tracker.growth_tracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class GrowthTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrowthTrackerApplication.class, args);
	}

}
