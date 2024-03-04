import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa el salario basico: ");
        double n=entrada.nextDouble();
        System.out.println("Cantidad de horas extras trabajadas: ");
        double h=entrada.nextDouble();
        double op1=(n/100)*20;
        double op2=op1*h;
        double op3=n+op2;
        System.out.println("El salario basico es: "+n);
        System.out.println("El aumento por horas trabajadas es: "+op2);
        System.out.println("El salario total es: "+op3);
        entrada.close();
    }
}
