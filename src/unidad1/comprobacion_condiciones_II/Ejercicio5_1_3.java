//Escribe un programa en que dado un número del 1 a 7
//escriba el correspondiente nombre del día de la semana.

package unidad1.comprobacion_condiciones_II;

import java.util.Scanner;

public class Ejercicio5_1_3 {

    public static void main(String[] args) {

        byte dia;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7, para conocer el día de la semana");
        dia = scanner.nextByte();

        switch (dia) {

            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("No ha introducido un número del 1 al 7");
        }

    }
}
