import clases.GatoSimple;
import java.util.Scanner;

public class PruebaGatoSimple {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        GatoSimple garfield = new GatoSimple("macho", 10.0, "naranja");
        GatoSimple lisa = new GatoSimple("hembra", 5.0, "blanco y negro");
        GatoSimple tom = new GatoSimple("macho", 8.0, "gris");
        String comida;
        String nombre;
        System.out.println(lisa.getColor());
        System.out.println(lisa.getPeso());
        System.out.println(tom.getColor());
        System.out.println("Ingrese nombre de gato 1");
        nombre = s.nextLine();
        garfield.setNombre(nombre);
        System.out.println("Ingrese nombre de gato 2");
        nombre = s.nextLine();
        lisa.setNombre(nombre);
        System.out.println("Ingrese nombre de gato 3");
        nombre = s.nextLine();
        tom.setNombre(nombre);




        System.out.println("El genero del garfield es: " + garfield.getGenero());
        System.out.println("El genero del lisa es: " + lisa.getGenero());
        System.out.println("El genero del tom es: " + tom.getGenero());
        System.out.println("Dame comida, miserable humano");
        comida = s.nextLine();
        garfield.come(comida);

        lisa.peleaCon(tom);
        garfield.peleaCon(lisa);
        tom.peleaCon(garfield);
    }
}

















