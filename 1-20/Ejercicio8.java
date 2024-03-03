import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double n1,n2;
        System.out.println("Ingresa el primer numero(dividendo): ");
        n1=entrada.nextDouble();
        System.out.println("Ingresa el segundo numero(divisor): ");
        n2=entrada.nextDouble();
        double r=n1%n2;
        if (n2 != 0) {
            System.out.println("El residual es: "+r);
        } else {
            System.out.println("El divisor debe ser diferente de 0");
        }
        entrada.close();
    }
}
