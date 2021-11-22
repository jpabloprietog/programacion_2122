//Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
//Por ejemplo, si el usuario introduce 3, deberá escribir "tres".
package Ejercicios.unidad1.switch_operador_condicional;

import java.util.Scanner;

public class ejercicio6_2 {

    public static void main(String[] args) {

        int mes;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el numero del mes");
        mes=scanner.nextInt();

        switch (mes){
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
            default:
                System.out.println("No ha introducido un número del 1 al 10");
                break;
        }
    }
}
