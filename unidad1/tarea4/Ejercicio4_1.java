//El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
//Realiza un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica.
//Es decir, que muestre el valor máximo de una variable de tipo short, y muestre también qué ocurre si sumamos 1 a esa variable.

package unidad1.tarea4;

import java.util.Scanner;

public class Ejercicio4_1 {

    public static void main(String[] args) {

        //MAX.VALUE = Muestra el valor maximo del tipo short (32767)
        short numero1 = Short.MAX_VALUE;

        System.out.println(numero1);
        numero1++;
        System.out.println(numero1);
    }
}
