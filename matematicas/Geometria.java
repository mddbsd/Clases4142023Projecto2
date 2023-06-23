package matematicas;
/**
 * paquete de funciones geometricas
 * @author Maximiliano
 */
public class Geometria{
    /**
     * Cacula el volumen de un cilindro
     * 
     * @param r Radio del cilindro
     * @param h Altura del cilindro
     * @return Volumen del cilindro
     */
    public static double volumenCilindro(double r, double h){
        return Math.PI * r * r * h;
    }
    /**
     * Calcula la longitud de un cilindro en base a su radio
     * @param r Radio de la circunferencia
     * @return Longitud de la circunferencia
     */
    public static double longitudCircunferencia(double r){
        return 2 * Math.PI * r;
    }
}