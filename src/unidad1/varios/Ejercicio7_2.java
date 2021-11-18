//Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos".
// Necesitamos almacenar en la variable booleana "jasp" el valor:
//
//verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3,
//y los ingresos superan los 28000 (euros).
//falso. En caso contrario.
//escribe el código necesario para inicializar "jasp" en una línea.

package unidad1.varios;

import java.util.Scanner;

public class Ejercicio7_2 {

    public static void main(String[] args) {

        int edad, nivelestudios, ingresos;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce su edad");
        edad = teclado.nextInt();
        System.out.println("Introduce su nivel de estudio en número");
        nivelestudios = teclado.nextInt();
        System.out.println("Introduce ingresos");
        ingresos = teclado.nextInt();
        boolean jasp = (edad <= 28 && nivelestudios > 3 && ingresos > 28000);
        System.out.println(jasp);
    }
}
