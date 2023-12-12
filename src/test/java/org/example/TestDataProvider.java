package org.example;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
    @DataProvider(name = "loginData")
    public static Object[][] loginData(){
        return new Object[][] {
                {"0977000001","abc1234"}
        };
    }
}
