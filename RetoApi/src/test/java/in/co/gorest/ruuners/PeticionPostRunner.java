package in.co.gorest.ruuners;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PeticionPost.feature",
        glue = {"in.co.gorets.stepdefinitions",
        		"in.co.gorest.hooks"},
        snippets = SnippetType.CAMELCASE)
public class PeticionPostRunner {

}
