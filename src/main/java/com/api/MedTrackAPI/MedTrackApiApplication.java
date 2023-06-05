package com.api.MedTrackAPI;

import org.springdoc.webmvc.ui.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = {"com.api.MedTrackAPI", "com.api.MedTrackAPI.swagger"})
public class MedTrackApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedTrackApiApplication.class, args);
	}

}
