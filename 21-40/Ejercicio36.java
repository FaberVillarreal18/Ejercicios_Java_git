import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa el tiempo de estacionamiento de su vehiculo en minutos:");
        double x=entrada.nextDouble();
        double op=x/60;
        double op2=op*15.00;
        System.out.println("Usted debe pagar: $"+op2);
        entrada.close();
    }
}
