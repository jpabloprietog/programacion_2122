//Pedir un número y calcular su factorial.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        Long resultado = 1L;

        System.out.println("Introduce un numero");
        numero = scanner.nextInt();

        //(i--, va restandole 1 a lo que vale i)
        for (int i = numero; i > 0; i--) {
            resultado = resultado * i;
        }
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
}

