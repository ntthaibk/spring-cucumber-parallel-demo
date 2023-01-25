package com.testing.service;

import io.cucumber.spring.ScenarioScope;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ScenarioScope
@Data
public class TestDTO {
    
    private String value;

    private String name = null;


}
