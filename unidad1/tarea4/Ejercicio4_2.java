// Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
// Hay que tener en cuenta que la media puede contener decimales.

package unidad1.tarea4;

import java.util.Scanner;

public class Ejercicio4_2 {

    public static void main(String[] args) {

        //REVISAR
        int nota1, nota2;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        nota1 = scanner.nextInt();

        System.out.println("Introduce la segunda nota");
        nota2 = scanner.nextInt();

        media = (double) (nota1 + nota2) / 2;
        System.out.println("La nota media es: " + media);

    }
}
