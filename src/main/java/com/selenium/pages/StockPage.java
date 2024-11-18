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

    // Locators
    private By openModalButton = By.cssSelector(".btn.btn-success");
    private By codigoField = By.id("codigo");
    private By nombreField = By.id("nombre");
    private By precioField = By.id("precio");
    private By stockField = By.id("stock");
    private By guardarButton = By.id("guardar_datos");
    private By cerrarButton = By.className("close");
    private By modalContent = By.className("modal-content");

    //Eliminar producto
    private By productoButton = By.xpath("//a[@class='thumbnail']");
    private By eliminarButton = By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div[1]/a[1]");

    //Editar producto
    private By openModalEditButton = By.xpath("//a[@class='btn btn-info']");
    private By editarCodigoField = By.id("mod_codigo");
    private By editarNombreField = By.id("mod_nombre");
    private By editarPrecioField = By.id("mod_precio");
    private By guardarEditarButton = By.xpath("//*[@id=\"actualizar_datos\"]");
    private By editModalContent = By.id("myModal2");
    private By cerrarModalButton = By.xpath("//*[@id=\"myModal2\"]/div/div/div[3]/button[1]");



    //Esperar a que el modal cargue
    public void waitUntilModalLoads() {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(editModalContent));
    }

    // Actions
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

    public void clickProducto() {
        click(productoButton);
    }

    public void setModCategoria(String categoria) {
        WebElement selectModCategoria = driver.findElement(By.id("mod_categoria"));
        Select select = new Select(selectModCategoria);
        select.selectByVisibleText(categoria);
    }

    public void clickOpenModalEditButton() {
        click(openModalEditButton);
    }

    public void setEditarCodigo(String codigo) {
        set(editarCodigoField, codigo);
    }

    public void setEditarNombre(String nombre) {
        set(editarNombreField, nombre);
    }

    public void setEditarPrecio(String precio) {
        set(editarPrecioField, precio);
    }

    public void clickGuardarEditar() {
        click(guardarEditarButton);
    }

    public void clickCerrarModal() {
        click(cerrarModalButton);
    }

    public void clickDeleteStockButton() {
        click(eliminarButton);
    }

    public void clickConfirmationAlertButton() {
        driver.switchTo().alert().accept();
    }
}
