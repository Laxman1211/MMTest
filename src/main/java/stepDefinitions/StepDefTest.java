package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import baseAndUtilities.Base;
import baseAndUtilities.CommonMethods;

@RunWith(Cucumber.class)
public class StepDefTest extends Base, CommonMethods  {

	CommonMethods cm = new CommonMethods();
	
	@Given("^User is on Home Page$")
    public void user_is_on_home_page() throws Throwable {
        initialise();
        driver.get("http://www.google.com");
    }

    @When("^User Navigate to problem Page$")
    public void user_navigate_to_problem_page() throws Throwable {
    	driver.navigate("http://www.testyou.in/Login.aspx"); // suppose other page 
    }

    @Then("^Right count of values appear on screen$")
    public void right_count_of_values_appear_on_screen() throws Throwable {
    	cm.countOfValues(); 
    }

    @Then("^values are greater than Zero$")
    public void values_are_greater_than_zero() throws Throwable {
    	cm.valueGreaterThanZero();   	
    }

    @Then("^Total balance is correct$")
    public void total_balance_is_correct() throws Throwable {
    	cm.totalBalCorrect();
    }

    @Then("^Values are formatted as currencies$")
    public void values_are_formatted_as_currencies() throws Throwable {
    	cm.valuesFormatCurrency();
    }

    @Then("^Total balance equals to sum of values$")
    public void total_balance_equals_to_sum_of_values() throws Throwable {
    	cm.totalBalCorrect();
    }
}
