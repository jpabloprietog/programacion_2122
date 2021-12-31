//Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor",
//que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".

package unidad1.tarea6;

import java.util.Scanner;

public class Ejercicio6_4 {

    public static void main(String[] args) {

        byte numero1, numero2, menor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero de tipo byte");
        numero1 = scanner.nextByte();

        System.out.println("Introduce otro número entero de tipo byte");
        numero2 = scanner.nextByte();

        if (numero1 > numero2) {
            menor = numero2;
            System.out.println(menor);
        }
        else {
            menor = numero1;
            System.out.println(menor);
        }
    }
}
