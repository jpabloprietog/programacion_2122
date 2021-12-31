// Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla
// unidimensional que debe rellenar de la siguiente forma: se leerá por teclado una serie de
// números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares. La
// función tiene que devolver la cantidad de impares desechados.

package unidad3.tarea3;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        int[] ar = new int[6];
        System.out.println("Has desechado " + rellenaPares(ar) + " impares");
    }

    public static int rellenaPares(int[] ar) {
        Scanner scanner = new Scanner(System.in);
        int numimpares = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Introduce un número");
            int proximoNum = scanner.nextInt();
            while (proximoNum % 2 != 0) {
                numimpares++;
                System.out.println("Introduce un número");
                proximoNum = scanner.nextInt();
            }
            ar[i] = proximoNum;
        }

        return numimpares;
    }
}
