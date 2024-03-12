import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n=entrada.nextInt();
        if (n>0) {
            System.out.println(1+" El numero es positivo");
        } else {
            if (n<0) {
                System.out.println(-1+" El numero es negativo");
            } else {
                if (n==0) {
                    System.out.println(0+" El numero es 0");
                }
            }
        }
        entrada.close();
    }
}
