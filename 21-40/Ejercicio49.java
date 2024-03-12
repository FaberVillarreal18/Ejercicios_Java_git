import java.util.*;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("ingresar cadena de texto: ");
        String s=entrada.nextLine();
        char h= s.charAt(0);
        System.out.println("La primera letra de la cadena de texto es: "+h);
        entrada.close();
    }
}
