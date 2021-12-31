//Realiza un programa que calcule la media de tres notas que se solicitarán al usuario.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_6 {

    public static void main(String[] args) {

        double nota1, nota2, nota3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce la primera nota");
        nota1 = scanner.nextDouble();

        System.out.println("introduce la segunda nota");
        nota2 = scanner.nextDouble();

        System.out.println("introduce la tercera nota");
        nota3 = scanner.nextDouble();

        int media = (int) ((nota1 + nota2 + nota3)/3);

        System.out.println("La media es: " + media);
    }
}
