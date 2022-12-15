package ejercicio10;

public class Main {
    public static void main(String[] args) {
        // Array de tipo int
        int numeros[] = new int[100];

        // Recorre array numeros
        for (int i = 0; i < numeros.length; i++) {
            // Se asigna valor aleatorio del 1 al 10 en cada posición del array
            numeros[i] = (int) (1 + Math.random() * 10 + 1);
        }

    }
}
