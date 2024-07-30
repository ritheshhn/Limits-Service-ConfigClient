package com.thantrick.limits_service.controller;

import com.thantrick.limits_service.bean.Limits;
import com.thantrick.limits_service.config.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 30-07-2024
 *
 * @author : Rithesh Nagaraj
 * @project : limits-service
 */

@RestController
@RequestMapping("/configCloud")
public class LimitController {

    @Autowired
    private LimitConfiguration limitConfiguration;

    @GetMapping("/limits-from-code")
    public Limits fetchLimits(){
        return new Limits(1, 100);
    }

    @GetMapping("/limits-from-prop-file")
    public Limits fetLimitsFromPropertiesFile(){
        return new Limits(limitConfiguration.getMin(), limitConfiguration.getMax());
    }

    @GetMapping("/limits-from-config-server")
    public Limits fetLimitsFromConfigServer(){
        return new Limits(limitConfiguration.getMin(), limitConfiguration.getMax());
    }
}
