//Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1
//si ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".

package unidad1.tarea6;

import java.util.Scanner;

public class Ejercicio6_3 {

    public static void main(String[] args) {

        int numero, par;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        numero = scanner.nextInt();

        //Numero par (numero % 2 == 0)
        if (numero % 2 == 0) {
            numero = 1;
        }
        else {
            numero = 0;
        }
        System.out.println("El numero vale " + numero);
    }
}
