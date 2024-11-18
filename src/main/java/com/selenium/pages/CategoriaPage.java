package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CategoriaPage extends BasePage {

    private By linkCategoria = By.xpath("//a[contains(text(),'Categorías')]");
    private By nuevaCategoria = By.cssSelector(".btn.btn-success");
    private By nombreCategoria = By.id("nombre");
    private By descCategoria = By.id("descripcion");
    private By guardarCategoria = By.id("guardar_datos");

    private By editNombreCategoria = By.id("mod_nombre");
    private By editDescCategoria = By.id("mod_descripcion");
    private By editCategoriaButton = By.id("actualizar_datos");
    private By cerrarModal = By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div[3]/button[1]");

    private By idModal = By.id("myModal2");

    public void waitUntilModalLoads() {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(idModal));
    }

    public void clickEditCategoriaButton() {
        By editCategoria = By.xpath("//a[@data-id='13']");
        click(editCategoria);
    }

    public void clickDeleteCategoriaButton() {
        By deleteCategoria = By.xpath("//a[@data-id='13']//following-sibling::a");
        click(deleteCategoria);
    }

    public void clickCategoria() {
        click(linkCategoria);
    }

    public void clickNuevaCategoria() {
        click(nuevaCategoria);
    }

    public void setNombreCategoria(String nombre) {
        set(nombreCategoria, nombre);
    }

    public void setDescCategoria(String desc) {
        set(descCategoria, desc);
    }

    public void clickGuardarCategoria() {
        click(guardarCategoria);
    }

    public void setEditNombreCategoria(String nombre) {
        set(editNombreCategoria, nombre);
    }

    public void setEditDescCategoria(String desc) {
        set(editDescCategoria, desc);
    }

    public void clickEditCategoria() {
        click(editCategoriaButton);
    }

    public void clickCerrarModal() {
        click(cerrarModal);
    }

    public void clickConfirmationAlertButton() {
        driver.switchTo().alert().accept();
    }
}
