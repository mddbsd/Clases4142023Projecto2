package clases;

public class Alumno {
    String nombre;
    String apellido;
    int edad;
    int[] notas = new int[3];

    /**
     * Constructor por defecto
     */
    public Alumno(){

    }
    /**
     * Constructor con datos basicos
     * @param n Nombre del alumno
     * @param a Apellido del alumno
     * @param e Edad del alumno
     */
    public Alumno (String n, String a, int e){
        this.nombre = n;
        this.edad = e;
        this.apellido = a;
    }
    /**
     * Construcor con los datos completos
     * @param n Nombre del alumno
     * @param a Apellido del alumno
     * @param e Edad del alumno
     * @param aNotas Array que contiene las notas
     */
    public Alumno (String n, String a, int e, int aNotas[]){
        this.nombre = n;
        this.edad = e;
        this.apellido = a;
        this.notas = aNotas;
    }
    // Setters ///////////////////////////
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setApellido(String a){
        this.apellido = a;
    }
    public void setEdad(int e){
        this.edad = e;
    }
    public void setNotas(int aNotas[]){
        this.notas = aNotas;
    }
    // Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public int[] getNotas(){
        return this.notas;
    }
}









