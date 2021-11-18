package Ejercicios.unidad3;

import java.util.Scanner;

public class Media_artimetica {

    public static void main(String[] args) {

        int nota1, nota2;
        double total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la primera nota");

        nota1 = scanner.nextInt();

        System.out.println("Introduce la segunda nota");

        nota2 = scanner.nextInt();

        total = ((double) nota1 + (double) nota2 );
        System.out.println("El total es: " + ((double) nota1 + (double) nota2 ));

        System.out.println("La media artimetica es: " + ((total)/2));

        scanner.close();

    }
}
