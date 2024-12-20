package modelos;

//Clase que representa la moneda Peso Mexicano.  Hereda de la clase Moneda.

public class PesoMexicano extends Moneda{
    //Constructor de la clase PesoMexicano.  Llama al constructor de la clase padre Moneda con el código "MXN".

    public PesoMexicano(){
        super("MXN");
    }
    /**
     * Método específico para el Peso Mexicano.
     * Este método puede ser útil si necesitas describir el Peso Mexicano o realizar operaciones adicionales.
     *
     * @return Una descripción del Peso Mexicano.
     */
    @Override
    public String toString(){
        return "Moneda: Peso Mexicano (" + getCodigo() + ")";
    }
}
