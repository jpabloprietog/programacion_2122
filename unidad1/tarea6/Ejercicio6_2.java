//Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
//Por ejemplo, si el usuario introduce 3, deberá escribir "tres".

package unidad1.tarea6;

import java.util.Scanner;

public class Ejercicio6_2 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 10");
        numero = scanner.nextInt();

        String letra;

        switch (numero){
            case 1:
                letra="uno";
                break;
            case 2:
                letra="dos";
                break;
            case 3:
                letra="tres";
                break;
            case 4:
                letra="cuatro";
                break;
            case 5:
                letra="cinco";
                break;
            case 6:
                letra="seis";
                break;
            case 7:
                letra="siete";
                break;
            case 8:
                letra="ocho";
                break;
            case 9:
                letra="nueve";
                break;
            case 10:
                letra="diez";
                break;

            default:
                letra="Este numero no existe";
        }
        System.out.println("El número " + numero + ": " + letra);
    }
}
