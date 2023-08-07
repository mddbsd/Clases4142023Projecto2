import java.util.ArrayList;
import clases.GatoSimple;
public class EjemploArrayList03 {
    public static void main(String[] args){
        ArrayList<GatoSimple> g = new ArrayList<GatoSimple>();

        g.add(new GatoSimple("Garfield", "naranja"));
        g.add(new GatoSimple("Tom", "gris"));
        g.add(new GatoSimple("Ana", "blanco"));
        g.add(new GatoSimple("Mauri", "verde"));

        System.out.println("Datos de los gatos:");

        for(GatoSimple gatoAux : g){
            System.out.println("Nombre: " + gatoAux.getNombre());
            System.out.println("Colore: " + gatoAux.getColor());
            System.out.println("genero: " + gatoAux.getGenero());
        }
    }
}
