//Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de "tiempo",
//y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
//Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"

package unidad1.tarea5;

import java.util.Scanner;

public class Ejercicio5_6 {

    public static void main(String[] args) {

        double gravedad = 9.8;
        int tiempo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un valor de tiempo");
        tiempo = scanner.nextInt();

        double velocidad = (gravedad * tiempo);

        if (tiempo > 0) {
            System.out.println("La velocidad es " + velocidad + " metros por segundo");
        } else {
            System.out.println("Tiempo incorrecto");
        }
    }
}