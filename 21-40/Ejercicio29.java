import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un numero real");
        float x=entrada.nextFloat();
        float op=x*x*x;
        System.out.println("El cubo de "+x+" es "+op);
        entrada.close();
    }
}
