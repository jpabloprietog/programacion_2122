//Dime si un número es primo o no es primo (sin funciones).
//Un número primo es aquel que sólo es divisible entre él mismo y la unidad.

package utilidades;

import java.util.Scanner;

public class Numero_primo {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un número entero positivo");
        numero = scanner.nextInt();

        boolean esPrimo = true;
        for (int i = 2; i < numero; i++) {
            if((numero % i) == 0) {
                esPrimo = false;
            }
        }
            if(esPrimo){
                System.out.println("El " + numero + " es primo. ");
            } else {
                System.out.println("El " + numero + " no es primo. ");
            }
        }
    }

