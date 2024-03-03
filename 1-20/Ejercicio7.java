import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double n;
        System.out.println("Ingresa un numero: ");
        n=entrada.nextDouble();
        if (n>0) {
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
        entrada.close();
    }
    
}
