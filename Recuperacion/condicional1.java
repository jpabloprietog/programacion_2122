//Condicionales (IF) y (ELSE)
//Condicionales (ELSE IF)

package Recuperacion;

import java.util.Scanner;

public class condicional1 {

    public static void main(String[] args) {

        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce tu edad, por favor");

        edad = scanner.nextInt();

        /*Si edad es mayor o igual a 18 imprime...

        if (edad >= 18) {

            System.out.println("Eres mayor de edad");
        }
        //Si no es verdad imprime...

        else {

            System.out.println("Eres menor de edad");
        }*/

        //Estructura (ELSE IF - SI NO, SI CONDICIÓN)
        if (edad<18){
            System.out.println("Eres un adolescente");
        }
        else if (edad<40){
            System.out.println("Eres joven");
        }
        else if (edad<65){
            System.out.println("Eres maduro");
        }
        else{
            System.out.println("Cuidate");
        }
    }
}

