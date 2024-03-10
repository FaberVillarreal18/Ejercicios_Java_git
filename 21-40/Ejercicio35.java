import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresar la tarifa por hora: ");
        double t=entrada.nextDouble();
        System.out.println("Ingresar la cantidad de horas trabajadas: ");
        double h=entrada.nextDouble();
        if (h>40) {
            double op=h-40;
            double op1=40*t;
            double op2=t*1.5;
            double op3= op*op2;
            double op4= op1+op3;

            System.out.println("El salario común es de: $"+op1);
            System.out.println("La cantidad horas extras trabajadas son: "+op);
            System.out.println("El aumento por hora extra es de: $"+op2);
            System.out.println("El aumento total es de: $"+op3);
            System.out.println("Total a pagar: $"+op4);
        } else {
            double o=h*t;
            System.out.println("La cantidad horas extras trabajadas son: 0");
            System.out.println("El aumento por hora extra es de: $0");
            System.out.println("El aumento total es de: $0");
            System.out.println("Total a pagar: $"+o);
        }
        entrada.close();
    }
}
