package ejercicio2;

public class Main {

    public static void main(String[] args) {
        // Creamos una variable para guardar la suma
        int sumaTotal = 0;
        // Declaración de variables con números aleatorios en una tabla array
        int numAleatorios[] = new int[10];

        // Creamos un bucle en el que empecemos en 0 hasta el número total de la tabla menos 1
        for (int i = 0; i < numAleatorios.length; i++) {
            // Por cada vuelta vamos añadiendo a cada posición un número aleatorio del 1 al 100
            numAleatorios[i] = (int) (Math.random() * 100 + 1);
            // Imprimimos resultado en cada vuelta
            System.out.println(numAleatorios[i]);
            // Sumamos el valor de las variables por cada vuelta
            sumaTotal += numAleatorios[i];
        } // Imprimimos el resultado de la suma
        System.out.println("La suma total de los números es: " + sumaTotal);

    }
}