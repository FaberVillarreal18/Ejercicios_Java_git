import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double c1, c2, h;
            System.out.println("Digite el primer cateto: ");
            c1= entrada.nextDouble();
            System.out.println("Digite el otro cateto: ");
            c2= entrada.nextDouble();
            h= Math.sqrt(Math.pow(c1, 2)+ Math.pow(c2, 2));
            System.out.println("La hipotenusa es: "+h);
            entrada.close();                        
        }
}
