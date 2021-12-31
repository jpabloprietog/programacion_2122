//Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.
//(1: lunes, 2: martes, 3: miercoles, 4: jueves, 5: viernes).

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_1 {

    public static void main(String[] args) {

        int dia;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un dia de la semana del 1 al 5");
        dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("El lunes a primera hora toca: Lengua y Literatura");
                break;
            case 2:
                System.out.println("El martes a primera hora toca: Economia");
                break;
            case 3:
                System.out.println("El miercoles a primera hora toca: Historia");
                break;
            case 4:
                System.out.println("El jueves a primera hora toca: Geografía");
                break;
            case 5:
                System.out.println("El viernes a primera hora toca: Inglés");
                break;
            default:
                System.out.println("No ha introducido un día del 1 al 5");
        }
    }
}
