//Diseñar una función que nos diga si un número es primo.

package Ejercicios.unidad3;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = scanner.nextInt();

        if (fEsPrimo(num)){
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }
    public static boolean fEsPrimo(int num){

        boolean esPrimo = true;

        for (int i = 2; i < num ; i++) {

            if (num % i == 0){
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
