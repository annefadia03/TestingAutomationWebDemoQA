package com.juaracoding.cucumber;

import com.juaracoding.cucumber.drivers.strategies.DriverSingleton;
import com.juaracoding.cucumber.pages.LoginPageShop;
import com.juaracoding.cucumber.utils.Constants;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLoginShop {
    public static WebDriver driver;
    public static LoginPageShop loginPageShop = new LoginPageShop();
    public TestLoginShop(){
        driver = Hooks.driver;
    }

//    @BeforeAll
//    public static void setUp(){
//        DriverSingleton.getInstance("chrome");
//        driver = DriverSingleton.getDriver();
//        loginPageShop = new LoginPageShop();
//        delay(3);
//    }

    @Given("User open browser and url")
    public void user_open_browser_and_url() {
        driver.get(Constants.URL);
        System.out.println("User open browser and url");
    }

    @And("User go to My Account")
    public void user_go_to_my_account() {
        loginPageShop.tologinpage();
        System.out.println("User go to My Account");
    }

    @And("User enter valid username")
    public void user_enter_valid_username() {
        loginPageShop.inputUsername("annefadia143@gmail.com");
        System.out.println("User enter valid username");
    }

    @When("User enter valid password")
    public void user_enter_valid_password() {
        loginPageShop.inputPassword("1403Pane");
        System.out.println("User enter valid password");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password() {
        loginPageShop.inputPassword("123pane");
        System.out.println("User enter invalid password");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPageShop.buttonLogin();
        System.out.println("User click button login");
    }

    @Then("User get message ERROR")
    public void user_get_message_error() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageShop.getTxtError(),"Lost your password");
        System.out.println("User get message ERROR");
    }

    @Then("User go to page Dashboard")
    public void user_go_to_page_dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageShop.getMenuDashboard(),"Dashboard");
        System.out.println("User go to page Dashboard");
    }
    //
    @When("User go back to Orders")
    public void user_go_back_to_orders() {
        loginPageShop.orderItem();
        System.out.println("User go back to Home");

    }
    @And("User brow product")
    public void user_brow_product() {
        loginPageShop.browProduct();
        System.out.println("User brow product");
    }

    @And("User pick item")
    public void user_pick_item() {
        loginPageShop.chooseItem();
        System.out.println("User pick item");
    }

    @And("User choose variant")
    public void user_choose_variant() {
        loginPageShop.chooseVariant();
        System.out.println("User choose variant");
    }
//    @AfterAll
//    public static void quitBrowser(){
//        Hooks.delay(3);
//        DriverSingleton.closeObjectInstance();
//    }

    @Then("User click button Add to Cart")
    public void user_click_button_add_to_cart() {
        Hooks.delay(1);
        loginPageShop.addToCart();
        Assert.assertEquals(loginPageShop.getTxtAdd(),"ADD TO CART");
        System.out.println("User click button Add to Cart");
    }
//    public static void delay (long detik){
//        try {
//            Thread.sleep(detik*1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
