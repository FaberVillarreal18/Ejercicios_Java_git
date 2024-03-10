import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float b,a,op2, op, op3, op4, op5, op6, op7;
        System.out.println("ingresa la base del rectangulo en milimetros: ");
        b=entrada.nextFloat();
        System.out.println("ingresa la altura del rectangulo en milimetros: ");
        a=entrada.nextFloat();
        op=a/10;
        op2=b/10;
        op3=a/1000;
        op4=b/1000;
        op5=a*b;
        op6=op*op2;
        op7=op3*op4;
        System.out.println("El area del rectangulo en milimetros es: "+op5+"mm2");
        System.out.println("El area del rectangulo en centimetros es: "+op6+"cm2");
        System.out.println("El area del rectangulo en metros es: "+op7+"m2");
        entrada.close();
    }
}
