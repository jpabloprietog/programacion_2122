//Crea un programa que pida al usuario que introduzca el número 12.
//Después debe decirle si lo ha hecho correctamente o no.

package unidad1.tarea5;

import java.util.Scanner;

public class Ejercicio5_2 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el numero 12");
        numero = scanner.nextInt();

        if (numero == 12) {
            System.out.println("Lo ha hecho correctamente");
        } else {
            System.out.println("No lo ha hecho correctamente");
        }
    }
}
