// En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o
// "Mayor", según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.

package unidad3.tarea2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("JUGADOR 1: Introduce la contraseña (una palabra):");
        String pass = scanner.next();

        System.out.println("PISTA 1: El número de caracteres es " + pass.length());

        System.out.println("PISTA 2: La primera letra es " + pass.charAt(0));

        System.out.println("PISTA 3: La última letra es " + pass.charAt(pass.length() - 1));

        System.out.println("Turno del JUGADOR 2:");
        String pass2 = scanner.next();

        do {
            System.out.println("Fallaste");
            if (pass.compareToIgnoreCase(pass2) > 0) {
                System.out.println("mayor");
            } else System.out.println("menor");
            pass2 = scanner.next();
        } while (!pass.equalsIgnoreCase(pass2));
        System.out.println("Acertaste");
    }
}
