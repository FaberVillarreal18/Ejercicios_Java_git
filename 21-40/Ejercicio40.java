import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Double onza, o, k, p;
        int kilo;
        onza=28.3495;
        kilo=1000;
        System.out.println("ingrese los kilos de oro");
        k=entrada.nextDouble();
        System.out.println("ingrese el precio por onza de oro");
        o=entrada.nextDouble();
        p=((k*kilo)/onza)*o;
        System.out.println("El precio total es de: $"+p);
        entrada.close();
    }
}

