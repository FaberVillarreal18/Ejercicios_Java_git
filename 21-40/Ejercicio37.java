import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa cuantas horas estuvo su vehiculo en el estacionamiento:");
        double h=entrada.nextDouble();
        System.out.println("Ingresa cuantos minutos estuvo su vehiculo en el estacionamiento:");
        double m=entrada.nextDouble();
        double op=h*15.00;
        System.out.println("Usted utilizo el estacionamiento: "+h+" horas y "+m+" minutos");
        
        if (m>10) {
            double op2=(h+1)*15.00;
            System.out.println("Usted ha excedido el limite de 10min ");
            System.out.println("Usted debe pagar: $"+op2);
        } else {
            System.out.println("Usted debe pagar: $"+op);
        }
        entrada.close();
    }
}
