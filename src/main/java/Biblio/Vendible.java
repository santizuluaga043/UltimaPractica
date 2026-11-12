package Biblio;

public interface Vendible {

    // METODO PARA COMPROBAR STOCK
    boolean hayStock();

    // METODO PARA VENDER
    void vender() throws StockInsuficienteException;
}
