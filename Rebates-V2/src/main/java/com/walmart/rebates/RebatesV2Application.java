package com.walmart.rebates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Configuration
@ComponentScan("com.walmart.rebates")
@EntityScan("com.walmart.rebates.entities")
@EnableJpaRepositories("com.walmart.rebates.repository")
public class RebatesV2Application {

	public static void main(String[] args) {
		SpringApplication.run(RebatesV2Application.class, args);
	}

}
