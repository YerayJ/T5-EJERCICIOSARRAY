package ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaración de tabla con números decimales
        double numAleatorios[] = new double[5];

        // Creamos escáner para pedir datos
        Scanner key = new Scanner(System.in);

        // Creamos bucle para recorrer la tabla
        for (int i = 0; i < numAleatorios.length; i++) {
            // Pedimos el valor al usuario
            System.out.println("Deme un número: ");
            // Con el escáner pedimos datos al usuario
            numAleatorios[i] = key.nextDouble();
        }
        // Avisamos de que vamos a imprimir una tabla
        System.out.println("Los números introducidos son los siguientes: ");

        // Creamos bucle para recorrer la tabla
        for (int i = 0; i < numAleatorios.length; i++) {
            // Imprimimos la tabla por cada posición
            System.out.println(numAleatorios[i]);
        }


    }
}