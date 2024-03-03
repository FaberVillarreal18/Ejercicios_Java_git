import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un numero entero de 4 digitos: ");
        int n1=entrada.nextInt();
        int a=n1/1000;
        int b=(n1/100)%10;
        int c=(n1/10)%10;
        int d=n1%10;
        int op=a+b+c+d;
        System.out.println("Los digitos son: "+a+", "+b+", "+c+", "+d);
        System.out.println("La suma de los digitos es: "+op);
        entrada.close();
    }
}
