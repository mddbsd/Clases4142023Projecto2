import matematicas.Geometria;
import matematicas.Varias;
public class Operaciones {
    public static void main(String[] args){
        double radio;
        double altura;
        int num;
        boolean flag = true;
        int op;
        do{
            op = menuOpciones();
            switch (op){
                case 1:
                    System.out.println("Ingrese radio del cilindro");
                    radio = Double.parseDouble(System.console().readLine());
                    System.out.println("Ingrese altura del cilindro");
                    altura = Double.parseDouble(System.console().readLine());
                    System.out.print("El volumen es: ");
                    System.out.println(matematicas.Geometria.volumenCilindro(radio, altura));
                    break;
                case 2:
                    System.out.println("Ingrese el radio de la circunferencia");
                    radio = Double.parseDouble(System.console().readLine());
                    System.out.print("La longitud es: ");
                    System.out.println(matematicas.Geometria.longitudCircunferencia(radio));      
                    break;
                case 3:
                    System.out.println("Ingrese un numero entero positivo");
                    num = Integer.parseInt(System.console().readLine());
                    if(matematicas.Varias.esPrimo(num)){
                        System.out.println("El numero es primo");
                    }else{
                        System.out.println("El numero no es primo");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese un numero entero positivo");
                    num = Integer.parseInt(System.console().readLine());
                    System.out.println("El numero tiene " + matematicas.Varias.digitos(num) + "digitos");
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("La opcion es incorrecta, ingrese nuevamente");
            }
        }while(flag);
    }
    public static int menuOpciones(){
        System.out.println("***** Menu de opciones ****");
        System.out.println("1: Radio de un cilindro");
        System.out.println("2: Longitud de circunferencia");
        System.out.println("3: Numero Primo");
        System.out.println("4: Digitos de un numero");
        System.out.println("5: Salir");
        return Integer.parseInt(System.console().readLine());
    }
}











