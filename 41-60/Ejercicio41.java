import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double centimetros=0.5;
        double edad, op, mide, total;
        System.out.println("Ingrese su edad: ");
        edad= entrada.nextInt();    
        op= (int) (centimetros*12);
        mide= op*edad;
        total= mide/100;
        System.out.println("Tu cabello mide: "+total+"M");
        entrada.close();
    }
}
