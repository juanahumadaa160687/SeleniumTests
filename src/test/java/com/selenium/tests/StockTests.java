package com.selenium.tests;

import org.testng.annotations.Test;

public class StockTests extends BaseTest{

    //Creación de nuevo producto
    @Test
    public void testNewStock() {
        loginPage.login("admin", "admin");
        stockPage.clickOpenModal();
        stockPage.waitUntilModalLoads();
        stockPage.setCodigo("123");
        stockPage.setNombre("Producto 1");
        stockPage.setPrecio("100");
        stockPage.setStock("10");
        stockPage.setCategoria("Herramientas");
        stockPage.clickGuardar();
        delay(3000);
        stockPage.clickCerrar();
    }

    //Edición de producto
    @Test
    public void testEditStock() {
        loginPage.login("admin", "admin");
        stockPage.clickProducto();
        stockPage.clickOpenModalEditButton();
        stockPage.waitUntilModalLoads();
        stockPage.setEditarCodigo("123456");
        stockPage.setModCategoria("Herramientas");
        stockPage.clickGuardarEditar();
        delay(3000);
        stockPage.clickCerrarModal();
    }

    //Eliminación de producto
    @Test
    public void testDeleteStock() {
        loginPage.login("admin", "admin");
        stockPage.clickProducto();
        stockPage.clickDeleteStockButton();
        stockPage.clickConfirmationAlertButton();
        delay(3000);
    }
}
