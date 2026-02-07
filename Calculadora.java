import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int opcion;
        double resultado;

        
        do { 
            System.out.println("Escoja una opción");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. salir");
            opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= 3) {
                System.out.println("Ingrese el primer numero:");
                double n1 = sc.nextDouble();
                System.out.println("Ingrese el segundo numero:");
                double n2 = sc.nextDouble(); 
            
            switch(opcion) {
                case 1 -> {resultado = Operaciones.sumar(n1,n2);
                System.out.println("El resultado es: " + resultado);}
                case 2 -> {resultado = Operaciones.restar(n1,n2);
                System.out.println("El resultado es: " + resultado);}
                case 3 -> {resultado = Operaciones.multiplicar(n1,n2);
                System.out.println("El resultado es: " + resultado);}
                case 4 -> System.out.println("Gracias por usar la calculadora.");
                default -> System.out.println("opcion invalida.");
                }
            }
        } while (opcion != 4); 
    }
    
}