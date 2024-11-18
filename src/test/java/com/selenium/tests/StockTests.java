package com.selenium.tests;

import org.testng.annotations.Test;

public class StockTests extends BaseTest{

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
}
