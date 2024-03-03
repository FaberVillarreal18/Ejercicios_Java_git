import java.util.*;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base,altura, operacion;
        System.out.println("Digite base");
        base=teclado.nextInt();
        System.out.println("Digite altura");
        altura=teclado.nextInt();
        operacion=(base*altura)/2;
        System.out.println("El area del triangulo es: "+operacion+" cm");

    }
}
