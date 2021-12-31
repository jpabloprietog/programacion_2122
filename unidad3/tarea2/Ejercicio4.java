// Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique
// cuántos espacios en blanco tiene.

package unidad3.tarea2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una frase:");
        String frase = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == ' ') contador++;
        }

        System.out.println("la frase tiene " + contador + " espacios.");
    }
}
