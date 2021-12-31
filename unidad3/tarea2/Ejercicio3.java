// Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición
// central es o no un espacio.

package unidad3.tarea2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una frase:");
        String frase = scanner.nextLine();

        char central = frase.charAt(frase.length() / 2);
        if (central == ' ') {
            System.out.println("El carácter central es un espacio");
        } else {
            System.out.println("El carácter central NO es un espacio");
        }
    }
}