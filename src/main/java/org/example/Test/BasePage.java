package org.example.Test;

import org.openqa.selenium.WebDriver;

public abstract class BasePage implements Page {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void open() {

    }
    public void close() {
        driver.quit();
    }
}
