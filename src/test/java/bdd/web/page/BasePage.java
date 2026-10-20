package bdd.web.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.model.environment.SystemEnvironmentVariables;

import java.time.Duration;

public class BasePage extends PageObject {
    public void abrirPagina() {
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get(SystemEnvironmentVariables.createEnvironmentVariables().getProperty("environments.default.url"));
    }
}
