//Crea un programa que pida un número entero al usuario
//y dé a una variable par el valor 1 si ese número es par o el valor 0 si no es par.
//Hazlo primero con un "if" y luego con un "operador condicional".
package unidad1.switch_operador_condicional;

import java.util.Scanner;

public class ejercicio6_3 {

    public static void main(String[] args) {

        int numero;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        numero = scanner.nextInt();

        if ((numero % 2) == 0) {
            System.out.println (numero = 1);
        } else {
            System.out.println(numero = 0);
        }

    }
}
