import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        System.out.print("Ingrese la cantidad de términos en la serie: ");
        int n = entrada.nextInt();
        
        int primeraTermino = 20;
        int ultimoTermino = primeraTermino + 2 * (n - 1);
        int suma = (n * (primeraTermino + ultimoTermino)) / 2;
        
        System.out.println("La suma de la serie es: " + suma);
        entrada.close();
    }
}
