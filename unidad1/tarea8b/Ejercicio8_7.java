//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long numero;

        System.out.println("Introduce un número");
        numero = scanner.nextLong();

        long resto = numero;
        long numeroAlReves = 0;


        while (numero > 0) {
            //Con esto, obtenemos la ultima cifra del número
            resto = numero % 10;

            //Con esto, obtenemos la cifra anterior a la ultima.
            numero = numero / 10;

            //De esta forma, le damos la vuelta al número.
            numeroAlReves = numeroAlReves * 10 + resto;
        }
        System.out.println(numeroAlReves);
    }
}

