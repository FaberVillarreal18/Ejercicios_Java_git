import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la base del rectangulo: ");
        double b=entrada.nextDouble();
        System.out.println("Ingresa la altura del rectangulo: ");
        double h=entrada.nextDouble();
        double op=b*h;
        System.out.println("El area del rectagulo es: "+op+"cm2");
        entrada.close();
    }
}
