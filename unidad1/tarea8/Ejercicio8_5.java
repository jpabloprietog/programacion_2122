//Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
//A continuación, solicitará por teclado un valor que debe estar dentro del rango.
//Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minimo;
        int maximo;
        int valor;

        System.out.println("introduce el valor máximo");
        maximo = scanner.nextInt();

        System.out.println("introduce el valor mínimo");
        minimo = scanner.nextInt();

        //Bucle DO-WHILE (Hacer - Mientras).
        do {
            //Introducir un valor que esté dentro del rango indicado.
            System.out.println("Introduce un valor dentro del rango indicado");
            valor = scanner.nextInt();
            //El valor tiene que ser mayor o igual que el mínimo y menor o igual que el máximo.
            if (valor >= minimo && valor <= maximo) {
                System.out.println(valor + " se encuentra dentro del rango");
            }
            //MIENTRAS, esta condición sea distinta (operador distinto !),
            //se repitetirá de nuevo el bucle hasta que se cumpla la condición.
        } while (!(valor >= minimo && valor <= maximo));
    }
}





