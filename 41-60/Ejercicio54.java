import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa una medida expresada en centimetros");
        double c=entrada.nextDouble();
        double op=c/2.54;
        System.out.println("La medida expresada en pulgadas es: "+op+"'");
        entrada.close();
    }
}
