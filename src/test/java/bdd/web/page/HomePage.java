package bdd.web.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Iniciar sesión')]")
    private WebElement buttonIniciarSesion;
    @FindBy(xpath = "//input[@id='field-email']")
    private WebElement inputEmail;
    @FindBy(xpath = "//input[@id='field-password']")
    private WebElement inputPassword;
    @FindBy(xpath = "//button[@id='submit-login']")
    private WebElement buttonLogin;
    @FindBy(xpath = "(//div[@id='_desktop_user_info']//div//a)[2]")
    private WebElement infoUsuario;

    public void loginUsuario(String email, String password) {
        buttonIniciarSesion.click();
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        buttonLogin.click();
    }

    public Boolean loginExitoso() {
        return infoUsuario.isDisplayed();
    }

}
