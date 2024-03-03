import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa tu primer número: ");
        double n1=entrada.nextDouble();
        System.out.println("Ingresa tu segundo número: ");
        double n2=entrada.nextDouble();
        System.out.println("Ingresa tu tercer número: ");
        double n3=entrada.nextDouble();

        double op1=(n1+n2+n3)/3;
        double op2=n1+n2+n3;
        double op3=n1*2;
        double op4=n2*3;
        double op5=n3*n3;

        System.out.println("El promedio es: "+op1);
        System.out.println("La suma es: "+op2);
        System.out.println("El doble del primer número es: "+op3);
        System.out.println("El triple del segundo número es: "+op4);
        System.out.println("El cuadrado del tercer número es: "+op5);
        entrada.close();
    }
    
}
