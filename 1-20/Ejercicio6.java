import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Ingresa el primer numero: ");
        n1=entrada.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        n2=entrada.nextDouble();
        System.out.println("Ingresa el tercer numero: ");
        n3=entrada.nextDouble();
        double op=(n1+n2+n3)/3;
        System.out.println("La media aritmetica es: "+op);
        entrada.close();
    }
}
