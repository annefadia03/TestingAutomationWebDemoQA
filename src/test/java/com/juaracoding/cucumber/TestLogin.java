package com.juaracoding.cucumber;

import com.juaracoding.cucumber.drivers.strategies.DriverSingleton;
import com.juaracoding.cucumber.pages.LoginPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    public static WebDriver driver;

    public static LoginPage loginPage;

    @BeforeAll
    public static void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();
        delay(3);
    }

    @Given("User open browser and url")
    public void user_open_browser_and_url(){
        System.out.println("User open browser and url");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @When("User enter valid username")
    public void user_enter_valid_username(){
        delay(3);
        System.out.println("User input valid username");
        loginPage.enterUsername("Admin");
    }

    @And("User enter valid password")
    public void user_enter_valid_password(){
        delay(3);
        System.out.println("User input valid password");
        loginPage.enterPassword("admin123");
    }

    @And("User click button login")
    public void user_click_button_login(){
        delay(3);
        System.out.println("User click button login");
        loginPage.buttonLogin();
    }

    @Then("User go to page Dashboard")
    public void user_go_to_page_Dashboard(){
        delay(3);
        System.out.println("User go to page Dashboard");
        Assert.assertEquals(loginPage.getTxtDahsboard(),"Dashboard");
    }

    @When("User click button logout")
    public void user_click_button_logout(){
        loginPage.setButtonLogout();
        System.out.println("User click button logout\n");
    }

    @And("User enter invalid username")
    public void user_enter_invalid_username(){
        delay(3);
        System.out.println("User input invalid username");
        loginPage.enterUsername("Admin09");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password(){
        delay(3);
        System.out.println("User input invalid password");
        loginPage.enterPassword("admin12309");
    }
    @AfterAll
    public static void quitBrowser(){
        delay(3);
        DriverSingleton.closeObjectInstance();


    }

    @Then("User get message invalid credential")
    public void user_get_message_invalid_credential(){
        delay(3);
        System.out.println("User get message invalid credential\n");
        Assert.assertEquals(loginPage.getInvalidCredentials(), "Invalid credentials");
    }

    public static void delay (long detik){
        try {
            Thread.sleep(detik*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
