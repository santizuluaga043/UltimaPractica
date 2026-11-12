package Biblio;

import java.util.Scanner;
import java.util.Optional;

public class Main {

    // METODO PRINCIPAL
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InventarioLibros inventario = new InventarioLibros();

        LibroFisico libro1 = new LibroFisico("001", "La Casa de los Espiritus", "Isabella Allende", "Realismo magico", 10.00, 3, "Bueno");
        LibroFisico libro2 = new LibroFisico("002", "La Odisea", "Homero", "Fantasia", 8.00, 2, "Regular");

        inventario.agregarLibro(libro1);
        inventario.agregarLibro(libro2);

        int opcion;

        do{
            System.out.println("\nLibreria");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Buscar por codigo");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    inventario.mostrarLibros();
                    break;
                case 2:
                    System.out.print("Codigo: ");
                    String codigo = sc.nextLine();

                    Libro resultado = inventario.buscarPorCodigo(codigo);

                    if (resultado != null) {
                        System.out.println(resultado);
                    } else {
                        System.out.println("No encontrado");
                    }
                    break;


                case 0:
                    System.out.println("Hasta luego");
                    break;

                // DEFAULT: OPCION INVALIDA
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
        sc.close();
    }
}