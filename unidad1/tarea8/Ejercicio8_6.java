//Escribir todos los múltiplos de 7 menores que 100.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int multiplos = 1;

        for (int i = 1; i < 100; i++) {
            multiplos = 7 * i;
            System.out.println(multiplos);
        }
    }
}

