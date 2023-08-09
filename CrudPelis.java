import java.util.ArrayList;
import java.util.Scanner;

public class CrudPelis {
    public static void main(String[] args){
        ArrayList<String> pelis = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        boolean flag = false;

        pelis.add("avatar");
        pelis.add("terminator");
        pelis.add("el señor de los novillos");
        pelis.add("rocky LIX");

        do{
            System.out.println("***MENU DE OPCIONES***");
            System.out.println("1: Cargar pelicula");
            System.out.println("2: Eliminar pelicula");
            System.out.println("3: Editar pelicula");
            System.out.println("4: Mostrar lista");
            System.out.println("5: Salir");

            switch(s.nextLine()){
                case "1":
                    System.out.println("Ingrese el titulo: ");
                    pelis.add(s.nextLine());
                    System.out.println("Pelicula ingresada");
                    break;
                case "2":
                    System.out.println("Que pelicula desea eliminar?");
                    imprimeLista(pelis);
                    pelis.remove(Integer.parseInt(s.nextLine()));
                    System.out.println("Pelicula eliminada");
                    break;
                case "3":
                    System.out.println("Que pelicula desea editar?");
                    // pelis.set(Integer.parseInt(s.nextLine()), s.nextLine());
                    imprimeLista(pelis);
                    int indice = Integer.parseInt(s.nextLine());
                    System.out.println("Ingrese el nuevo valor");
                    String peliEditada = s.nextLine();
                    pelis.set(indice, peliEditada);
                    System.out.println("La pelicula fue editada correctamente");
                    break;
                case "4":
                    System.out.println("Listado de peliculas: ");
                    imprimeLista(pelis);
                    break;
                case "5":
                    flag = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese nuevamente");
            } 

        }while(!flag);
    }

    public static void imprimeLista(ArrayList<String> lista){
        int i = 0;
        for(String peli : lista){
            System.out.println(i + ". " + peli);
            i ++;
        };
    }
}
