package com.mortarportal.qa.pages;

import com.mortarportal.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends TestBase {
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashboardLabel;
   // xpath=//h1[contains(.,'Dashboard')]

    //B&M-SankaXYZ Button to go to dashboard
    @FindBy(xpath="//tr[4]/td[3]/button")
    WebElement goToClientDashboardButton;

    @FindBy(id = "search")
    WebElement placeholderSearchClient;

    //Initializing the Page Objects;
    public Dashboard(){
        PageFactory.initElements(driver, this);
    }

    public String verifyDashboardPageTitle(){
        return driver.getTitle();
    }
    public boolean verifyDashboardText(){
        return dashboardLabel.isDisplayed();
    }

    public ClientDashboardPage clickOnGoToClientDashboard(){
        goToClientDashboardButton.click();
        return new ClientDashboardPage();
    }

}
