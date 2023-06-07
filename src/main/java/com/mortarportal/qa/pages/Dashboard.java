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

    @FindBy(xpath= "//tr[1]/td[3]/button")
    WebElement goToSearchedClient;

    @FindBy(id = "search")
    WebElement placeholderSearchClient;

    @FindBy(xpath="//button[contains(text(),'Search')]")
    WebElement brandSearchButton;

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

    public void searchABrand(String brandName){
         placeholderSearchClient.sendKeys(brandName);
    }
    public void clickBrandSearchButton(){
        brandSearchButton.click();
    }


    public ClientDashboard clickOnGoToClientDashboard(){
        goToClientDashboardButton.click();
        return new ClientDashboard();
    }

    public ClientDashboard clickOnGoToSearchedClientDashboard(){
        goToSearchedClient.click();
        return new ClientDashboard();
    }
}
