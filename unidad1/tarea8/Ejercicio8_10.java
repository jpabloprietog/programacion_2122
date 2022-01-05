// Implementar una aplicación que pida un número al usuario entre el 1 y el 10,
//y calcule su tabla de multiplicar. El código debe asegurarse de que el número introducido está entre 1 y 10,
//y si no es así, volver a pedirlo hasta que lo cumpla.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Introduce un número");
            numero = scanner.nextInt();

            //Para que se repita el bucle DO, en el WHILE ponemos la condición contraria.
        } while (numero < 1 || numero > 10);

        //Establecemos el rango de valores en el bucle FOR.
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + numero * i);
        }
    }
}

