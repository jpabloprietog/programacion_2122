//Sería interesante disponer de un programa que pida como entrada un número decimal
//y lo muestre redondeando al entero más próximo.
//ej: 2,3 -> 2      4,8 -> 5

package unidad1.tarea4;

import java.util.Scanner;

public class Ejercicio4_4 {

    public static void main(String[] args) {

        double numero;

        //Con esta variable truncamos los decimales.
        int redondeo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero decimal");
        numero = scanner.nextDouble();

        //Redondeamos el número. Aplicamos un cast (int). Sumamos 0.5 y truncamos (eliminamos los decimales),
        //convirtiendo un número real en un número entero.
        redondeo = (int) (numero + 0.5);

        System.out.println("El número redondeado al entero más proximo es: " + numero + " -> " + redondeo);
    }
}
