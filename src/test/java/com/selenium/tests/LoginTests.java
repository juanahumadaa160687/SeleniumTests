package com.selenium.tests;

import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testLogin() {
        loginPage.setUsername("admin");
        loginPage.setPassword("admin");
        loginPage.clickLogin();
        delay(3000);
    }

    @Test
    public void testLoginError() {
        loginPage.setUsername("admin");
        loginPage.setPassword("12345");
        loginPage.clickLogin();
        delay(3000);
        loginPage.getErrorMessage();
    }
}