package com.bdd.stepdefinition;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SauceDemoStepsDefinitions {

        private SauceDemoPage sauceDemoPage;
@Before

        public void estoyEnLaPaginaDeProductos() {
            sauceDemoPage.open();
        }
@Test
        public void anadoProductoAlCarrito(String producto) {
            sauceDemoPage.addProductToCart(producto);
        }
@After
    public void elCarritoDebeContenerProductos(int cantidadProductos) {
        int productosEnCarrito = sauceDemoPage.getCartItemCount();
        Assert.assertEquals(cantidadProductos, productosEnCarrito);
        }
    }

