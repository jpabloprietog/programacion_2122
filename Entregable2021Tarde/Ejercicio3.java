//Hacer un algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N
//filas y N columnas con números aleatorios entre 100 y 200.
//
//Mostrar dicho array y a continuación rotarlo 90 grados:

package Entregable2021Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (100 + Math.random() * 101);
            }
        }

        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        int[][] matriz90 = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz90[i][j] = matriz[matriz.length - 1 - j][i];
            }
        }

        System.out.println("Array girado 90 grados:");

        for (int[] fila : matriz90) {
            System.out.println(Arrays.toString(fila));
        }
    }
}

