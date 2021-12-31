//Manipulación de cadenas (Clase String)
//Metodos: CharAt y Length.

package Recuperacion;

public class cadenas {

    public static void main(String[] args) {

        //length() -> devuelve la longitud de una cadena de caracteres.
        //CharAt(n) -> devuelve la posicion de un caracter dentro de una cadena. (Las posiciones empiezan a contar de 0).
        //substring(x, y) -> devuelve una subcadena dentro de la cadena, siendo X el caracter a partir del cual se extrae e Y el nº de caracteres que se quieren extraer.
        //equals(cadena) -> devuelve true si dos cadenas que se comparan son iguales y false si no lo son.
        //Distingue mayusculas y minusculas.
        //equalsIgnoreCase(cadena) -> igual que el anterior pero sin tener en cuenta mayusculas y minusculas.

        //mi_nombre (instancia) de la clase String.
        //String mi_nombre="Juan";

        String nombre = "Juan Pablo Prieto Gallardo";

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

        int ultima_letra;

        ultima_letra=nombre.length();

        //Posicion (ultima_letra -1) -> letra en la posicion 4-1=3
        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));

    }
}
