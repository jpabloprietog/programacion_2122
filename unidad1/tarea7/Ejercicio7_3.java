//Realiza un programa que genere una letra minúscula de forma aleatoria.
//Investiga el uso de la función Math.random().
//Investiga también sobre el sistema de codificación ASCII
//y ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.

package unidad1.tarea7;

import java.util.Random;

public class Ejercicio7_3 {

    public static void main(String[] args) {


        int maximo = 122;
        int minimo = 97;
        String minuscula = "";

        int letraminuscula = (int) (Math.random() * (maximo - minimo + 1) + (minimo));

        System.out.println((char) letraminuscula);

    }
}
