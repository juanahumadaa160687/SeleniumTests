package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    // Se declara la variable driver como estática para que pueda ser accedida desde cualquier parte del proyecto
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    // Metodo para encontrar un elemento
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Metodo para escribir en un campo de texto
    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    // Metodo para hacer clic en un elemento
    protected void click(By locator) {
        find(locator).click();
    }
}
