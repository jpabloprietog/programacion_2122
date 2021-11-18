//Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.
package Ejercicios.unidad1.comprobacion_condiciones;

import java.util.Scanner;

public class Ejercicio5_5 {

    public static void main(String[] args) {

        long primero, segundo, tercero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        primero = scanner.nextLong();
        System.out.println("Introduce el segundo número");
        segundo = scanner.nextLong();
        System.out.println("Introduce el tercer número");
        tercero = scanner.nextLong();

        if (primero > segundo && primero > tercero) {
            System.out.println("El número " + primero + " es el mayor");
        }
        if (segundo > primero && segundo > tercero) {
            System.out.println("El número " + segundo + " es el mayor");
        }
        if (tercero > segundo && tercero > primero) {
            System.out.println("El número " + tercero + " es el mayor");
        }


    }
}
