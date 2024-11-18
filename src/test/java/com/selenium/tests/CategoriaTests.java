package com.selenium.tests;

import org.testng.annotations.Test;

public class CategoriaTests extends BaseTest {

    @Test
    public void testCategoria() {
        loginPage.login("admin", "admin");
        categoriaPage.clickCategoria();
        categoriaPage.clickNuevaCategoria();
        stockPage.waitUntilModalLoads();
        categoriaPage.setNombreCategoria("Categoria 1");
        categoriaPage.setDescCategoria("Descripción 1");
        categoriaPage.clickGuardarCategoria();
        delay(3000);
    }

    @Test
    public void testCategoriaEdit() {
        loginPage.login("admin", "admin");
        categoriaPage.clickCategoria();
        categoriaPage.clickEditCategoriaButton();
        categoriaPage.waitUntilModalLoads();
        categoriaPage.setEditNombreCategoria("Categoria 2");
        categoriaPage.clickEditCategoria();
        delay(3000);
        categoriaPage.clickCerrarModal();
    }

    @Test
    public void testCategoriaDelete() {
        loginPage.login("admin", "admin");
        categoriaPage.clickCategoria();
        categoriaPage.clickDeleteCategoriaButton();
        categoriaPage.clickConfirmationAlertButton();
        delay(3000);
    }
}
