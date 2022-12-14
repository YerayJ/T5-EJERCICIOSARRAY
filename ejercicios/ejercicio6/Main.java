package ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definimos una tabla de números enteros
        int numeros[] = new int[8];

        // Creamos escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos los números de la tabla al usuario
        System.out.println("Deme 8 números: ");

        // Recorremos la tabla
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = key.nextInt();
        }

        // Hacemos un foreach para recorrer tabla
        for (double parImpar: numeros) {
            // Comprobamos si es par o impar
            if (parImpar % 2 == 0) {

                System.out.println(parImpar + " par");
            } else {
                System.out.println(parImpar + " impar");
            }
        }

    }
}
