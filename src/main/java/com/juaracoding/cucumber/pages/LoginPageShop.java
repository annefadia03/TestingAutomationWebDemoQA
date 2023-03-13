package com.juaracoding.cucumber.pages;


import org.openqa.selenium.WebDriver;
import com.juaracoding.cucumber.drivers.strategies.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageShop {
    private WebDriver driver;

    public LoginPageShop() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/p/a")
    WebElement menuDismiss;

    @FindBy(xpath = "//a[normalize-space()='My Account']")
    WebElement menumyAccount;

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement menuDashboard;

    @FindBy(xpath = "//a[@title='Password Lost and Found']")
    WebElement txtError;

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
    @FindBy(xpath = "//i[@class='icon_plus']")
    WebElement qyt;
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAddCart;

    public String getMenuDashboard(){
        return menuDashboard.getText();
    }

    public String getTxtError(){
        return txtError.getText();
    }

    public void tologinpage(){
        menuDismiss.click();
        menumyAccount.click();
    }

    public void inputUsername(String username){
        this.username.sendKeys(username);
    }
    public void inputPassword(String password){
        this.password.sendKeys(password);
    }
    public void buttonLogin(){
        btnLogin.click();
    }
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
//        qyt.sendKeys("2");
    }
    public void addToCart(){
        btnAddCart.click();
    }
}
