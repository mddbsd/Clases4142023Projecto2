import clases.GatoSimple;
import java.util.Scanner;

public class PruebaGatoSimple {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        GatoSimple garfield = new GatoSimple("macho");
        GatoSimple lisa = new GatoSimple("hembra");
        GatoSimple tom = new GatoSimple("macho");
        String comida;

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

















