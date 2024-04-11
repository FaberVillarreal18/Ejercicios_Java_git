import java.util.Scanner;

public class Ejercicio28 {
   public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    System.out.println("Ingresa un numero: ");
    int x=entrada.nextInt();
    System.out.println("Iniciando.....");
    for (int i = x; i >= 0; i--) {
        System.out.print(i+", ");
    }
    entrada.close();
    }
} 

