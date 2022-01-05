//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int notas;
        int alumnosAprobados = 0;
        int alumnosCondicionados = 0;
        int alumnosSuspensos = 0;

        //El bucle FOR es hasta 6, que son las notas introducidas por el usuario.
        for (int i = 1; i <= 6; i++) {
            System.out.println("Introduzca una nota");
            notas = scanner.nextInt();
            if (notas >= 5) {
                //cantidad aprobados
                alumnosAprobados++;
            } else if (notas < 4) {
                //cantidad suspensos
                alumnosSuspensos++;
            } else {
                //cantidad condicionados
                alumnosCondicionados++;
            }
        }
        System.out.println(alumnosAprobados + " Alumnos Aprobados");
        System.out.println(alumnosCondicionados + " Alumnos Condicionados");
        System.out.println(alumnosSuspensos + " Alumnos Suspensos");
    }
}
