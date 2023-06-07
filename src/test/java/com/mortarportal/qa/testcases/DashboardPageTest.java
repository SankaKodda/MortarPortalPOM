package com.mortarportal.qa.testcases;

import com.mortarportal.qa.base.TestBase;
import com.mortarportal.qa.pages.ClientDashboard;
import com.mortarportal.qa.pages.Dashboard;
import com.mortarportal.qa.pages.LoginPage;

import com.mortarportal.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardPageTest extends TestBase {
    LoginPage loginPage;
    Dashboard dashboard,dashboard1;
    TestUtil testUtil;
    ClientDashboard clientDashboard;

    public DashboardPageTest() {
        super();
    }

    //  Test Case should be Separated -- independent with each other
    //  before each test case -- launch the browser and login
    //  @test -- execute test cases
    //  after each test case -- close the browser
    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        clientDashboard = new ClientDashboard();
        loginPage = new LoginPage();
        dashboard = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//        clientDashboard = dashboard.clickOnGoToClientDashboard();
    }

    @Test(priority = 1)
    public void verifyDashboardPageTitleTest() {
        String dashboardTitle = dashboard.verifyDashboardPageTitle();
        Assert.assertEquals(dashboardTitle, "Mortar - Web Portal", "Home page Title is not matched");
    }

    @Test(priority = 2)
    public void verifyDashboardTextTest() {
//        testUtil.switchToFrame();
        Assert.assertTrue(dashboard.verifyDashboardText());
    }

    @Test(priority = 3)
    public void verifySearchABrandTest() {
//        testUtil.switchToFrame();
        dashboard.searchABrand("B&M-SankaXYZ");
    }

    @Test(priority = 4)
    public void verifyClickGoToClientDashboardTest() {
//        testUtil.switchToFrame();
        clientDashboard = dashboard.clickOnGoToClientDashboard();
    }

    @Test(priority = 5)
    public void verifySearchABrandAndGoToClientDashboard() {
        dashboard.searchABrand("B&M-SankaXYZ2");
        dashboard1.clickBrandSearchButton();
        clientDashboard = dashboard.clickOnGoToSearchedClientDashboard();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
