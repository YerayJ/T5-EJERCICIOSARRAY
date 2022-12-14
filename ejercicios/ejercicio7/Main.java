package ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación tabla de tipo Int
        int numeros[] = new int[10];

        // Creación escáner
        Scanner key = new Scanner(System.in);

        // Recorre la tabla para pedir datos uno por uno
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = key.nextInt();
        }

        for (int i = numeros.length-1; i >= 0 ; i--) {
            System.out.println(numeros[i]);
        }

    }
}
