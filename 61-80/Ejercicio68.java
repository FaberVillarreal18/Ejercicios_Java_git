import java.util.Scanner;

public class Ejercicio68{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de n: ");
        int n = entrada.nextInt();
        
        long suma = calcularSumaFactoriales(n);
        System.out.println("La suma de factoriales hasta " + n + " es: " + suma);
        entrada.close();
    }
    
    public static long calcularFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static long calcularSumaFactoriales(int n) {
        long suma = 0;
        for (int i = 1; i <= n; ++i) {
            suma += calcularFactorial(i);
        }
        return suma;
    }
}
