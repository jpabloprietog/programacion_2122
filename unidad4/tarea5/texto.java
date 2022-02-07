//Actividad 5: Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
//
//La cadena de caracteres tendrá una longitud máxima, que se especifica en el constructor.
//
//Permite añadir un carácter, al principio o al final, siempre y cuando exista espacio disponible.
//
//Igualmente, permite añadir una cadena, al principio o al final del texto,
//siempre y cuando no se rebase el tamaño máximo establecido.
//
//Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.

package unidad4.tarea5;

public class texto {

    private int longMaxima;
    private StringBuilder cadena = new StringBuilder("");
    static final String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

    //Creamos el constructor para la longitud máxima.
    public texto(int longitud) {
        this.longMaxima = longitud;
    }

    //Creamos el metodo para añadir un carácter.
    public void añadir(char caracter, String posicion) {
        if (cadena.length() + 1 < longMaxima) {
            System.out.println("Hay un espacio disponible");
            if (posicion.equalsIgnoreCase("inicio")) {
                this.cadena.insert(0, caracter);
            }
        } else {
            System.out.println("No hay espacios disponibles");
        }
        System.out.println(cadena);
    }

    //Creamos el método para poder añadir una cadena
    public void añadir_cadena(String cadena, String posicion2) {
        if (cadena.length() + cadena.length() < longMaxima) {
            System.out.println("Hay un espacio disponible");
            if (posicion2.equalsIgnoreCase("Inicio")) {
                this.cadena.insert(0, cadena);
            }
            if (posicion2.equalsIgnoreCase("fin")) {
                this.cadena.insert(cadena.length(), cadena);
            }
        } else {
            System.out.println("No hay espacio disponible");
        }
        System.out.println(cadena);
    }

    //Creamos el método para poder contar vocales
    public void vocales() {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {

        }
    }
}
