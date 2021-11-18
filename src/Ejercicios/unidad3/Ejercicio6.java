//Crear una función que, mediante un booleano,
//indique si el carácter que se pasa como parámetro de entrada
//corresponde con una vocal.

package Ejercicios.unidad3;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        char caracter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un carácter");
        caracter = scanner.nextLine().charAt(0);

        if (fvocal(caracter)){
            System.out.println(caracter + " Es una vocal");
        } else {
            System.out.println(caracter + " No es vocal");
        }
    }

    static boolean fvocal(char caracter){
        boolean esVocal;
        esVocal = caracter =='a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
        return esVocal;
    }
}
