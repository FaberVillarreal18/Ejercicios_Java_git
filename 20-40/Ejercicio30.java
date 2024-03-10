import java.util.*;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa la distancia en kilometros: ");
        double n=entrada.nextDouble();
        double op=n*1000;
        System.out.println("La distancia en metros es de: "+op+"m");
        entrada.close();
    }
}
