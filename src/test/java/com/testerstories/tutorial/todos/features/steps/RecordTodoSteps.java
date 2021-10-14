package com.testerstories.tutorial.todos.features.steps;

import com.testerstories.tutorial.todos.pages.TodoPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordTodoSteps {
    TodoPage todoPage;

    @Given("^the todo application$")
    public void start_the_todo_application() {
        todoPage.open();
    }

    @When("^the todo action '(.*)' is added$")
    public void add_a_todo_action(String actionName) {
        todoPage.addActionCalled(actionName);
    }

    @Then("^'(.*)' should appear in the todo list$")
    public void action_should_appear_in_my_todo_list(String action) {
        assertThat(todoPage.getActions()).contains(action);
    }
}
