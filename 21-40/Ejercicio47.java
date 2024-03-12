import java.util.*;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos comprados: ");
        int c=entrada.nextInt();
        System.out.println("Ingrese el valor total de la compra: ");
        double v=entrada.nextDouble();
        System.out.println("Ingrese el valor cancelado: ");
        double p=entrada.nextDouble();

        double op=v/c;
        double op2=(v/p)*100;
        double op3=100-op2;
        String op4= String.format("%.2f", op3);
        double op5= p-v;

        System.out.println("Valor unitario: $"+op);
        System.out.println("costo total: $"+v);
        System.out.println("Valor cancelado: $"+p);
        System.out.println("Valor descontado: $"+op5);
        System.out.println("Porcentaje del valor descontado: "+op4+"%");
        
        entrada.close();
    }
}
