import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int c = 0;
        int n;

        System.out.println("Ingrese números. Ingrese 0 para terminar.");
        do {
            n = entrada.nextInt();
            if (n > 0) {
                c++;
            }
        } while (n != 0);
        System.out.println("Número de valores mayores que cero leídos: " + c);
        entrada.close();
    }
}
