package com.testing.steps;

import com.testing.service.TestDTO;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class TestScope1 {

    @Autowired
    private TestDTO testDTO;

    @Given("I set testDTO value to {string}")
    public void updateValue(String value){
        testDTO.setValue(value);
        log.info("{}, Thread {}",testDTO.getValue(), Thread.currentThread().getName());

    }
}
