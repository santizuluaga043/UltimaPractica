package Biblio;

public class LibroFisico extends Libro implements Vendible{

    private String estado;

    public LibroFisico(String codigo, String titulo, String autor, String genero, double precio, int stock, String estado){
        super(codigo, titulo, autor, genero, precio, stock);
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }

    @Override
    public boolean hayStock() {
        return getStock() > 0;
    }

    @Override
    public String getTipo(){
        return("Fisico");
    }

    @Override
    public void vender() throws StockInsuficienteException {

        // VALIDAR SI HAY STOCK
        if (!hayStock()) {
            throw new StockInsuficienteException(
                    "No hay stock de " + getTitulo());
        }

        // REDUCIR STOCK
        reducirStock();
    }
}
