//Sería interesante disponer de un programa que pida como entrada un número decimal
//y lo muestre redondeando al entero más próximo. ej: 2,3 -> 2      4,8 -> 5
package Ejercicios.unidad1.tipo_datos_conversion_tipo;

import java.util.Scanner;

public class Ejercicio4_4 {

    public static void main(String[] args) {

        float num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un número decimal");
        num=scanner.nextFloat();
        System.out.println("El número redondeado al entero más proximo es " + Math.round(num));
    }
}
