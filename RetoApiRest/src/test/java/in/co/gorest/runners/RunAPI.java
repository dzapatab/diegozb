package in.co.gorest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="classpath:features/api",
		glue="in.co.gorest.stepdefinitions",
		tags="  @sanity  ",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json",
		},
		strict=true,
		dryRun=false,
		snippets=SnippetType.CAMELCASE

		)
public class RunAPI {

}
