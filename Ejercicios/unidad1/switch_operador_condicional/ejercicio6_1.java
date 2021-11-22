//Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes. Por ejemplo,
//si el usuario introduce 9, deberá escribir "septiembre".
package Ejercicios.unidad1.switch_operador_condicional;

import java.util.Scanner;

public class ejercicio6_1 {

    public static void main(String[] args) {

        int mes;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el numero de un mes");
        mes = scanner.nextInt();

        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No ha introducido un numero de mes correcto");
                break;


        }
    }
}
