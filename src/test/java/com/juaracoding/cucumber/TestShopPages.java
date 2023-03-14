package com.juaracoding.cucumber;


import com.juaracoding.cucumber.pages.LoginShopPages;
import com.juaracoding.cucumber.pages.ShopPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestShopPages {
    public static WebDriver driver;
    public static LoginShopPages loginShopPages = new LoginShopPages();
    public static ShopPages shopPages = new ShopPages();
    public TestShopPages(){
        driver = Hookss.driver;
    }
    @When("User go to page Dashboard")
    public void user_go_to_page_dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginShopPages.getMenuDashboard(),"Dashboard");
        System.out.println("User go to page Dashboard");
    }
    @And("User go back to Orders")
    public void user_go_back_to_orders() {
        shopPages.orderItem();
        System.out.println("User go back to Home");

    }
    @And("User brow product")
    public void user_brow_product() {
        shopPages.browProduct();
        System.out.println("User brow product");
    }

    @And("User pick item")
    public void user_pick_item() {
        shopPages.chooseItem();
        System.out.println("User pick item");
    }

    @And("User choose variant")
    public void user_choose_variant() {
        shopPages.chooseVariant();
        System.out.println("User choose variant");
    }

    @Then("User click button Add to Cart")
    public void user_click_button_add_to_cart() {
        Hooks.delay(1);
        shopPages.addToCart();
        Assert.assertEquals(shopPages.getTxtAdd(),"ADD TO CART");
        System.out.println("User click button Add to Cart");
    }

}
