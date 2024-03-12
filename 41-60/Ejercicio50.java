import java.util.*;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un numero(1):");
        int n1=entrada.nextInt();
        System.out.println("Ingresa un numero(2):");
        int n2=entrada.nextInt();
        System.out.println("Ingresa un numero(3):");
        int n3=entrada.nextInt();
        int op=n1+n2+n3;
        int op2=n1*n2*n3;
        System.out.println(n1+"+"+n2+"+"+n3+"=" +op);
        System.out.println(n1+"x"+n2+"x"+n3+"=" +op2);
        entrada.close();
    }
}
