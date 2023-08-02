package clases;

public class Balde {
    // ATRIBUTOS ///////////////////////////////
    int capacidad; // Capacidad en litros
    int contenido; // Contenido en litros

    // METODOS /////////////////////////////////
    // Constructor
    public Balde(int c){
        this.capacidad = c;
    }

    // Getters
    public int getCapacidad(){
        return this.capacidad;
    }

    public int getContenido(){
        return this.contenido;
    }
    
    // Setters
    public void setContenido(int litros){
        this.contenido = litros;
    }

    public void llena(){
        this.contenido = this.capacidad;
    }

    public void vacia(){
        this.contenido = 0;    
    }
    /**
     * Pinta en pantalla
     * El contenido del balde
     */
    public void pinta(){
        for (int nivel = this.capacidad; nivel > 0; nivel --){
            if (this.contenido >= nivel){
                System.out.println("#~~~~#");
            }else{
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }

    public void vuelcaEn(Balde destino){
        int libres = destino.getCapacidad() - destino.getContenido();
        
        if (libres > 0){
            if (this.contenido <= libres){
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            } else {
                this.contenido -= libres;
                destino.llena();
            }
        }
    }
}
