//Escribe un programa que dada una hora determinada (horas y minutos),
//calcule los segundos que faltan para llegar a la medianoche.

package Ejercicios.unidad1.comprobacion_condiciones_II;

import java.util.Scanner;

public class Ejercicio5_1_10 {

    public static void main(String[] args) {

        int hora, minutos, segundactual, segundfaltan;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce la hora actual");
        hora = scanner.nextInt();
        System.out.println("Introduce el minuto actual");
        minutos = scanner.nextInt();

        segundactual = (hora * 60 * 60) + (minutos * 60);
        segundfaltan = (24 * 60 * 60) - segundactual;

        System.out.println("Faltan " + segundactual + " segundos para la medianoche");

    }
}
