import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String var1 = sc.nextLine();
        if ( var1.equalsIgnoreCase("diego")) {
            System.out.println("Hola, creador.");
        } else {
            System.out.println("Hola, desconocido");
        }
          
        int[] pares = new int[50];

        int indice = 0;

        for (int i = 2; i <= 100; i += 2) {
            pares[indice] = i;
            indice++;
        }
        System.out.println("Números pares del 2 al 100:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }
}