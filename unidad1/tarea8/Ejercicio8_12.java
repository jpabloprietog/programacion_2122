//Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay.
//Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int calificacion;
        boolean suspenso = false;

        //Iniciamos el bucle FOR
        for (int i = 1; i <= 5; i++) {
            System.out.println("introduzca una calificación");
            calificacion = scanner.nextInt();

            //Si se cumple esta condición, suspenso es verdad
            if (calificacion < 5) {
                suspenso = true;
            }
        }
        //Al final el programa dice si hay algun suspenso o no lo hay.
        if (suspenso) {
            System.out.println("Hay algun suspenso");
        } else {
            System.out.println("No hay ningun suspenso");
        }
    }
}
