import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double r=entrada.nextDouble();
        double op= Math.PI*(r*r);
        System.out.println("El area del circulo es: "+op+ "cm2");
    }
}
