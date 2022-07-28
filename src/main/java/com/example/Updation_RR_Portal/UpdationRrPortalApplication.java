package com.example.Updation_RR_Portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class UpdationRrPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpdationRrPortalApplication.class, args);
	}


	@Bean
	public PasswordEncoder passwordEncoder()
	{

		return new BCryptPasswordEncoder();
	}
}
