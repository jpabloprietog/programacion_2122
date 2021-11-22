//Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches
// según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
//respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
package Ejercicios.unidad1.comprobacion_condiciones_II;

import java.util.Scanner;

public class Ejercicio5_1_2 {

    public static void main(String[] args) {

        byte hora;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una hora");
        hora = scanner.nextByte();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5)) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("No ha introducido un número del 0 al 24");
        }


    }
}
