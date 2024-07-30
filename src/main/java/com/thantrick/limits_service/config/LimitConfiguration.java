package com.thantrick.limits_service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created on 30-07-2024
 *
 * @author : Rithesh Nagaraj
 * @project : limits-service
 */

@Data
@Component
@ConfigurationProperties("limits-service")
public class LimitConfiguration {

    private int min;
    private int max;
}
