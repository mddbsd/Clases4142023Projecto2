import java.util.ArrayList;

public class EjemploArrayList01 {
    public static void main(String[] args){
        // Defino un ArrayList del tipo String con el identificador a
        ArrayList<String> a = new ArrayList<String>(); 
        // Muestra el tamaño del ArrayList mediante el metodo size()
        System.out.println("N° Elementos: " + a.size());
        // Agrego elementos al final del ArrayList con el metodo add(elemento)
        a.add("rojo");
        a.add("verde");
        a.add("azul");

        System.out.println("N° Elementos: " + a.size());

        a.add("blanco");

        System.out.println("N° Elementos: " + a.size());

        System.out.println("El elemento en la posicion 0 es: " + a.get(0));
        System.out.println("El elemento en la posicion 3 es: " + a.get(3));
        // Defino un ArrayList del tipo String con el identificador a
        // Es importante utilizar el wrapper para definir el tipo de ArrayList
        ArrayList<Integer> b = new ArrayList<Integer>();

        b.add(10);
        b.add(48);
        b.add(-58);

        System.out.println("N° Elementos: " + b.size());

        System.out.println("El elemento en la posicion 1 es: " + b.get(1));
    }
}
