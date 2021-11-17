//Crea un programa que pida al usuario su año de nacimiento y el año actual
//(usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.
package unidad1.operaciones_basicas_tipo_datos;

import java.util.Scanner;

public class Ejercicio3_2 {

    public static void main(String[] args) {

        short ano_nac, ano_act;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce su año de nacimiento");
        ano_nac = scanner.nextShort();

        System.out.println("Introduce el año actual");
        ano_act = scanner.nextShort();

        System.out.println("Su edad es: " + (ano_act - ano_nac) + " años");


    }
}
