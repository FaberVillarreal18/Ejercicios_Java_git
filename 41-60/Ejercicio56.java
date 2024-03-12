import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa el tiempo en segundos:");
        double s=entrada.nextDouble();
        double op=s/3600;
        double op2= (s % 3600)/60;
        double op3=s%60;
        System.out.println(op+":"+op2+":"+op3);
        System.out.println("El tiempo equivale a: "+op+" horas, "+op2+" minutos, y"+op3+" segundos");
        entrada.close();
    }
}
