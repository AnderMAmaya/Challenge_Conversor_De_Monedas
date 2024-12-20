package modelos;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Clase para conectarse a una API de tasas de cambio y obtener datos de conversión de monedas.
public class APIConversor {

    // URL base de la API para obtener las tasas de cambio.
    private static final String API_URL = "https://open.er-api.com/v6/latest/";

    // Lista de monedas disponibles
    private static final String[] MONEDAS_DISPONIBLES = {
            "USD", "EUR", "GBP", "BRL", "COP", "MXN"
    };

    /**
     * Método para obtener la tasa de cambio entre dos monedas.
     *
     * @param monedaOrigen Código de la moneda origen (por ejemplo, "USD").
     * @param monedaDestino Código de la moneda destino (por ejemplo, "EUR").
     * @param cantidad La cantidad a convertir.
     * @return El resultado de la conversión.
     * @throws Exception Si ocurre algún error al conectarse a la API o al procesar los datos.
     */
    public static double obtenerTasaDeCambio(String monedaOrigen, String monedaDestino, double cantidad) throws Exception {
        // Construir la URL completa para la API
        String urlCompleta = API_URL + monedaOrigen;

        // Abrir una conexión HTTP a la API
        HttpURLConnection conexion = (HttpURLConnection) new URL(urlCompleta).openConnection();
        conexion.setRequestMethod("GET"); // Solicitud GET

        // Leer la respuesta de la API
        BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String linea;

        while ((linea = lector.readLine()) != null) {
            respuesta.append(linea);
        }
        lector.close();

        // Convertir la respuesta a un objeto JSON
        JSONObject json = new JSONObject(respuesta.toString());

        // Validar si la moneda destino está en la lista
        JSONObject tasas = json.getJSONObject("rates");
        if (!tasas.has(monedaDestino)) {
            throw new Exception("La moneda destino no fue encontrada en la respuesta de la API.");
        }

        // Obtener la tasa de cambio y calcular el resultado
        double tasaDeCambio = tasas.getDouble(monedaDestino);
        return cantidad * tasaDeCambio;
    }

    /**
     * Método para obtener las monedas disponibles.
     *
     * @return Lista de monedas disponibles en formato String.
     */
    public static String obtenerMonedasDisponibles() {
        StringBuilder monedas = new StringBuilder();
        for (String moneda : MONEDAS_DISPONIBLES) {
            monedas.append(moneda).append(", ");
        }
        return monedas.toString().trim();
    }
}