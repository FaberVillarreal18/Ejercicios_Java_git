import java.util.Scanner;

public class Ejercicio70 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de n: ");
        int n = entrada.nextInt();
        
        int resultado = calcularExpresion(n);
        System.out.println("El resultado de la expresión es: " + resultado);
        entrada.close();
    }
    
    public static int calcularExpresion(int n) {
        int resultado = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                resultado -= i;  // Si es par, restar
            } else {
                resultado += i;  // Si es impar, sumar
            }
        }
        return resultado;
    }
}
