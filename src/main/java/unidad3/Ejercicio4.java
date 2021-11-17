package unidad3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        double decimal;
        int numentero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número decimal");
        decimal = scanner.nextDouble();
        double entero = Math.round(decimal);
        int enteroInt = (int) entero;

        System.out.println(decimal + " redondeado es:" + enteroInt);
    }
}
