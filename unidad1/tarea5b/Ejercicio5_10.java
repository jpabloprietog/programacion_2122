//Escribe un programa que dada una hora determinada (horas y minutos),
//calcule los segundos que faltan para llegar a la medianoche.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_10 {

    public static void main(String[] args) {

        int hora, minuto;
        int segundosTranscurridos;
        int SegundosHastaMediaNoche;

        Scanner scanner = new Scanner(System.in);

        System.out.println("hora: ");
        hora = scanner.nextInt();

        System.out.println("minuto: ");
        minuto = scanner.nextInt();

        //Multiplicamos (hora * 3600) para pasar una hora a segundos, y (minuto * 60) para pasar los minutos a segundo.
        //Luego sumamos segundos de la hora a los segundos de los minutos.
        segundosTranscurridos = (hora * 3600) + (minuto * 60);
        SegundosHastaMediaNoche = (24 * 3600) - segundosTranscurridos;

        System.out.println("Desde las " + hora + ":" + minuto + ":" + " hasta la medianoche faltan " + SegundosHastaMediaNoche + " segundos. ");

    }
}
