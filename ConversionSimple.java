import java.util.Scanner;

public class ConversionSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa los metros: ");
        double metros = sc.nextDouble();
        
        double centimetros = ConvertirACentimetros(metros);
        System.out.println("Centimetros " + centimetros);
    }
    public static double ConvertirACentimetros(double  metros){
        return metros * 100;
    }
    
}
