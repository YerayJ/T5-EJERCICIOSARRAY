package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array de tipo int
        int numeros[] = new int[100];
        // Variable pedida al usuario
        int num;
        // String donde se guarda las posiciones del array
        String posicion = " ";

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Pide valor al usuario de la variable num
        System.out.println("Deme un número del 1 al 10d");
        num = key.nextInt();

        // Recorre array numeros
        for (int i = 0; i < numeros.length; i++) {
            // Se asigna valor aleatorio del 1 al 10 en cada posición del array
            numeros[i] = (int) (1 + Math.random() * 10 + 1);

        }
        // Bucle que recorre el array
        for (int i = 0; i < numeros.length; i++) {
            // Comprueba que nuestro número está en el array
            if (num == numeros[i]) {
                // Si esta imprime la posición de dicho número
                posicion = posicion + i + " ";
            }
        }
        
        // Imprime resultado de posición
        System.out.println("Su número se muestra en las posiciones: " + posicion);

        // Cierre de escáner
        key.close();

    }
}
