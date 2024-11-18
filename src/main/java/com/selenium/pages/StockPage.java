package com.selenium.pages;

import jdk.jfr.Timespan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StockPage extends BasePage {

    private By openModalButton = By.cssSelector(".btn.btn-success");
    private By codigoField = By.id("codigo");
    private By nombreField = By.id("nombre");
    private By precioField = By.id("precio");
    private By stockField = By.id("stock");
    private By guardarButton = By.id("guardar_datos");
    private By cerrarButton = By.className("close");
    private By modalContent = By.className("modal-content");


    public void waitUntilModalLoads() {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalContent));
    }

    public void clickOpenModal() {
        click(openModalButton);
    }

    public void setCodigo(String codigo) {
        set(codigoField, codigo);
    }

    public void setNombre(String nombre) {
        set(nombreField, nombre);
    }

    public void setPrecio(String precio) {
        set(precioField, precio);
    }

    public void setStock(String stock) {
        set(stockField, stock);
    }

    public void setCategoria(String categoria) {
        WebElement selectCategoria = driver.findElement(By.id("categoria"));
        Select select = new Select(selectCategoria);
        select.selectByVisibleText(categoria);
    }

    public void clickGuardar() {
        click(guardarButton);
    }

    public void clickCerrar() {
        click(cerrarButton);
    }
}
