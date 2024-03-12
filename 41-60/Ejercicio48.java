import java.util.*;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un numero(1): ");
        int n1=entrada.nextInt();
        System.out.println("Ingresa un numero(2): ");
        int n2=entrada.nextInt();
        int op=n1+n2;
        int op2=n1-n2;
        int op3=n1*n2;
        int op4=n1/n2;

        System.out.println("Suma:           "+n1+" + "+n2+" = "+op);
        System.out.println("Resta:          "+n1+" - "+n2+" = "+op2);
        System.out.println("Multiplicación: "+n1+" x "+n2+" = "+op3);
        System.out.println("División:       "+n1+" / "+n2+" = "+op4);
        entrada.close();
    }
}
