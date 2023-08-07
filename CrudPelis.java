import javax.management.monitor.StringMonitor;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudPelis {
    public static void main(String[] args){
        ArrayList<String> pelis = new ArrayList<String>();
        Scanner s = new Scanner(System.in);
        boolean flag = false;
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
                    break;
                case "3":
                    break;
                case "4":
                    System.out.println(pelis);
                    break;
                case "5":
                    flag = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese nuevamente");
            } 

        }while(!flag);
    }
}
