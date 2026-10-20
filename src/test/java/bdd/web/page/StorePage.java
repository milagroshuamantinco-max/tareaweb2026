package bdd.web.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StorePage extends BasePage {

    String buttonCategoria = "//a[contains(normalize-space(), '%s')]";
    String buttonSubcategoria = "(//a[contains(normalize-space(), '%s')])[2]";

    @FindBy(xpath = "//article[@data-id-product=1]")
    private WebElement producto;
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    private WebElement inputCantidad;
    @FindBy(xpath = "//button[@data-button-action='add-to-cart']")
    private WebElement buttonAgregarAlCarrito;
    @FindBy(xpath = "//h4[@id='myModalLabel']")
    private WebElement modalTitulo;
    @FindBy(xpath = "//span[contains(normalize-space(),'Cantidad')]//strong")
    private WebElement modalCantidad;
    @FindBy(xpath = "//a[contains(normalize-space(),'Finalizar compra')]")
    private WebElement buttonFinalizarCompra;

    public void seleccionarProducto() {
        producto.click();
        inputCantidad.click();
        inputCantidad.sendKeys(Keys.BACK_SPACE);
        inputCantidad.sendKeys("2");
        buttonAgregarAlCarrito.click();
    }

    public void clickFinalizarCompra() {
        buttonFinalizarCompra.click();
    }

    public String obtenerTituloModal() {
        return modalTitulo.getText();
    }

    public String obtenerCantidadModal() {
        return modalCantidad.getText();
    }

    public void seleccionarProducto(String categoria, String subcategoria) {
        seleccionarCategoria(categoria).click();
        seleccionarSubcategoria(subcategoria).click();
    }

    public WebElement seleccionarCategoria(String categoria) {
        return getDriver().findElement(By.xpath(String.format(buttonCategoria, categoria)));
    }

    public WebElement seleccionarSubcategoria(String subcategoria) {
        return getDriver().findElement(By.xpath(String.format(buttonSubcategoria, subcategoria)));
    }
}
