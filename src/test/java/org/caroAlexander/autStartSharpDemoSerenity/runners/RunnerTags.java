package org.caroAlexander.autStartSharpDemoSerenity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/loginStartSharp.feature",
        tags = "@stories",
        glue = "org.caroAlexander.autStartSharpDemoSerenity.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}
