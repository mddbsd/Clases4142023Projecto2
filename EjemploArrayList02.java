import java.util.ArrayList;
public class EjemploArrayList02 {
    public static void main(String[] args){
        ArrayList<String> a = new ArrayList<String>();

        a.add("Pepe");
        a.add("Ana");
        a.add("Ricardo");
        a.add("Carlitos");
        a.add("Cecilia");
        a.add("Susana");

        System.out.println("Elementos de la lista:");
        /*
        for (int i = 0; i < a.size(); i ++){
            System.out.println(a.get(i));
        }
        */
        // For Each. Saca cada uno de los elementos de a y los guarda
        // en la variable nombre. Por ultimo, imprime nombre
        for(String nombre : a){
            System.out.println(nombre);
        }

    }
}
