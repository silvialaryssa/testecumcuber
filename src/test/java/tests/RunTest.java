package tests;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.ClassRule;
import org.junit.runner.RunWith;
import util.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        //glue = {""},
        glue = {"steps"},
        tags = "@run",
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
        monochrome = false,
	//	snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
)
public class RunTest {

    @ClassRule
    public static TestRule testRule = new TestRule();

}
