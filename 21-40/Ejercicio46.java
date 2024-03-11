import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la distancia en millas: ");
        double n=entrada.nextDouble();
        double op=n/1852;
        System.out.println("La distancia expresada en metros equivale a: "+op+"m");
        entrada.close();
    }
}
