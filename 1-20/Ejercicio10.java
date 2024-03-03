import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double b,a,op;
        System.out.println("ingresa la base del triangulo: ");
        b=entrada.nextDouble();
        System.out.println("ingresa la altura del triangulo: ");
        a=entrada.nextDouble();
        op=(b*a)/2;
        System.out.println("El area del triangulo es: "+op);
        entrada.close();
    }
}
