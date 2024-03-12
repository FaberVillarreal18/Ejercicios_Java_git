import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 10:");
        int n = entrada.nextInt();

        if (n >= 1 && n <= 10) {
            System.out.println("Tabla de multiplicar de " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("El número ingresado está fuera del rango válido.");
        }

        entrada.close();
    }
}

