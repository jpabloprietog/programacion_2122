//Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
package Ejercicios.unidad1.comprobacion_condiciones_II;

import java.util.Scanner;

public class Ejercicio5_1_1 {

    public static void main(String[] args) {

        byte dia;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un día de la semana: (1=lunes, 2=martes, 3=miercoles, 4=jueves, 5=viernes)");
        dia = scanner.nextByte();

        switch (dia) {

            case 1:
                System.out.println("El lunes a primera hora tenemos Programación");
                break;
            case 2:
                System.out.println("El martes a primera hora tenemos Base de Datos");
                break;
            case 3:
                System.out.println("El miercoles a primera hora tenemos Programación");
                break;
            case 4:
                System.out.println("El jueves a primera hora tenemos Programación");
                break;
            case 5:
                System.out.println("El viernes a primera hora tenemos Base de Datos");
                break;
            default:
                System.out.println("No ha introducido un dia del 1 al 5");

        }

    }
}