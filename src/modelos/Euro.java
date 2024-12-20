package modelos;
//Clase que representa la moneda Euro. Hereda de la clase Moneda.

public class Euro extends Moneda{
    // Constructor de la clase Euro. Llama al constructor de la clase padre Moneda con el código "EUR".
    public Euro(){
        super("EUR"); //EUR Código ISO para Euro.
    }
    /**
     * Método específico para el Euro.
     * Este método puede ser útil si necesitas describir el Euro o realizar operaciones adicionales.
     *
     * @return Una descripción del Euro.
     */
    @Override
    public String toString(){
        return "Moneda: Euro (" + getCodigo() + ")";
    }
}
