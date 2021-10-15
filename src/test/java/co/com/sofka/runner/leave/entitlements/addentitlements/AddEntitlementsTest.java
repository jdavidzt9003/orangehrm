package co.com.sofka.runner.leave.entitlements.addentitlements;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/webui/leave/entitlements/addentitlements/addEntitlements.feature"},
        glue = {"co.com.sofka.stepdefinition.leave.entitlements.addentitlements.AddEntitlementsStepDefinition"},
        publish = true)

public class AddEntitlementsTest {
}
