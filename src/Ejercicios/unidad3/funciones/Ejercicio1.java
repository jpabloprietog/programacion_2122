//Diseñar una función eco() a la que se le pasa como parámetro un número n,
//y muestra por pantalla n veces el mensaje "Eco..."

package Ejercicios.unidad3.funciones;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int numero1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        numero1 = scanner.nextInt();

        eco(numero1);
    }

    static void eco(int numero1) {
        for (int i = 0; i < numero1; i++) {
            System.out.println("Eco");

        }
    }
}



