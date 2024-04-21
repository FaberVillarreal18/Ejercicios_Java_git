import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        int x = entrada.nextInt();
        System.out.print("Ingrese el valor de y: ");
        int y = entrada.nextInt();
        int resultado = calcularPotencia(x, y);
        System.out.println(x + "^" + y + " = " + resultado);
        entrada.close();
    }
    
    public static int calcularPotencia(int x, int y) {
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado *= x;
        }
        return resultado;
    }
}
