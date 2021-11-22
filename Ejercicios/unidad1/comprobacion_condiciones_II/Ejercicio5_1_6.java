//Realiza un programa que calcule la media de tres notas que se solicitarán al usuario.

package Ejercicios.unidad1.comprobacion_condiciones_II;

import java.util.Scanner;

public class Ejercicio5_1_6 {

    public static void main(String[] args) {

        double nota1, nota2, nota3, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        nota1 = scanner.nextDouble();
        System.out.println("Introduce la segunda nota");
        nota2 = scanner.nextDouble();
        System.out.println("Introduce la tercera nota");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("La nota media es " + media);
    }
}
