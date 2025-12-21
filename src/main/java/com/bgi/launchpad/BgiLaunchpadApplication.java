package com.bgi.launchpad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BgiLaunchpadApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgiLaunchpadApplication.class, args);
	}
    @GetMapping("/")
	public String getName(){
		return "hello spring !!!!";
	}
}
