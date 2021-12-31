//Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos".
//Necesitamos almacenar en la variable booleana "jasp" el valor:
//verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
//falso. En caso contrario.
//escribe el código necesario para inicializar "jasp" en una línea.

package unidad1.tarea7;

import java.util.Scanner;

public class Ejercicio7_2 {

    public static void main(String[] args) {

        int edad, nivel_de_estudios, ingresos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la edad");
        edad = scanner.nextInt();

        System.out.println("Introduce el nivel de estudios");
        nivel_de_estudios = scanner.nextInt();

        System.out.println("Introduce los ingresos");
        ingresos = scanner.nextInt();

        boolean jasp;

        if (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000) {
            jasp = true;
        } else {
            jasp = false;
        }
        System.out.println(jasp);
    }
}
