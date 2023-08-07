import java.util.ArrayList;

public class EjemploArrayList06 {
    public static void main (String[] args){
        ArrayList<String> a = new ArrayList<String>();

        a.add("marcelo");
        a.add("mario");
        a.add("feudales");
        a.add("larry");
        a.add("shemp");

        System.out.println("Contenido del vector");
        System.out.println(a);

        a.set(4, "curly");

        System.out.println("Contenido del vector");
        System.out.println(a);

        a.add(1, "ricardo");

        System.out.println("Contenido del vector");
        System.out.println(a);

        a.removeIf(filtro -> filtro.contains("ri"));

        System.out.println("Contenido del vector");
        System.out.println(a);
    }
}
