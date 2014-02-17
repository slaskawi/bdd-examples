package pl.payu.dictionary.client.exception;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" }, glue = "pl.payu.dictionary.client.exception.steps")
public class CucumberTest {

}
