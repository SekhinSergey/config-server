package com.kpi.configserver;

import org.springframework.cloud.config.monitor.PropertyPathNotificationExtractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExtractorConfiguration {

    @Bean
    public PropertyPathNotificationExtractor extract() {
        return new CustomGithubPropertyPathNotificationExtractor();
    }
}
