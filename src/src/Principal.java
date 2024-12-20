package src;
import modelos.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            mostrarMenu();
            int opcionMonedaOrigen = scanner.nextInt();

            if (opcionMonedaOrigen == 0) {
                seguir = false;
                System.out.println("Saliendo del programa, ¡Hasta luego!");
                break;
            }

            // Seleccionar la moneda origen
            Moneda monedaOrigen = seleccionarMoneda(opcionMonedaOrigen);
            if (monedaOrigen == null) {
                System.out.println("Opción Inválida. Intenta de nuevo.");
                continue;
            }

            // Solicitar moneda destino
            System.out.println("Ingrese el código de la moneda destino (por ejemplo, EUR, MXN, COP): ");
            String monedaDestino = scanner.next().toUpperCase();

            // Validar moneda destino
            if (!APIConversor.obtenerMonedasDisponibles().contains(monedaDestino)) {
                System.out.println("La moneda destino no es válida. Intenta nuevamente.");
                continue;
            }

            // Solicitar la cantidad a convertir
            System.out.println("Ingrese la cantidad a convertir: ");
            double cantidad = scanner.nextDouble();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor a cero. Intenta de nuevo.");
                continue;
            }

            try {
                // Convertir usando la API
                double resultado = APIConversor.obtenerTasaDeCambio(monedaOrigen.getCodigo(), monedaDestino, cantidad);

                // Mostrar el resultado
                System.out.printf("Resultado: %.2f %s%n", resultado, monedaDestino);
            } catch (Exception e) {
                // Capturamos cualquier excepción que ocurra y mostramos un mensaje de error
                System.out.println("Error al realizar la conversión. Intenta nuevamente.");
                e.printStackTrace(); // Imprime el stack trace para ayudar a depurar
            }

            // Preguntar si desea realizar otra conversión
            System.out.println("¿Desea realizar otra conversión? (s/n)");
            seguir = scanner.next().equalsIgnoreCase("s");
        }

        scanner.close();
    }

    // Método para mostrar el menú de monedas disponibles
    private static void mostrarMenu() {
        System.out.println("*--- Conversor de Monedas ---*");
        System.out.println("Seleccionar la moneda origen: ");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Peso Mexicano (MXN)");
        System.out.println("4. Libra Esterlina (GBP)");
        System.out.println("5. Peso Colombiano (COP)");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        System.out.println("*------------------------------*");
    }

    // Método para seleccionar la moneda origen basada en la opción ingresada
    private static Moneda seleccionarMoneda(int opcion) {
        switch (opcion) {
            case 1:
                return new Dolar();
            case 2:
                return new Euro();
            case 3:
                return new PesoMexicano();
            case 4:
                return new LibraEsterlina();
            case 5:
                return new PesoColombiano();
            default:
                return null;
        }
    }
}