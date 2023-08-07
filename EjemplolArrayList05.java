import java.util.ArrayList;

public class EjemplolArrayList05 {
    public static void main (String[] args){
        ArrayList<String> a = new ArrayList<String>();
        a.add("rojo");
        a.add("verde");
        a.add("azul");
        a.add("blanco");
        a.add("amarillo");
        a.add("blanco");

        for(String color : a){
            System.out.println(color);
        }
        System.out.println("");
        // El metodo .contains(elemento) devuelve verdadero
        // si el elemento que enviamos como argumento
        // se encuentra dentro de la lista
        if (a.contains("blanco")){ 
            System.out.println("El blanco se encuentra en la lista");
        }else{
            System.out.println("El elemeno no existe en la lista");
        }

        // El metodo .remove(elemento) elimina el elemento que
        // le enviamos como argumento
        a.remove("blanco");
        
        for(String color : a){
            System.out.println(color);
        }
        System.out.println("");
        // El metodo .remove(indice) elimina el elemento encontrado
        // en el indice que le enviamos como argumento
        a.remove(2);

        for(String color : a){
            System.out.println(color);
        }
    }
}
