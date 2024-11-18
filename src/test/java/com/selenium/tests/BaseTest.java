package com.selenium.tests;

import com.selenium.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basepage;
    protected LoginPage loginPage;
    protected StockPage stockPage;
    protected CategoriaPage categoriaPage;
    protected UsuariosPage usuariosPage;
    private String url = "http://localhost/Control/login.php";

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Se ejecuta antes de cada test
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basepage = new BasePage();
        basepage.setDriver(driver);
        loginPage = new LoginPage();
        stockPage = new StockPage();
        categoriaPage = new CategoriaPage();
        usuariosPage = new UsuariosPage();
    }

    // Se ejecuta después de cada test
    @AfterClass
    public void tearDown() {
        delay(5000);
        driver.quit();
    }
}
