package com.mortarportal.qa.testcases;

import com.mortarportal.qa.base.TestBase;
import com.mortarportal.qa.pages.Dashboard;
import com.mortarportal.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    Dashboard dashboard;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Mortar - Web Portal");
    }

    @Test(priority = 2)
    public void loginPageImageTest() {
        boolean pic = loginPage.validateLoginPageImage();
        Assert.assertTrue(pic);
    }

    @Test(priority = 3)
    public void loginTest(){
       dashboard = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
