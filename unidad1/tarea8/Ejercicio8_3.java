//Realizar un aplicación que genere un número aleatorio entre 1 y 100.
//El jugador debe ir probando números tratando de acertarlo.
//El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
//El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).

package unidad1.tarea8;

import java.util.Scanner;

public class Ejercicio8_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100);
        int numero = 0;

        while (numero != numeroSecreto) {

            System.out.println("Introduce un número, por favor");
            numero = scanner.nextInt();

            if (numeroSecreto < numero) {
                System.out.println("Más bajo");
            } else if (numeroSecreto > numero) {
                System.out.println("Más alto");
            }
        }
        System.out.println("El numero " + numero + " es correcto");
    }
}
