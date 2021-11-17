//Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
//Hay que tener en cuenta que la media puede contener decimales.
package unidad1.tipo_datos_conversion_tipo;

import java.util.Scanner;

public class Ejercicio4_2 {

    public static void main(String[] args) {

        int nota1, nota2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la primera nota");
        nota1 = scanner.nextInt();

        System.out.println("Introduce la segunda nota");
        nota2 = scanner.nextInt();

        double media = ((nota1 + nota2)/2);

        System.out.println("La media de las dos notas es: " + media);
    }
}

