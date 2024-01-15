package com.tms.lessons43store.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi storeOpenApi() {
        String paths[] = {"/store/**"};
        return GroupedOpenApi.builder().group("stores").pathsToMatch(paths)
                .build();
    }
}
