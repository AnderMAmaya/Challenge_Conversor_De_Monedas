package modelos;
/**
 * Clase base para representar una moneda.
 * Esta clase define las propiedades y comportamientos comunes que tendrán todas las monedas.
 * Las clases específicas (como Dólar, Euro, etc.) heredarán de esta clase.
 */
public class Moneda {
    // Atributo protegido para almacenar el código de la moneda (por ejemplo, USD, EUR, etc.).
    protected String codigo;
    /**
     * Constructor de la clase Moneda.
     * Este constructor inicializa el código de la moneda.

     * @param codigo El código de la moneda (ISO 4217, como USD o EUR).
     */
    public Moneda(String codigo){
        this.codigo = codigo;
    }
    /**
     * Método para obtener el código de la moneda.
     * Este método será utilizado por otras clases para identificar la moneda.

     * @return El código de la moneda como una cadena de texto.
     */
    public  String getCodigo(){
        return codigo;
    }
    /**
     * Método para representar la información de la moneda como una cadena.
     * Este método puede ser útil para depuración o para mostrar detalles de la moneda.

     * @return Una descripción de la moneda.
     */
    @Override
    public String toString(){
        return "Moneda{" +
                "codigo= "+ codigo + '\''+
                '}';
    }
}
