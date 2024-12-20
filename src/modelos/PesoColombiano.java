package modelos;
//Clase hija Peso Colombiano hereda de clase Madre Moneda
public class PesoColombiano extends Moneda{
    //Constructor
    public PesoColombiano(){
        super("COP");
    }

    @Override
    public String toString() {
        return "Moneda: Peso Colombiano (" + getCodigo() + ")";
    }
}
