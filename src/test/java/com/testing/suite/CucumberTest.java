package com.testing.suite;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@SelectClasspathResource("feature")
@IncludeEngines("cucumber")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.testing")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "com.epam.reportportal.cucumber.ScenarioReporter")
@IncludeTags("DEBUG")
public class CucumberTest {
}