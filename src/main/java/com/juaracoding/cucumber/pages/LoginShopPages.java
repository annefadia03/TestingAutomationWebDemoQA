package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.strategies.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginShopPages {
    private WebDriver driver;

    public LoginShopPages() {
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
}
