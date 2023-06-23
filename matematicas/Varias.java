package matematicas;
/**
 * Funciones matematicas
 * @author Maximiliano
 */
public class Varias {
    /**
     * Comprueba si el numero es primo o no
     * Un numero es primo cuando es divisible entre 
     * 1 y si mismo
     * @param x numero entero positivo
     * @return <ul><li>devuelve true si el numero es primo</li>
     *             <li>devuelve false si el numero no es primo</li></ul>
     */
    public static boolean esPrimo(int x){
        for ( int i = 2; i < x; i++){
            if((x % i) == 0){
                return false;
            }
        }
        return true;
    }
    /**
     * Devuleve el numero de digitos que contiene el numero entero
     * @param x Un numero entero
     * @return La cantidad de digitos que contiene el numero
     */
    public static int digitos(int x){
        int n;
        if(x == 0){
            return 1;
        }else{
            n = 0;
            while (x > 0){
                x = x / 10;
                n ++; 
            }
            return n;
        }
    }
}
