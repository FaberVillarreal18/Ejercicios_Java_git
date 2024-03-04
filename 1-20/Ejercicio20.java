import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa tu primera nota: ");
        double n1=entrada.nextDouble();
        System.out.println("Ingresa tu segunda nota: ");
        double n2=entrada.nextDouble();
        System.out.println("Ingresa tu tercera nota: ");
        double n3=entrada.nextDouble();
        System.out.println("Ingresa tu cuarta nota: ");
        double n4=entrada.nextDouble();
        System.out.println("Ingresa tu quinta nota: ");
        double n5=entrada.nextDouble();

        double op1=(n1+n2+n3+n4+n5)/5;
        double op2=n1+n2+n3+n4+n5;
        System.out.println("El promedio es: "+op1);
        System.out.println("La suma es: "+op2);
        entrada.close();
    }
}