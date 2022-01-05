//Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

package unidad1.tarea8;

public class Ejercicio8_11 {

    public static void main(String[] args) {

        //Iniciamos el bucle FOR (i: Numeros del 1 al 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println();

            //Recorremos el bucle FOR (j: Numeros del 1 al 10)
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
        }
    }
}

