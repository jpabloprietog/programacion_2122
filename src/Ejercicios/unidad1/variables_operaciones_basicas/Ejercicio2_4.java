//Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
// y calcule su equivalencia en metros (1 milla = 1609 m).
package Ejercicios.unidad1.variables_operaciones_basicas;

import java.util.Scanner;

public class Ejercicio2_4 {

    public static void main(String[] args) {

        int longitud;
        int milla = 1609;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una longitud");
        longitud = scanner.nextInt();

        System.out.println("La longitud es: " + (longitud * milla) + " metros");
    }
}
