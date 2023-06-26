package clases;

public class GatoSimple {
    // Atributos ///////////////////
    String color;
    String nombre;
    String genero;
    double peso;

    // Constructor ////////////////
    public GatoSimple (String s){
        this.genero = s;
    }

    public String getGenero(){
        return this.genero;
    }

    public void maulla(){
        System.out.println("Miauuuu");
    }

    public void ronronea(){
        System.out.println("Mrrrrrr");
    }

    public void come(String comida){
        if(comida.equals("pescado")){
            System.out.println("Gracias humano");
        }else{
            System.out.println("Que me estas dando??!? Dame pescado!");
        }
    }

    public void peleaCon(GatoSimple contrincante){
        if (this.genero.equals("hembra")){
            System.out.println("No me gusta pelear");
        } else if(contrincante.genero.equals("hembra")){
            System.out.println("No peleo con hembras");
        } else {
            System.out.println("Bang! Awkkk! Kapow!");
        }
    }

}


























