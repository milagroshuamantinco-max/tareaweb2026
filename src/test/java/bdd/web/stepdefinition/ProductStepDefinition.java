package bdd.web.stepdefinition;

import bdd.web.step.CartPageStep;
import bdd.web.step.HomePageStep;
import bdd.web.step.StorePageStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class ProductStepDefinition {

    @Steps
    HomePageStep homePageStep;
    @Steps
    StorePageStep storePageStep;
    @Steps
    CartPageStep cartPageStep;

    @Given("estoy en la página de la tienda")
    public void ingreso_a_google() {
        homePageStep.iniciarPagina();
    }

    @And("me logueo con mi usuario {string} y clave {string}")
    public void iniciarSesion(String usuario, String password) {
        homePageStep.iniciarSesion(usuario, password);
        Assert.assertTrue("No se ha iniciado sesión correctamente", homePageStep.loginExitoso());
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void seleccionarCategoriaYSubcategoria(String categoria, String subcategoria) {
        storePageStep.seleccionarCategoria(categoria, subcategoria);
    }

    @And("agrego 2 unidades del primer producto al carrito")
    public void agregarProductoAlCarrito() {
        storePageStep.seleccionarProducto();
    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void validarConfirmacionProducto() {
        Assert.assertEquals("\uE876Producto añadido correctamente a su carrito de compra", storePageStep.obtengoTituloPopup());
    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validarMontoTotal() {
        Assert.assertEquals("2", storePageStep.obtengoCantidadProductos());
    }

    @When("finalizo la compra")
    public void finalizarCompra() {
        storePageStep.finalizarCompra();
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validarTituloPaginaCarrito() {
        Assert.assertTrue("No se muestra el título del carrito", cartPageStep.obtengoTituloCarrito());
    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void validarPreciosEnElCarrito() {
        Assert.assertTrue("No se muestra el precio total en el carrito", cartPageStep.obtengoPrecioTotal());
    }


}
