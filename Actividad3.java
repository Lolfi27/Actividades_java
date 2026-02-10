import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto p1 = new Producto();
        Producto p2 = new Producto();

        try {
            System.out.println("=== Producto 1 ===");
            capturarDatos(sc, p1);

            System.out.println("\n=== Producto 2 ===");
            capturarDatos(sc, p2);

        } catch (Exception e) {
            System.out.println("Error en la entrada de datos.");
            return;
        }

        System.out.println("\n--- Datos del Producto 1 ---");
        p1.muestraProducto();

        System.out.println("\n--- Datos del Producto 2 ---");
        p2.muestraProducto();

        String resultado = compararProductos(p1, p2);
        System.out.println("\nProducto con mayor precio de venta:");
        System.out.println(resultado);
    }
    public static void capturarDatos(Scanner sc, Producto p) {
        System.out.print("Código: ");
        p.setCodigo(sc.next());

        System.out.print("Tipo: ");
        p.setTipo(sc.next());

        System.out.print("Descripción: ");
        p.setDescripcion(sc.next());

        System.out.print("Costo: ");
        p.setCosto(sc.nextDouble());

        System.out.print("Impuesto (%): ");
        p.setImpuesto(sc.nextDouble());
    }
    public static String compararProductos(Producto p1, Producto p2) {
        double utilidad = 20; 

        double precio1 = p1.calcularPrecio(utilidad);
        double precio2 = p2.calcularPrecio(utilidad);

        if (precio1 > precio2) {
            return "Producto con código " + p1.getCodigo() +
                   " (Precio: $" + precio1 + ")";
        } else {
            return "Producto con código " + p2.getCodigo() +
                   " (Precio: $" + precio2 + ")";
        }
    }   
}
