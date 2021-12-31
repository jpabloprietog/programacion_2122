// Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier
// vocal del nombre. Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán
// las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.

package unidad3.tarea2;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String vocales = "AÁaáEÉeéIÍiíOÓoóUÚuú";

        System.out.println("Escriba su Nombre y Apellidos");
        String nombreApellidos = scanner.nextLine();

        for (int i = 0; i < nombreApellidos.length(); i++) {
            char caracter = nombreApellidos.charAt(i);
            if (vocales.indexOf(caracter) == -1) System.out.print(caracter);
        }
    }
}
