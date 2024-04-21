import java.util.Scanner;

public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de n: ");
        int n = entrada.nextInt();
        
        int suma = calcularSumaSerieImpares(n);
        System.out.println("La suma de la serie es: " + suma);
        entrada.close();
    }
    
    public static int calcularSumaSerieImpares(int n) {
        int suma = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            suma += i;
        }
        return suma;
    }
}
