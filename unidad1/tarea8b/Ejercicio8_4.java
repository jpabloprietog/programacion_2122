//Escribe un programa que lea una lista de diez números
//y determine cuántos son positivos, y cuántos son negativos.

package unidad1.tarea8b;

import java.util.Scanner;

public class Ejercicio8_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int contadorPositivo = 0;
        int contadorNegativo = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Escribe un número");
            numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivo++;
            } else if (numero < 0) {
                contadorNegativo++;
            }
        }
        System.out.println(contadorPositivo + " Números positivos");
        System.out.println(contadorNegativo + " Números negativos");
    }
}
