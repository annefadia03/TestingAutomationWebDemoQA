package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.strategies.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPages {
    private WebDriver driver;
    public ShopPages() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[normalize-space()='Orders']")
    WebElement menuOrders;
    @FindBy(xpath = "//a[@class='woocommerce-Button button']")
    WebElement browProduct;
    @FindBy(xpath = "//a[normalize-space()='black pointed toe barely there patent heels']")
    WebElement txtProduct;
    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement color;
    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement size;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAddCart;

    public String getTxtAdd(){
        return btnAddCart.getText();
    }
    public void orderItem(){
        menuOrders.click();
    }
    public void browProduct(){
        browProduct.click();
    }
    public void chooseItem(){
        txtProduct.click();
    }
    public void chooseVariant(){
        color.sendKeys("Black");
        size.sendKeys("36");
    }
    public void addToCart(){
        btnAddCart.click();
    }
}
