import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un número real:");
        double x=entrada.nextDouble();
        int op1=(int)x;
        double op2= x - op1;
        System.out.println("Parte entera= "+op1);
        System.out.println("Parte decimal= "+op2);
        entrada.close();
    }
}
