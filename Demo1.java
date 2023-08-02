import clases.Personaje;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Personaje[] pj = new Personaje[3];
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            pj[i] = new Personaje();
        }
        do {
            System.out.println("Menu:");
            System.out.println("1: Listar personajes");
            System.out.println("2: Cargar personajes");
            System.out.println("3: Saludar a personaje");
            System.out.println("4: Salir");
            switch (Integer.parseInt(s.nextLine())) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Nombre: " + pj[i].getNombre());
                        System.out.println("Clase: " + pj[i].getClase());
                        System.out.println("Hp: " + pj[i].getHp());
                        System.out.println("Mp: " + pj[i].getMp());
                        //System.out.printf("Nombre: %s\nClase: %s\n HP: %.2f MP: %.2f\n", pj[i].getNombre(),
                        //        pj[i].getClase(), pj[i].getHp(), pj[i].getMp());
                    }
                    break;
                case 2:
                    // cargar
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Ingrese nombre");
                        pj[i].setNombre(s.nextLine());
                        System.out.println("Ingrese Clase");
                        System.out.println("1: Guerrero");
                        System.out.println("2: Mago");
                        switch (s.nextLine()) {                      
                            case "1":
                                pj[i].setClase("guerrero");
                                break;
                            case "2":
                                pj[i].setClase("mago");
                                break;
                            default:
                                pj[i].setClase("mago");
                        }
                    }
                    break;
                case 3:
                    System.out.println("A que personaje quiere saludar?");
                    switch (s.nextLine()) {
                        case "1":
                            pj[0].saluda();
                            break;
                        case "2":
                            pj[1].saluda();
                            break;
                        case "3":
                            pj[2].saluda();
                            break;
                        default:
                            System.out.println("El personaje no existe");
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta, ingrese nuevamente");
            }
        } while (flag);
    }
}
