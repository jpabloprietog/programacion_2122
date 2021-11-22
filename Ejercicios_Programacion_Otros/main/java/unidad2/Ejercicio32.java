package Ejercicios.unidad2;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Short año_nac, año_act;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su año de nacimiento");
        año_nac = scanner.nextShort();
        System.out.println("Introduzca el año actual");
        año_act = scanner.nextShort();
        System.out.println(año_act-año_nac);
        System.out.println("Su edad es:" + (año_act-año_nac));

        scanner.close();

    }
}
