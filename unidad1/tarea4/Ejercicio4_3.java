// Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.

package unidad1.tarea4;

import java.util.Scanner;

public class Ejercicio4_3 {

    public static void main(String[] args) {

        double nota1, nota2, nota3, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        nota1 = scanner.nextDouble();

        System.out.println("Introduce la segunda nota");
        nota2 = scanner.nextDouble();

        System.out.println("Introduce la tercera nota");
        nota3 = scanner.nextDouble();

        media = (int) ((nota1 + nota2 + nota3) / 3);
        System.out.println("La parte entera de la media es: " + media);

    }
}
