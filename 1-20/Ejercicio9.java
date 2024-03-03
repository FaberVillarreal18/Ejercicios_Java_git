import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa el precio del producto: ");
        double c=entrada.nextDouble();
        System.out.println("La cantidad ingresada tiene incluido el IVA: ");
        System.out.println("1. SI ");
        System.out.println("2. NO ");
        System.out.println("Selecciona tu opción: ");
        int x=entrada.nextInt();
        if (x==1) {
            double op=c/100*21;
            System.out.println("El IVA tiene un valor de: $"+op);
            entrada.close();
        } else {
            if (x==2) {
                System.out.println("1. IVA normal=         21%");
                System.out.println("2. IVA reducido=       10%");
                System.out.println("3. IVA super reducido=  4%");
                System.out.println("Introduce el porcentaje de iva de tu producto: ");
                int a=entrada.nextInt();
                switch (a) {
                    case 1:
                        double op2=c/100*21;
                        double i1=c+op2;
                        System.out.println("El precio total es de: $"+i1);
                        break;
                    case 2:
                        double op3=c/100*10;
                        double i2=c+op3;
                        System.out.println("El precio total es de: $"+i2);
                        break;
                    case 3:
                        double op4=c/100*4;
                        double i3=c+op4;
                        System.out.println("El precio total es de: $"+i3);
                        break;          
                    default:
                        break;
                }
            }
        }
        entrada.close();

    }
}
