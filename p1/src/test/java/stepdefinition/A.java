package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A {
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
	   System.out.println("hello");
	    throw new io.cucumber.java.PendingException();
	}

	@When("user needs to select dropdown element and searches text")
	public void user_needs_to_select_dropdown_element_and_searches_text() {
		System.out.println("balls");
		throw new io.cucumber.java.PendingException();
	}

	@Then("user needs to click on search button")
	public void user_needs_to_click_on_search_button() {
		System.out.println("cucumber");
		throw new io.cucumber.java.PendingException();
	}

	@And("user is navigate to homepage")
	public void user_is_navigate_to_homepage() {
		System.out.println("maven");
		throw new io.cucumber.java.PendingException();
	}

}
