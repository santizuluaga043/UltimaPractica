package Biblio;

import java.util.ArrayList;

public class InventarioLibros {
    private ArrayList<Libro> libros;

    public InventarioLibros(){
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public Libro buscarPorCodigo(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }
}
