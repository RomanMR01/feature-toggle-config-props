package com.epam.feature.toggle.demo.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "feature.toggle")
@Data
@NoArgsConstructor
public class FeatureToggleProperties {
    private String starsRating;
}
