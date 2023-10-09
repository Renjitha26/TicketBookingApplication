package com.irctcbooking.trainbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.irctcbooking.trainbooking.*")
@EntityScan
@EnableJpaRepositories
public class TrainbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainbookingApplication.class, args);
	}

}
