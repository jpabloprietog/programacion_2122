//Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
//Se introducirán las edades de los elumnos hasta que una de ellas sea negativa.
//La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido su edad,
//y cuántos alumnos son mayores de edad.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edad = 0;
        int sumaEdad = 0;
        int numAlumno = 0;
        int numAlumMayorEdad = 0;
        double media = 0;

        do {
            System.out.println("introduce la edad");
            edad = scanner.nextInt();
            if (edad >= 0) {
                //+= es lo mismo que poner -> sumaEdad = sumaEdad + edad;
                sumaEdad += edad;
                numAlumno++;
                if (edad >= 18) {
                    numAlumMayorEdad++;
                }
            } else numAlumno = 1;
        } while (edad >= 0);

        double numAlumnoTotal = numAlumno + numAlumMayorEdad;
        media = sumaEdad/numAlumnoTotal;

        System.out.println("La suma de las edades es " + sumaEdad);
        System.out.println("La media de las edades es " + media);
        System.out.println("Número de alumnos introducidos es " + (numAlumnoTotal + numAlumMayorEdad));
        System.out.println("Número de alumnos mayores de edad " + numAlumMayorEdad);
    }
}
