package com.course.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.course.entity"})
public class BackendMicroservicesUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendMicroservicesUsersApplication.class, args);
	}

}
