import clases.Balde;
public class PruebaBalde {
    public static void main(String[] args){
        Balde baldecito = new Balde(5);
        Balde baldesote = new Balde(7);

        baldecito.setContenido(3);
        baldesote.setContenido(4);

        System.out.printf("Capadidad de baldecito: %dL\n", baldecito.getCapacidad());
        System.out.printf("Contiene %dL\n", baldecito.getContenido());
        baldecito.pinta();
        System.out.printf("Capacidad de baldesote: %dL\n", baldesote.getCapacidad());
        System.out.printf("Contiene %dL\n", baldesote.getContenido());
        baldesote.pinta();

        baldecito.llena();
        baldesote.vacia();

        System.out.printf("Capadidad de baldecito: %dL\n", baldecito.getCapacidad());
        System.out.printf("Contiene %dL\n", baldecito.getContenido());
        baldecito.pinta();
        System.out.printf("Capacidad de baldesote: %dL\n", baldesote.getCapacidad());
        System.out.printf("Contiene %dL\n", baldesote.getContenido());
        baldesote.pinta();

        baldecito.vuelcaEn(baldesote);

        System.out.printf("Capadidad de baldecito: %dL\n", baldecito.getCapacidad());
        System.out.printf("Contiene %dL\n", baldecito.getContenido());
        baldecito.pinta();
        System.out.printf("Capacidad de baldesote: %dL\n", baldesote.getCapacidad());
        System.out.printf("Contiene %dL\n", baldesote.getContenido());
        baldesote.pinta();
    }
}
