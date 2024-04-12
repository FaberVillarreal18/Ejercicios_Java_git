import java.util.Scanner;

public class Ejercicio21{
    static double a,b;
    static int op;
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un valor (A):");
        a=entrada.nextDouble();
        System.out.println("Ingresa un valor (B):");
        b=entrada.nextDouble();
        mostrar();
        System.out.println("¿Desea cambiar los valores de A y B?: 1. SI/2. NO, Salir");
        op=entrada.nextInt();
        opcion(op);
        entrada.close();
    }
    public static void mostrar(){
        System.out.println("A= "+a);
        System.out.println("B= "+b);
    }
    public static void opcion(int op){
        switch (op) {
            case 1:
            Scanner entrada=new Scanner(System.in);
            System.out.println("Ingresa un valor (A):");
            a=entrada.nextDouble();
            System.out.println("Ingresa un valor (B):");
            b=entrada.nextDouble();
            System.out.println("Los nuevos valores son:");
            mostrar();
            entrada.close();
                break;
            case 2:
            System.out.println("Saliendo del sistema....");
                break;
            default:
                break;
        }
    }
}