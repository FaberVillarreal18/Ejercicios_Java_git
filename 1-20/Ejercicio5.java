import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double a,b;
        System.out.println("Ingresa la medida de la diagonal A: ");
        a=entrada.nextDouble();
        System.out.println("Ingresa la medida de la diagonal B: ");
        b=entrada.nextDouble();
        double c=(a*b)/2;
        System.out.println("El area del rombo es: "+c+" cm");
        entrada.close();
    }
}
