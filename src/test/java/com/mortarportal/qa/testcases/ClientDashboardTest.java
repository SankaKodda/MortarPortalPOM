/*
package com.mortarportal.qa.testcases;

import com.mortarportal.qa.base.TestBase;
import com.mortarportal.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClientDashboardTest extends TestBase {
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ClientDashboard clientDashboard;
    BusinessOverview businessOverview;
    AIAnalytics aiAnalytics;
    MyCustomer myCustomer;
    Intergrations intergrations;
//    EmailsAndJourneys emailsAndJourneys;
//    SocialAndDisplayAdvertising socialAndDisplayAdvertising;
//    DigitalMediaBuying digitalMediaBuying;
//    MyCreatives myCreatives;

    public ClientDashboardTest() {
        super();
    }
    //  Test Case should be Separated -- independent with each other
    //  before each test case -- launch the browser and login
    //  @test -- execute test cases
    //  after each test case -- close the browser
//    @BeforeMethod
//    public void setUp() {
//        initialization();
//        loginPage = new LoginPage();
//        dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//        clientDashboard = dashboardPage.clickOnGoToClientsBusinessOverView();
//    }

    @Test(priority = 1)
    public void verifiedClientDashboardTest() {
//        testUtil.switchToFrame();
        Assert.assertTrue(clientDashboard.verifyClientDashboardText());
    }
    @Test(priority = 2)
    public void verifiedBusinessOwnerIDTest() {
//        testUtil.switchToFrame();
//        Assert.assertTrue(clientDashboard.verifyBusinessOwnerID("B&M-SankaXYZ"));
        Assert.assertTrue(clientDashboard.verifyBusinessOwnerID(prop.getProperty("brandName")));
    }
    @Test(priority = 3)
    public void verifiedClickGoToBusinessOverviewTest(){
//        testUtil.switchToFrame();
        businessOverview = clientDashboard.clickOnGoToBusinessOverview();
    }
    @Test(priority = 4)
    public void verifiedClickGoToAIAnalyticsTest(){
//        testUtil.switchToFrame();
        aiAnalytics = clientDashboard.clickOnGoToAIAnalytics();
    }
    @Test(priority = 5)
    public void verifiedClickGoToMyCustomerTest(){
//        testUtil.switchToFrame();
        myCustomer = clientDashboard.clickOnGoToMyCustomer();
    }
    @Test(priority = 6)
    public void verifiedClickGoToIntegrationsTest(){
//        testUtil.switchToFrame();
        intergrations = clientDashboard.clickOnGoToIntergrations();
    }
    @Test(priority = 7)
    public void verifiedClickGoToEmailsAndJourneysTest(){
//        testUtil.switchToFrame();
        emailsAndJourneys = clientDashboard.clickOnGoToEmailsAndJourneys();
    }
    @Test(priority = 8)
    public void verifiedClickGoToSocialAndDisplayAdvertisingTest(){
//        testUtil.switchToFrame();
        socialAndDisplayAdvertising = clientDashboard.clickOnGoToSocialAndDisplayAdvertising();
    }
    @Test(priority = 9)
    public void verifiedClickGoToDigitalMediaBuyingTest(){
//        testUtil.switchToFrame();
        digitalMediaBuying = clientDashboard.clickOnGoToDigitalMediaBuying();
    }
    @Test(priority = 10)
    public void verifiedClickGoToMyCreativesTest(){
//        testUtil.switchToFrame();
        myCreatives = clientDashboard.clickOnGoToMyCreatives();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
*/
