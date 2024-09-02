package com.Api_EnvioEmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Api_EnvioEmail.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class ApiEnvioEmailApplication {


	public static void main(String[] args) {
		SpringApplication.run(ApiEnvioEmailApplication.class, args);
	}

}
