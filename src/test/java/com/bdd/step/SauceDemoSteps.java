package com.bdd.step;

import com.bdd.stepdefinition.SauceDemoStepsDefinitions;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class SauceDemoSteps {

    @Steps
    private SauceDemoStepsDefinitions sauceDemoStepsDefinitions;

    @Dado("^Estoy en la página de productos$")
    public void estoyEnLaPaginaDeProductos() {
        sauceDemoStepsDefinitions.estoyEnLaPaginaDeProductos();
    }

    @Cuando("^Añado \"([^\"]*)\" al carrito$")
    public void anadoProductoAlCarrito(String producto) {
        sauceDemoStepsDefinitions.anadoProductoAlCarrito(producto);
    }

    @Entonces("^El carrito debe contener (\\d+) productos$")
    public void elCarritoDebeContenerProductos(int cantidadProductos) {
        sauceDemoStepsDefinitions.elCarritoDebeContenerProductos(cantidadProductos);
    }
}



