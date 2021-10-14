package com.testerstories.tutorial.todos.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
                 plugin = {"pretty", "html:target/cucumber-html-report"},
                 features = "src/test/resources/features/manage_todos/record_todos/add_new_todos.feature"
)
public class RecordTodos {}
