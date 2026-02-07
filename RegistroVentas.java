import java.util.Scanner;

public class RegistroVentas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double total = capturarVentas(sc, contador);
    }

    public static double capturarVentas(Scanner sc, int contador) {
        double venta;
        double total = 0;
        int cantidadVentas = 0;

        System.out.println("Ingrese ventas (-1 para terminar):");

        do {
            venta = sc.nextDouble();
            if (venta != -1) {
                total += venta;
                cantidadVentas++;
            }
        } while (venta != -1);

        mostrarResultados(total, cantidadVentas);
        return total;
    }

    public static double calcularPromedio(double total, int cantidad) {
        if (cantidad == 0) {
            return 0;
        }
        return total / cantidad;
    }

    public static void mostrarResultados(double total, int cantidadVentas) {
        double promedio = calcularPromedio(total, cantidadVentas);

        System.out.println("Total vendido: " + total);
        System.out.println("Número de ventas: " + cantidadVentas);
        System.out.println("Promedio de ventas: " + promedio);
    }
    
}
