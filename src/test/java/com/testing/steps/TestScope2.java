package com.testing.steps;

import com.testing.service.TestDTO;
import io.cucumber.java.en.Given;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class TestScope2 {

    @Autowired
    private TestDTO testDTO;

    @Given("I get TestDTO value")
    public void getTestDTOValue1(){
        log.info("{}",testDTO.getValue());

    }

    @Given("I get testDTO value 2")
    public void getTestDTO(){
        log.info("{} Thread-Scope2-{}",testDTO.getValue(), Thread.currentThread().getName());

    }
}
