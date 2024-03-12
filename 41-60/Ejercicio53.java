import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la medida de uno de los lados en centimetros(1)");
        double l1=entrada.nextDouble();
        System.out.println("Ingresa la medida de uno de los lados en centimetros(2)");
        double l2=entrada.nextDouble();
        double op=l1*l2;
        System.out.println("El area del cuadrado es de: "+op+"cm");
        entrada.close();
    }
}
