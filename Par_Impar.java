import java.util.Scanner;

public class Par_Impar {   
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();

        if (esPar(num)) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
}
