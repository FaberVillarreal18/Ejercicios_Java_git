import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número entero(1): ");
        int n1 = entrada.nextInt();
        System.out.println("Ingresa un número entero(2): ");
        int n2 = entrada.nextInt();
        System.out.println("Ingresa un número entero(3): ");
        int n3 = entrada.nextInt();
        int u1 = n1 % 10;
        int u2 = n2 % 10;
        int u3 = n3 % 10;
        System.out.println("El último dígito del primer numero es: " + u1);
        System.out.println("El último dígito del segundo numero es: " + u2);
        System.out.println("El último dígito del tercer numero es: " + u3);
        entrada.close();
    }
}
