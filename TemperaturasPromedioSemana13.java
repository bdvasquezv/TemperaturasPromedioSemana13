package com.mycompany.temperaturaspromediosemana13;

// Programa para calcular la temperatura promedio de varias ciudades en varias semanas
public class TemperaturasPromedioSemana13 {

    // Función que calcula el promedio de cada ciudad
    // Recibe una matriz con temperaturas [ciudades][semanas]
    public static double[] calcularPromedio(double[][] temperaturas) {
        double[] promedios = new double[temperaturas.length]; // arreglo de promedios por ciudad

        // Recorremos cada ciudad
        for (int i = 0; i < temperaturas.length; i++) {
            double suma = 0;
            // Recorremos las semanas de esa ciudad
            for (int j = 0; j < temperaturas[i].length; j++) {
                suma += temperaturas[i][j];
            }
            // Promedio de la ciudad i
            promedios[i] = suma / temperaturas[i].length;
        }

        return promedios;
    }

    public static void main(String[] args) {
        // Ejemplo de matriz de temperaturas: 3 ciudades, 4 semanas
        double[][] temperaturas = {
            {20.5, 22.0, 19.8, 21.3}, // Ciudad 1
            {25.0, 24.5, 26.1, 23.9}, // Ciudad 2
            {18.2, 19.0, 17.5, 18.7}  // Ciudad 3
        };

        // Llamamos a la función
        double[] promedios = calcularPromedio(temperaturas);

        // Mostramos resultados
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Ciudad " + (i + 1) + " - Promedio: " + promedios[i] + " °C");
        }
    }
}
