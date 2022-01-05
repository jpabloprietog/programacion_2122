//Diseñar un programa que muestre el producto de los 10 primeros números impares.

package unidad1.tarea8;

public class Ejercicio8_7 {

    public static void main(String[] args) {

        int resultado = 1;

        //Rango i < 10
        for (int i = 1; i < 10; i++) {

            //Números impares
            if (i % 2 != 0) {
                resultado = resultado * i;
            }
        }
        System.out.println(resultado);
    }
}

