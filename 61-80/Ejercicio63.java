import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int n=0;
        int x;
        do {
            System.out.print("Ingrese un entero: ");
            x = entrada.nextInt();
            if (x > 0) {
                n += x;
            }
        } while (x != 0 && (x <= 20 || x > 30));
        System.out.println("La suma de los numeros mayores a 0 es igual a=: "+n);
        entrada.close();
    }
}
