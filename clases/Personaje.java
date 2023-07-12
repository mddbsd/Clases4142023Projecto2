package clases;

public class Personaje {
    double hp;
    double mp;
    String nombre;
    String clase;

    /**
     * Constructor por defecto.
     */
    public Personaje(){
        this.nombre = "default";
        this.clase = "default";
        this.hp = 0;
        this.mp = 0;
    }
    /**
     * Constructor con atributos definidos
     * @param hp vida del personaje
     * @param mp puntos de accion
     * @param nombre nombre del peresonaje
     * @param clase nombre de la clase
     */
    public Personaje(double hp, double mp, String nombre, String clase){
        this.hp = hp;
        this.mp = mp;
        this.nombre = nombre;
        this.clase = clase;        
    }
    // SETTERS //////////////////////////////////////////////////////
    public void setHp(double hp){
        this.hp = hp;
    }
    public void setMp(double mp){
        this.mp = mp;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setClase(String clase){
        this.clase = clase;
        switch(clase){
            case "guerrero":
                this.hp = 100;
                this.mp = 50;
                break;
            case "mago":
                this.hp = 50;
                this.mp = 100;
                break;
        }
    }
    // GETTERS /////////////////////////////////////////////////////
    public double getHp(){
        return this.hp;
    }
    public double getMp(){
        return this.mp;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getClase(){
        return this.clase;
    }

    public void saluda(){
        if(this.clase.equals("guerrero")){
            System.out.println("Soy el guerrero " + this.nombre);
        }else if (this.clase.equals("mago")){
            System.out.println("Soy el mago " + this.nombre);
        }
        
    }

}


