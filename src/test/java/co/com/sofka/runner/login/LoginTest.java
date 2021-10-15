package co.com.sofka.runner.login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/webui/login/login.feature"},
        glue = {"co.com.sofka.stepdefinition.login"},
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true)

public class LoginTest {
}
