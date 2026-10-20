package bdd.web.step;

import bdd.web.page.CartPage;

public class CartPageStep {

    CartPage cartPage;

    public Boolean obtengoTituloCarrito() {
        return cartPage.obtengoTituloCarrito();
    }

    public Boolean obtengoPrecioTotal() {
        return cartPage.obtengoPrecioTotal();
    }
}
