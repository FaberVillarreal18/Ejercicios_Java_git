import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String n=entrada.nextLine();
        System.out.println("Ingresa tu genero (1. hombre/2. mujer/3. otro): ");
        int g=entrada.nextInt();
        switch (g) {
            case 1:
                System.out.println("Bienvenido "+n);
                break;
            case 2:
                System.out.println("Bienvenido "+n);
                break;
            case 3:
                System.out.println("Bienvenido indeciso");
                break;
        
            default:
                System.out.println("Opcion no valida...");
                break;
        }
        entrada.close();
    }
}
