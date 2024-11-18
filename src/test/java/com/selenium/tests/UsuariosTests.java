package com.selenium.tests;

import org.testng.annotations.Test;

public class UsuariosTests extends BaseTest{

    //Creación de nuevo usuario
    @Test
    public void testCrearUsuario() {
        loginPage.login("admin", "admin");
        usuariosPage.clickUsuarios();
        usuariosPage.clickNuevoUsuarioButton();
        usuariosPage.waitUntilModalLoads();
        usuariosPage.setNombre("Juan");
        usuariosPage.setApellido("Perez");
        usuariosPage.setEmail("perez@example.com");
        usuariosPage.setUsuario("jperez");
        usuariosPage.setPassword("123456");
        usuariosPage.setConfirmPassword("123456");
        usuariosPage.clickSaveButton();
        delay(3000);
        usuariosPage.clickCerrarButton();
    }

    //Creación de nuevo usuario con contraseña incorrecta
    @Test
    public void testCrearUsuarioPassword() {
        loginPage.login("admin", "admin");
        usuariosPage.clickUsuarios();
        usuariosPage.clickNuevoUsuarioButton();
        usuariosPage.waitUntilModalLoads();
        usuariosPage.setNombre("Juan");
        usuariosPage.setApellido("Perez");
        usuariosPage.setEmail("perez@example.com");
        usuariosPage.setUsuario("jperez");
        usuariosPage.setPassword("123456");
        usuariosPage.setConfirmPassword("123459");
        usuariosPage.clickSaveButton();
        delay(3000);
        usuariosPage.clickCerrarButton();
    }

    //Creación de nuevo usuario repetido
    @Test
    public void testCrearUsuarioRepetido() {
        loginPage.login("admin", "admin");
        usuariosPage.clickUsuarios();
        usuariosPage.clickNuevoUsuarioButton();
        usuariosPage.waitUntilModalLoads();
        usuariosPage.setNombre("Juan");
        usuariosPage.setApellido("Perez");
        usuariosPage.setEmail("perez@example.com");
        usuariosPage.setUsuario("jperez");
        usuariosPage.setPassword("123456");
        usuariosPage.setConfirmPassword("123456");
        usuariosPage.clickSaveButton();
        delay(3000);
        usuariosPage.clickCerrarButton();
    }

    //Editar Usuario
    @Test
    public void testEditarUsuario() {
        loginPage.login("admin", "admin");
        usuariosPage.clickUsuarios();
        usuariosPage.clickEditButton();
        usuariosPage.waitUntilModalEditLoads();
        usuariosPage.setEditUsuario("jperezC");
        usuariosPage.clickGuardarCambiosButton();
        delay(3000);
        usuariosPage.clickCerrarEditModalButton();
    }

    //Cambiar Contraseña
    @Test
    public void testCambiarPassword() {
        loginPage.login("admin", "admin");
        usuariosPage.clickUsuarios();
        usuariosPage.clickCambiarPasswordButton();
        usuariosPage.waitUntilPasswordModalLoads();
        usuariosPage.setNewPassword("1234567");
        usuariosPage.setConfirmPassword2("1234567");
        usuariosPage.clickSavePasswordButton();
        delay(3000);
        usuariosPage.clickCerrarPasswordModalButton();
    }

    //Eliminar Usuario
    @Test
    public void testEliminarUsuario() {
        loginPage.login("admin", "admin");
        usuariosPage.clickUsuarios();
        usuariosPage.clickEliminarUsuarioButton();
        usuariosPage.confirmarEliminarUsuario();
        delay(3000);
    }
}
