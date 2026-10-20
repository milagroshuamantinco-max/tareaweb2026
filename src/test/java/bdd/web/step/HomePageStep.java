package bdd.web.step;

import bdd.web.page.HomePage;

public class HomePageStep {

    HomePage homePage;

    public void iniciarPagina() {
        homePage.abrirPagina();
    }

    public void iniciarSesion(String usuario, String password) {
        homePage.loginUsuario(usuario, password);
    }

    public Boolean loginExitoso() {
        return homePage.loginExitoso();
    }

}
