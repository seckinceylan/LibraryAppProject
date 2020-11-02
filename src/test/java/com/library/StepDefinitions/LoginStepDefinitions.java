package com.library.StepDefinitions;

import com.library.Pages.LoginPage;
import com.library.Utils.ConfigurationReader;
import com.library.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

        LoginPage loginPage = new LoginPage();

        @Given("user is on the login page")
        public void user_is_on_the_login_page() {
            Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
            //String url = ConfigurationReader.getProperty("url");
            //Driver.getDriver().get(url);
        }

        @When("user logs in as a {string}")
        public void user_logs_in_as_a(String string)  {
            loginPage.login(string);

        }

        @Then("user should see dashboard page")
        public void user_should_see_dashboard_page() {
            String expected = "Login - Library";
            String actual = Driver.getDriver().getTitle();
            Assert.assertEquals("Title is not correct!", expected, actual);
            System.out.println("I see the Dashboard page!");
            Driver.closeDriver();
        }



        //When user logs in with "librarian" username and "wrong" password
        @When("user logs in with {string} username and {string} password")
        public void user_logs_in_with_username_and_password(String string1, String string2) {
            loginPage.login(string1, string2);
        }

        //String expected = "Sorry, Wrong Email or Password"
        //    Then user verifies that "Sorry, Wrong Email or Password" message is displayed
        @Then("user verifies that {string} message is displayed")
        public void user_verifies_that_message_is_displayed(String expected) {
            String actualResult = loginPage.getWarningMessageText();
            Assert.assertEquals(expected, actualResult);
            System.out.println("Warning Message is Verified!!!");
            Driver.closeDriver();
        }


    }

