import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su puntaje del examen: ");
        double n=entrada.nextDouble();

        if (n<=0 || n>5) {
            System.out.println("puntaje invalido...");
        }else{
            if (n>=3 && n<=5) {
                System.out.println("Usted ganó el examen");
            } else {
                if (n>0 && n<3) {
                    System.out.println("Usted perdió el examen ");
                }
            }
        }
        entrada.close();
    }
}
