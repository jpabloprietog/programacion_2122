package unidad4.tarea5;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la longitud máxima de la cadena");
        int longitud = scanner.nextInt();

        //Creamos el objeto texto
        texto c1 = new texto(longitud);

        //Añadimos el caracter
        System.out.println("Para posicionarte delante introduce inicio, y para posicionarte al final fin");
        String posicion = scanner.next();

        System.out.println("Introduce el caracter que quiere añadir");
        char caracter = scanner.next().charAt(0);
        c1.añadir(caracter, posicion);

        //añadir la cadena
        System.out.println("Para posicionarte delante introduce inicio, y para posicionarte al final fin");
        String posicion2 = scanner.next();

        System.out.println("Introduce la cadena que quiere añadir");
        String cadena = scanner.next();
        c1.añadir_cadena(cadena, posicion2);

        c1.vocales();
    }
}
