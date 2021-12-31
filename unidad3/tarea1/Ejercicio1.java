// Diseñar una función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla
// n veces el mensaje "Eco..."

package unidad3.tarea1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int num1 = scanner.nextInt();

        eco(num1);
    }

    static void eco(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("Eco");
        }
    }
}

