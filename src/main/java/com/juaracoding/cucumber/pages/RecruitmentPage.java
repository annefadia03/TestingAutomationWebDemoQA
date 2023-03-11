package com.juaracoding.cucumber.pages;


import com.juaracoding.cucumber.drivers.strategies.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPage {
    private WebDriver driver;

    public RecruitmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement btnRecruitment;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement txtTitleAdd;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement inputFirstName;

    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement inputMidleName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement inputLastName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement inputVacancy;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement inputEmail;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")
    WebElement inputNumberHP;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/input")
    WebElement inputDoc;

    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement inputNote;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input")
    WebElement inputDate;

    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    WebElement inputDesc;

    @FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement btnCeklis;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;

    public void addDataCandidate(){
        inputFirstName.sendKeys("Anne");
        inputMidleName.sendKeys("Fadia");
        inputLastName.sendKeys("Ikhfa");
        inputVacancy.sendKeys("Senior QA Lead");
        inputEmail.sendKeys("annefadia143@gmail.com");
        inputNumberHP.sendKeys("0822843006");
        inputDoc.sendKeys("D:\\New DOCX Document.docx");
        inputNote.sendKeys("sangjuara");
        inputDate.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
        inputDate.sendKeys("2023-03-11");
        inputDesc.sendKeys("anne sukses");
        btnCeklis.click();
        btnSubmit.click();
    }
    public String getJudulAddPage(){
        return txtTitleAdd.getText();
    }

    public void addDataPage(){
        btnAdd.click();
    }
    public void recruitmentPage(){
        btnRecruitment.click();
    }
}