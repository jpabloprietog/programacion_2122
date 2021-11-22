//Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
//Se introducirán las edades de los alumnos hasta que una de ellas sea negativa.
//La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido su edad,
//y cuántos alumnos son mayores de edad.

package Ejercicios.unidad1.bucles;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int SumaEdad = 0;
        double media = 0;
        int numAlumMayorEdad = 0;
        int numAlum = 0;
        int edad = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce de una en una la edad de los alumnos. Para finalizar introduzca una edad negativa");

        do {
            edad = scanner.nextInt();
            if (edad >= 0) {
                SumaEdad += edad;
                numAlum++;
                if (edad >= 18) {
                    numAlumMayorEdad++;
                }
            } else numAlum = 1;
        } while (edad >= 0);
        media = SumaEdad / (numAlum);
        System.out.println("La suma de las edades es " + SumaEdad);
        System.out.println("La media de las edades es " + media);
        System.out.println("Número de alumnos introducidos es " + media);
        System.out.println("Número de alumnos mayores de edad " + numAlumMayorEdad);
    }
}
