package ejercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Definimos una tabla
        int num[] = new int[12];

        // Asignamos los valores que nos vienen en el enunciado
        num[0] = 39;
        num[1] = -2;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        // Foreach que imprime el resultado de la tabla
        for (int valores : num) {
            System.out.print(" " + valores);
        }


    }
}