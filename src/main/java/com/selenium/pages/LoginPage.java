package com.selenium.pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By username = By.name("user_name");
    private By password = By.name("user_password");
    private By loginButton = By.id("submit");
    private By errorMessage = By.cssSelector(".alert.alert-danger");

    public void setUsername(String username) {
        set(this.username, username);
    }

    public void setPassword(String password) {
        set(this.password, password);
    }

    public StockPage clickLogin() {
        click(loginButton);
        return new StockPage();
    }

    public StockPage login(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLogin();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }
}
