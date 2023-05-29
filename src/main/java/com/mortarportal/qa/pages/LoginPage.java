package com.mortarportal.qa.pages;

import com.mortarportal.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    //Page Factory - OR:
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    WebElement signUpBtn;

    @FindBy(xpath = "//img[contains(@class,'ui header ellipsis')]")
    WebElement mortarLogo;

    //Initializing Page Objects
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    //Actions
    public String validateLoginPageTitle() {
        return driver.getTitle();
    }
    public boolean validateLoginPageImage(){
        return mortarLogo.isDisplayed();
    }
    public Dashboard login(String uname, String pwd){
        username.sendKeys(uname);
        password.sendKeys(pwd);
        loginBtn.click();
        return new Dashboard();
    }
}
