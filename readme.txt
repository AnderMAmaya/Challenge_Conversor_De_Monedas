Conversor de Monedas

Este es el proyecto conversor de monedas para alura latam en Java que permite realizar conversiones de monedas utilizando programación orientada a objetos (POO) e integrándose con una API para obtener tasas de cambio en tiempo real.

Funcionalidades principales

Conversión de monedas en tiempo real.

Selección de la moneda de origen entre opciones predefinidas.

Ingreso de cualquier moneda destino utilizando su código (por ejemplo, USD, EUR, COP).

Validación de entradas para evitar errores comunes.

Mensajes de error claros en caso de problemas con la API o entradas inválidas.

Tecnologías utilizadas

Java: Lenguaje de programación principal.

API Exchange Rates: Fuente de las tasas de cambio en tiempo real.

POO (Programación Orientada a Objetos): Estructuración del proyecto mediante clases y herencia.

Estructura del proyecto

ConversorDeMonedas/src/
|-- src/
|   |-- Principal.java         # Clase principal que ejecuta el programa.
|-- modelos/
    |-- APIConversor.java      # Clase para conectarse a la API y obtener las tasas de cambio.
    |-- Moneda.java            # Clase base para las monedas.
    |-- Dolar.java             # Clase que representa el Dólar estadounidense.
    |-- Euro.java              # Clase que representa el Euro.
    |-- PesoMexicano.java      # Clase que representa el Peso Mexicano.
    |-- LibraEsterlina.java    # Clase que representa la Libra Esterlina.
    |-- PesoColombiano.java    # Clase que representa el Peso Colombiano.

Cómo usar el programa

Compila el proyecto:

javac src/Principal.java

Ejecuta el programa:

java src.Principal

Sigue las instrucciones en pantalla para seleccionar la moneda origen, ingresar la moneda destino y la cantidad a convertir.

Ejemplo de uso

*--- Conversor de Monedas ---*
Seleccionar la moneda origen:
1. Dolar (USD)
2. Euro (EUR)
3. Peso Mexicano (MXN)
4. Libra Esterlina (GBP)
5. Peso Colombiano (COP)
0. Salir
Opcion: 1
Ingrese el código de la moneda destino (por ejemplo, EUR, MXN, COP): EUR
Ingrese la cantidad a convertir: 100
Resultado: 91.34 EUR
¿Desea realizar otra conversión? (s/n): n
Saliendo del programa, ¡Hasta luego!

Notas importantes

Asegúrate de tener una conexión a internet activa para que el programa pueda conectarse a la API.

Si el programa indica un error con la moneda destino, verifica que hayas ingresado un código válido (por ejemplo, USD, EUR, etc.).

Las tasas de cambio son proporcionadas por la API y pueden variar en tiempo real.

Créditos

Este proyecto fue desarrollado por Anderson Moreno Amaya como proyecto de aprendizaje sobre programación orientada a objetos, manejo de APIs y validación de entradas en Java.