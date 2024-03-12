import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la cantidad de horas trabajadas: ");
        double h=entrada.nextDouble();
        System.out.println("Ingresa la tarifa por hora:");
        double t=entrada.nextDouble();
        double op=h*t;
        System.out.println("Su salario es de: $"+op);
        entrada.close();
    }
}
