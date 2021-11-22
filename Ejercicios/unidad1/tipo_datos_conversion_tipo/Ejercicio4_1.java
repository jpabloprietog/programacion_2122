//El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
//Realiza un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica.
//Es decir, que muestre el valor máximo de una variable de tipo short,
//y muestre también qué ocurre si sumamos 1 a esa variable.
package Ejercicios.unidad1.tipo_datos_conversion_tipo;

public class Ejercicio4_1 {

    public static void main(String[] args) {

        short max = 32767;

        System.out.println(max);
        max++;
        System.out.println(max);
    }
}
