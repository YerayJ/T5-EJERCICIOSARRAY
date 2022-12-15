package ejercicio8;

public class Main {
    public static void main(String[] args) {
        // Creación de tres tablas de tipo int
        int numeros[] = new int[20];
        int cuadrados[] = new int[20];
        int cubos[] = new int[20];

        // Recorre la tabla
        for (int i = 0; i < numeros.length; i++) {
            // Asigna valor entre 1 y 100 a numeros según su posición
            numeros[i] = (int) (Math.random()*100+1);
            // Con Math pow cuadrados tomará el valor de numeros[i] haciendo su cuadrado
            cuadrados [i] = (int) (Math.pow(numeros[i],2));
            // Con Math pow cuadrados tomará el valor de numeros[i] haciendo su cubo
            cubos [i] = (int) (Math.pow(numeros[i],3));
        }
        // Imprime una guía para saber cuál es cada número
        System.out.println("ALEATORIO " + "CUADRADO " + "CUBO");

        // Recorre numeros
        for (int i = 0; i < numeros.length; i++){
            // Imprime las tres variables dependiendo de su posición
            System.out.println("    " + numeros[i] + "      " + cuadrados[i] + "    " + cubos[i]);
        }

    }
}
