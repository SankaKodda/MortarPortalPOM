package com.mortarportal.qa.pages;

import com.mortarportal.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AIAnalytics extends TestBase {

    @FindBy(xpath = "xpath=//h1[contains(text(),'Analytics')]")
    WebElement analyticsLabel;
    @FindBy(xpath = "xpath=//li[contains(text(),'B&M-SankaXYZ')]")
    WebElement businessOwnerID;
    @FindBy(id = "ngb-nav-0")
    WebElement customerChurnPredictionLink;

    public AIAnalytics(){
        PageFactory.initElements(driver, this);
    }
    public String verifyAIAnalyticsPageTitle(){
        return driver.getTitle();
    }
    public boolean validateAIAnalyticsHeader(){
        return analyticsLabel.isDisplayed();
    }
    public boolean validateAIAnalyticsText(){
        return businessOwnerID.isDisplayed();
    }

}
