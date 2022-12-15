package ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación de variable temperatura que se solicitará al usuario
        int temperatura[] = new int[12];

        // Creación de escáner para leer datos
        Scanner key = new Scanner(System.in);

        // Imprimimos que queremos ciertos datos
        System.out.println("Deme la media de temperatura de todos los meses: ");

        // Solicita datos de sstemperatura al usuario
        for (int i = 0; i < temperatura.length; i++) {
            // A cada una de las posiciones se le asigna un valor pedido al usuario
            temperatura[i] = key.nextInt();
        }
        // Imprime un diagrama con el número de la temperatura de cada mes
        System.out.println("Temperatura por mes");
        for (int i = 0; i < temperatura.length; i++) {
            // Bucle for que imprimirá el número de asteriscos según la temperatura del mes
            for (int barras = 0; barras < temperatura[i]; barras++) {
                // Imprime astericos
                System.out.print("*");
            }
            // Imprime espacio para cada bucle
            System.out.println();
        }
        // Cierre de escáner
        key.close();

    }
}
