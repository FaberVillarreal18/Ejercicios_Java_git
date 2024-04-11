import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa una cantidad de grados centigrados: ");
        double x=entrada.nextDouble();
        double op=x*9/5+32;
        System.out.println("la cantidad expresada en grados farenheit es: "+op);
        entrada.close();
    }
}
