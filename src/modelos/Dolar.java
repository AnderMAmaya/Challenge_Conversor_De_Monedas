package modelos;
//Clase que representa la moneda Dólar. Hereda de la clase Moneda y utiliza su funcionalidad.

public class Dolar extends Moneda {
    // Constructor de la clase Dólar,  Llama al constructor de la clase padre Moneda con el código "USD".
    public  Dolar(){
        super("USD"); //USD Codigo ISO para Dólar.
    }
    /**
     * Método específico para el Dólar.
     * Este método puede ser útil si necesitas describir el Dólar o realizar operaciones adicionales.
     *
     * @return Una descripción del Dólar.
     */
    @Override
    public String toString(){
        return "Moneda: Dólar (" + getCodigo()+")";
    }
}
