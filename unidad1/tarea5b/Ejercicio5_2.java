//Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora.
//Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
//horas, los minutos no se deben introducir por teclado.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_2 {

    public static void main(String[] args) {

        int hora;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una hora");
        hora = scanner.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("buenos dias");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("buenas tardes");
        } else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5)) {
            System.out.println("buenas noches");
        } else {
            System.out.println("No ha introducido un numero del 0 al 24");
        }
    }
}