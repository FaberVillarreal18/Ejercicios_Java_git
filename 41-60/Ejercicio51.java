import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la base del rectandulo:");
        double b=entrada.nextDouble();
        System.out.println("Ingresa la altura del rectagulo:");
        double a=entrada.nextDouble();
        double p=(b*2)+(a*2);
        System.out.println("El perimetro del rectagulo es: "+p);
        entrada.close();
    }
}
