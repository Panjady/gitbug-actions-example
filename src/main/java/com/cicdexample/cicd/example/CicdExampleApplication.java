package com.cicdexample.cicd.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CicdExampleApplication {
	@GetMapping("/welcome")
    public String welcome(){
		return "welcome to cic d";
	}
	public static void main(String[] args) {
		SpringApplication.run(CicdExampleApplication.class, args);
	}

}
