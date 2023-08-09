import clases.Cuadrado;
import java.util.Scanner;

public class EjemploToString {
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese tamaño del cuadrado");
        Cuadrado c = new Cuadrado(Integer.parseInt(s.nextLine()));
        System.out.println(c);
    }
}
