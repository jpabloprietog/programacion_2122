// Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el
// segundo, debe insertar otra intentando acertarla con las pistas que le dará el programa:
// número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o
// "Fallaste".

package unidad3.tarea2;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("JUGADOR 1: Introduce la contraseña (una palabra):");
        String pass = scanner.next();

        System.out.println("PISTA 1: El número de caracteres es " + pass.length());

        System.out.println("PISTA 2: La primera letra es " + pass.charAt(0));

        System.out.println("PISTA 3: La última letra es " + pass.charAt(pass.length() - 1));

        System.out.println("Turno del JUGADOR 2:");
        String pass2 = scanner.next();

        if (pass.equalsIgnoreCase(pass2)) {
            System.out.println("Acertaste");
        } else {
            System.out.println("Fallaste");
        }
    }
}
