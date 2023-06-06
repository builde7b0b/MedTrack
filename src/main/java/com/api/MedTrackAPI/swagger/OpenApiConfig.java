package com.api.MedTrackAPI.swagger;

import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springdoc.core.SwaggerUiConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
//WORKING

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .packagesToScan("com.api.MedTrackAPI.controller") // Replace with your package containing API controllers
                .build();
    }

    @Bean
    public SwaggerUiConfigParameters swaggerUiConfigParameters(SwaggerUiConfigProperties properties) {
        return new SwaggerUiConfigParameters(properties)
                ; // Skip security annotations if needed
    }
}

