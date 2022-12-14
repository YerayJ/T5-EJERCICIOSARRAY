package ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Definimos una tabla de tipo double
        double numReales[] = new double[10];

        // Creamos escaner para pedir datos al usuario
        Scanner key = new Scanner(System.in);

        // Variable para saber cuál es el número mayor, le damos valor mínimo de double
        double max = Double.MIN_VALUE;
        // Variable para saber cuál es el número menor, le damos valor máximo de double
        double min = Double.MAX_VALUE;

        // Bucle que recorre la tabla
        for (int i = 0; i < numReales.length; i++) {
            // Pedimos datos al usuario
            numReales[i] = key.nextDouble();
        }

        // Foreach de la tabla numeros
        for (double numeros : numReales) {
            // If que comprueba que número es mayor, lo compara con la i actual y si es
            // mayor se le asigna a la variable max
            if (numeros > max) {
                max = numeros;
            }
            // If que comprueba que número es mayor, lo compara con la i actual y si es
            // menor se le asigna a la variable min
            if (numeros < min) {
                min = numeros;
            }

        }

        // Resultado de las variables
        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);

        // Cerramos el escáner
        key.close();

    }
}
