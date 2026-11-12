package Biblio;

public abstract class Libro {
    protected String codigo;
    protected String titulo;
    protected String autor;
    protected String genero;
    protected double precio;
    protected int stock;

    public Libro(String codigo, String titulo, String autor, String genero, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getGenero(){
        return genero;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return codigo + " - " + titulo + " - $" + precio + "Stock: " + stock + " - Tipo: " + getTipo();
    }

    protected void reducirStock() {
        stock--;
    }
}
