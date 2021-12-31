package Entregable2122Tarde;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int filas;
        int columnas;
        int idpares = 0;
        int idimpares = 0;

        System.out.println("Introduce el número de fila: ");
        filas = scanner.nextInt();

        System.out.println("Introduzca el número de columnas");
        columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (14 + Math.random() * 65);
            }
        }
        System.out.println("Matriz");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));

        }

        int[] pares = new int[0];
        int[] impares = new int[0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    pares = Arrays.copyOf(pares, pares.length + 1);
                    pares[idpares] = matriz[i][j];
                    idpares++;
                }
                if (i % 2 != 0 && j % 2 != 0) {
                    impares = Arrays.copyOf(impares, pares.length + 1);
                    impares[idimpares] = matriz[i][j];
                    idimpares++;

                }

            }
        }
        System.out.println("pares");
        System.out.println(Arrays.toString(pares));
        System.out.println();

        System.out.println("impares");
        System.out.println(Arrays.toString(impares));
        System.out.println();

        int sumaPares = 0;
        int sumaImpares = 0;
        double mediaPares, mediaImpares;
        int maximoPares = 0;
        int minimoPares = 78;
        int maximoImpares = 0;
        int minimoImpares = 78;

        for (int i = 0; i < pares.length ; i++) {
            sumaPares = sumaPares + pares[i];
            if(pares[i] > maximoPares) maximoPares=pares[i];
            if(pares[i] < minimoPares) minimoPares=pares[i];

        }
        mediaPares=sumaPares/pares.length;

        for (int Impares: impares) {
            sumaImpares = sumaImpares + Impares;
            if(Impares > maximoImpares) maximoImpares=Impares;
            if(Impares  < minimoImpares) minimoImpares=Impares;

        }
        mediaImpares=sumaPares/impares.length;

        System.out.println("suma de pares" + sumaPares);
        System.out.println("suma de impares" + sumaImpares);
        System.out.println("Media de pares" + mediaPares);
        System.out.println("Media de impares" + mediaImpares);
        System.out.println("Maximo de pares" + maximoPares);
        System.out.println("Maximo de Impares" + maximoImpares);
        System.out.println("Minimo de pares" + minimoPares);
        System.out.println("Media de pares" + mediaPares);
        System.out.println("Media de impares" + mediaImpares);

    }
}

