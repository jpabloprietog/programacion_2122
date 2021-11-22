//Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
//y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).
package Ejercicios.unidad1.operaciones_basicas_tipo_datos;

import java.util.Scanner;

public class Ejercicio3_4 {

    public static void main(String[] args) {

        float longitud;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la longitud");
        longitud = scanner.nextFloat();

        System.out.println("La longitud en kilometros es: " + ((float) longitud * 1609) + " Km");


    }
}
