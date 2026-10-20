package bdd.web.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Carrito']")
    private WebElement tituloCarrito;

    @FindBy(xpath = "//div[@id='content-wrapper']//span[text()='Total (impuestos incl.)']/following-sibling::*")
    private WebElement precioTotal;

    public Boolean obtengoTituloCarrito() {
        return tituloCarrito.isDisplayed();
    }

    public Boolean obtengoPrecioTotal() {
        return precioTotal.isDisplayed();
    }
}
