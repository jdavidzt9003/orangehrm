package co.com.sofka.runner.time.projectinfo.projects;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-report/cucumber.html"},
        glue = {"co.com.sofka.stepdefinition.time.projectinfo.projects"},
        features = {"src/test/resources/features/webui/time/projectinfo/projects/projects.feature"},
        publish = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ProjectsTest {
}
