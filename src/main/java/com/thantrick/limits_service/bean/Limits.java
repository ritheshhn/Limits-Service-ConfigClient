package com.thantrick.limits_service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created on 30-07-2024
 *
 * @author : Rithesh Nagaraj
 * @project : limits-service
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Limits {
    private int min;
    private int max;
}
