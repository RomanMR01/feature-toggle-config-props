package com.epam.feature.toggle.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeatureToggleServiceImpl implements FeatureToggleService {

    private final Properties properties;

    public boolean isToggleOn(String code) {
        boolean isOn = Boolean.parseBoolean(properties.getProperty(code));
        log.info("Is toggle [{}] on - [{}].", code, isOn);
        return isOn;
    }
}
