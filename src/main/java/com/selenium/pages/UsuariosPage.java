package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsuariosPage extends BasePage{

    //Crear Usuario
    private By linkUsuarios = By.xpath("//a[contains(text(),'Usuarios')]");
    private By nuevoUsuarioButton = By.xpath("//button[@data-toggle='modal']");
    private By idModal = By.id("myModal");
    private By nombreInput = By.id("firstname");
    private By apellidoInput = By.id("lastname");
    private By emailInput = By.id("user_email");
    private By usuarioInput = By.id("user_name");
    private By passwordInput = By.id("user_password_new");
    private By confirmPasswordInput = By.id("user_password_repeat");
    private By saveButton = By.id("guardar_datos");
    private By cerrarButton = By.xpath("//button[@data-dismiss='modal']");

    //Editar Usuario
    private By idModal12 = By.id("myModal2");
    private By editNombreInput = By.id("firstname2");
    private By editApellidoInput = By.id("lastname2");
    private By editEmailInput = By.id("user_email2");
    private By editUsuarioInput = By.id("user_name2");
    private By guardarCambiosButton = By.xpath("//*[@id=\"actualizar_datos\"]");
    private By cerrarEditModalButton = By.xpath("//*[@id=\"myModal2\"]/div/div/div[3]/button[1]");

    //Cambiar Password
    private By cambiarPasswordButton = By.xpath("/html/body/div[1]/div/div[2]/div[5]/div/table/tbody/tr[2]/td[6]/span/a[2]");
    private By passwordModal = By.id("myModal3");
    private By newPasswordInput = By.id("user_password_new3");
    private By confirmPasswordInput2 = By.id("user_password_repeat3");
    private By savePasswordButton = By.xpath("//*[@id=\"actualizar_datos3\"]");
    private By cerrarPasswordModalButton = By.xpath("//*[@id=\"myModal3\"]/div/div/div[3]/button[1]");

    //Eliminar Usuario
    private By eliminarUsuarioButton = By.xpath("/html/body/div[1]/div/div[2]/div[5]/div/table/tbody/tr[2]/td[6]/span/a[3]");

    //Metodos

    //Crear Usuario
    public void clickUsuarios() {
        click(linkUsuarios);
    }

    public void clickNuevoUsuarioButton() {
        click(nuevoUsuarioButton);
    }

    public void waitUntilModalLoads() {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(idModal));
    }

    public void setNombre(String nombre) {
        set(nombreInput, nombre);
    }

    public void setApellido(String apellido) {
        set(apellidoInput, apellido);
    }

    public void setEmail(String email) {
        set(emailInput, email);
    }

    public void setUsuario(String usuario) {
        set(usuarioInput, usuario);
    }

    public void setPassword(String password) {
        set(passwordInput, password);
    }

    public void setConfirmPassword(String confirmPassword) {
        set(confirmPasswordInput, confirmPassword);
    }

    public void clickSaveButton() {
        click(saveButton);
    }

    public void clickCerrarButton() {
        click(cerrarButton);
    }

    //Editar Usuario

    public void waitUntilModalEditLoads() {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(idModal12));
    }

    public void clickEditButton() {
        By editButton = By.xpath("/html/body/div[1]/div/div[2]/div[5]/div/table/tbody/tr[2]/td[6]/span/a[1]");
        click(editButton);
    }

    public void setEditNombre(String nombre) {
        set(editNombreInput, nombre);
    }

    public void setEditApellido(String apellido) {
        set(editApellidoInput, apellido);
    }

    public void setEditEmail(String email) {
        set(editEmailInput, email);
    }

    public void setEditUsuario(String usuario) {
        set(editUsuarioInput, usuario);
    }

    public void clickGuardarCambiosButton() {
        click(guardarCambiosButton);
    }

    public void clickCerrarEditModalButton() {
        click(cerrarEditModalButton);
    }

    //Cambiar Password

    public void clickCambiarPasswordButton() {
        click(cambiarPasswordButton);
    }

    public void waitUntilPasswordModalLoads() {
        var wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordModal));
    }

    public void setNewPassword(String password) {
        set(newPasswordInput, password);
    }

    public void setConfirmPassword2(String confirmPassword) {
        set(confirmPasswordInput2, confirmPassword);
    }

    public void clickSavePasswordButton() {
        click(savePasswordButton);
    }

    public void clickCerrarPasswordModalButton() {
        click(cerrarPasswordModalButton);
    }

    //Eliminar Usuario
    public void clickEliminarUsuarioButton() {
        click(eliminarUsuarioButton);
    }

    public void confirmarEliminarUsuario() {
        driver.switchTo().alert().accept();
    }

}

