package org.example.Page;

import org.example.Test.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private  By usernameInput = By.id("Email");
    private  By passwordInput = By.id("Password");
    private  By loginButton = By.id("signinid");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void enterUsername(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }


}
