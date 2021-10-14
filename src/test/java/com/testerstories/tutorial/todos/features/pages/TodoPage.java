package com.testerstories.tutorial.todos.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("http://todomvc.com/examples/angularjs")
public class TodoPage extends PageObject {
    public void addActionCalled(String actionName) {
        $("#new-todo").type(actionName).then().sendKeys(Keys.ENTER);
    }

    public List<String> getActions() {
        return findAll(".view").stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
    }
}
