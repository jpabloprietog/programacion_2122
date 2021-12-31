package Entregable2122Tarde;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {

        String[][] matriz = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};

        System.out.println("matriz");
        for (String[] fila : matriz) {
            System.out.println(Arrays.toString(fila));

        }
        System.out.println();

        System.out.println("Fila: ");
        String[] fila = {"j", "k", "l"};
        System.out.println(Arrays.toString(fila));
        System.out.println();

        int pos = 1;
        System.out.println("pos = " + pos);
        System.out.println();

        System.out.println("El resultado de insertarEnLaMatriz será ");
        for (String[] fila2 : insertarFilaEnLaMatriz(matriz, fila, pos)) {
            System.out.println(Arrays.toString(fila2));
        }
    }

    public static String[][] insertarFilaEnLaMatriz(String[][] matriz, String[] fila, int pos) {
        String[][] matrizResultado = new String[matriz.length + 1][matriz[0].length];

        int idfila = 0;

        for (int i = 0; i < pos; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                matrizResultado[i][j] = matriz[i][j];
            }
            idfila++;
        }
        for (int i = 0; i < matrizResultado[pos].length; i++) {
            matrizResultado[pos][i] = matriz[pos][i];

        }

        for (int i = idfila + 1; i < pos; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                matrizResultado[i][j] = matriz[i - 1][j];
            }
        }
        return matrizResultado;
    }
}