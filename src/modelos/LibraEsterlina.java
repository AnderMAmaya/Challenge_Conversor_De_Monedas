package modelos;
//Clase hija que representa LIbra Esterlina, Hereda de la clase  Moneda
public class LibraEsterlina extends Moneda{

    //Constructor de la clase LibraEsterLina
    public LibraEsterlina(){
        super("GBP");
    }

    @Override
    public String toString() {
        return "Moneda: Libra Esterlina ("+ getCodigo()+")";
    }
}
