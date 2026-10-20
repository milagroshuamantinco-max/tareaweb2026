package bdd.web.step;

import bdd.web.page.StorePage;

public class StorePageStep {

    StorePage storePage;

    public void seleccionarCategoria(String categoria, String subcategoria) {
        storePage.seleccionarProducto(categoria, subcategoria);
    }

    public void seleccionarProducto() {
        storePage.seleccionarProducto();
    }

    public String obtengoTituloPopup() {
        return storePage.obtenerTituloModal();
    }

    public String obtengoCantidadProductos() {
        return storePage.obtenerCantidadModal();
    }

    public void finalizarCompra() {
        storePage.clickFinalizarCompra();
    }
}
