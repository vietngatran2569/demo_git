package org.example;

import org.example.Page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "src/main/java/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get("https://www.redtag.ca/");
        loginPage = new LoginPage(driver);
    }

    //ko su sung data provider
//    @Test
//    public void testLoginValidUser(){
//        loginPage.clickLogin();
//        loginPage.enterUsername("0977000001");
//        loginPage.enterPassword("abc1234");
//    }

    //su dung data provider
//    @Test(dataProvider = "loginData", dataProviderClass = TestDataProvider.class)
//    public void testLoginValidUser(String username,String pw){
//        loginPage.clickLogin();
//        loginPage.enterUsername(username);
//        loginPage.enterPassword(pw);
//    }

    //su dung data provider với file excel
    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)
    public void testLoginValidUser(String username,String pw){
        loginPage.clickLogin();
        loginPage.enterUsername(username);
        loginPage.enterPassword(pw);
    }


    @AfterClass
    public void tearDown(){
        loginPage.close();
    }

}
