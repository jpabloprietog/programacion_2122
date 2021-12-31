// Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
// continuación, se introducirá por teclado esa cantidad de números enteros, y por último, los
// mostrará en el orden inverso al introducido.

package unidad3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantos números desea introducir?");
        int longitud = scanner.nextInt();
        int[] ar = new int[longitud];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduzca número:");
            ar[i] = scanner.nextInt();
        }

        int[] arInvertido = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {
            arInvertido[i] = ar[ar.length - 1 - i];
        }
        System.out.println(Arrays.toString(arInvertido));
    }
}
