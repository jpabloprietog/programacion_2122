//Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
//No se tendrán en cuenta los minutos ni los segundos.
//El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
//Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dia1 = 0;
        int dia2 = 0;

        String dia1Cadena;
        String dia2Cadena;

        do {
            System.out.println("Introduce el primer dia de la semana");
            dia1Cadena = scanner.next();

            if (dia1Cadena.equals("Lunes") || dia1Cadena.equals("1")) {

            } else if (dia1Cadena.equals("Martes") || dia1Cadena.equals("2")) {

            } else if (dia1Cadena.equals("Miercoles") || dia1Cadena.equals("3")) {

            } else if (dia1Cadena.equals("Jueves") || dia1Cadena.equals("4")) {

            } else if (dia1Cadena.equals("Viernes") || dia1Cadena.equals("5")) {

            } else if (dia1Cadena.equals("Sabado") || dia1Cadena.equals("6")) {

            } else if (dia1Cadena.equals("Domingo") || dia1Cadena.equals("7")) {

            } else {
                System.out.println("Primer dia introducido incorrectamente");
            }
        } while (dia1 < 1);

        do {
            System.out.println("Introduce el segundo dia de la semana");
            dia2Cadena = scanner.next();
            if (dia2Cadena.equals("Lunes") || dia2Cadena.equals("1")) {

            } else if (dia2Cadena.equals("Martes") || dia2Cadena.equals("2")) {

            } else if (dia2Cadena.equals("Miercoles") || dia2Cadena.equals("3")) {

            } else if (dia2Cadena.equals("Jueves") || dia2Cadena.equals("4")) {

            } else if (dia2Cadena.equals("Viernes") || dia2Cadena.equals("5")) {

            } else if (dia2Cadena.equals("Sabado") || dia2Cadena.equals("6")) {

            } else if (dia2Cadena.equals("Domingo") || dia2Cadena.equals("7")) {

            } else {
                System.out.println("Primer dia introducido incorrectamente");
            }
        } while (dia2 < dia1);
        System.out.println("Entre todos los días introducidos hay " + ((dia2 - dia1) * 24) + " horas");
    }
}