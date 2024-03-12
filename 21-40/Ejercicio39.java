import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa el año en que naciste: ");
        int n=entrada.nextInt();
        System.out.println("Ingresa tu nombre: ");
        String x=entrada.next();
        int op=2024-n;
        double op2=365*0.34;
        double op3=(int)op2*op;
        System.out.println("Su nombre es: "+x );
        System.out.println("Ha dormido "+op3+" dias");
        entrada.close();
    }
}
