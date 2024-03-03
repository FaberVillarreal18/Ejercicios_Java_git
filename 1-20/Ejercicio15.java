import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int n=entrada.nextInt();

        if (n<=0 || n>118) {
            System.out.println("Edad invalida...");
        }else{
            if (n>0 && n>=18) {
                System.out.println("Usted es mayor de edad");
            } else {
                if (n>0 && n<18) {
                    System.out.println("Usted es menor de edad");
                }
            }
        }
        entrada.close();
    }
}
