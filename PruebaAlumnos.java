import clases.Alumno;
import java.util.Scanner;
public class PruebaAlumnos {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        Alumno a3 = new Alumno();
        // Carga los datos de los alumnos
        System.out.print("Ingrese nombre del alumno 1: ");
        a1.setNombre(s.nextLine());
        System.out.print("Ingrese apellido del alumno 1: ");
        a1.setApellido(s.nextLine());
        System.out.print("Ingrese edad del alumno 1: ");
        a1.setEdad(Integer.parseInt(s.nextLine()));
        
        System.out.print("Ingrese nombre del alumno 2: ");
        a2.setNombre(s.nextLine());
        System.out.print("Ingrese apellido del alumno 2: ");
        a2.setApellido(s.nextLine());
        System.out.print("Ingrese edad del alumno 2: ");
        a2.setEdad(Integer.parseInt(s.nextLine()));

        System.out.print("Ingrese nombre del alumno 3: ");
        a3.setNombre(s.nextLine());
        System.out.print("Ingrese apellido del alumno 3: ");
        a3.setApellido(s.nextLine());
        System.out.print("Ingrese edad del alumno 3: ");
        a3.setEdad(Integer.parseInt(s.nextLine()));

        System.out.println();
        // Muestra los datos delos alumnos
        System.out.printf("Nombre: %s\nApellido: %s\nEdad: %d\n",a1.getNombre(),a1.getApellido(),a1.getEdad());
        System.out.printf("Nombre: %s\nApellido: %s\nEdad: %d\n",a2.getNombre(),a2.getApellido(),a2.getEdad());
        System.out.printf("Nombre: %s\nApellido: %s\nEdad: %d\n",a3.getNombre(),a3.getApellido(),a3.getEdad());

    }
}
