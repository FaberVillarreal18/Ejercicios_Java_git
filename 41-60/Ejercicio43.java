import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingresa el primer numero: ");
        n1=entrada.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        n2=entrada.nextInt();
        
        if (n1>n2) {
            System.out.println("El numero menor es el segundo: "+n2);
        } else {
            if (n1<n2) {
                System.out.println("El numero manor es el primero: "+n1);
            } else {
                if (n1==n2) {
                    System.out.println("Ambos numeros son iguales");
                }
            }
        }
        entrada.close();
    }
}
