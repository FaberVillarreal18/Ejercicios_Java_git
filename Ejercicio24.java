import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese una cantidad de pulgadas:");
        double d=entrada.nextDouble();
        double op= d*2.54;
        System.out.println("La cantidaad expresada en centimetros es: "+op+"cm");
        entrada.close();
    }
}
