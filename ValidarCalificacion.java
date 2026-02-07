import java.util.Scanner;

public class ValidarCalificacion {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int calificacion = validarCalificacion(sc);

        System.out.println("Calificación válida: " + calificacion);
    }

    public static int validarCalificacion(Scanner sc) {
        int cal;

        do {
            System.out.print("Ingrese una calificación (0 a 100): ");
            cal = sc.nextInt();
        } while (cal < 0 || cal > 100);

        return cal;
    }
}
