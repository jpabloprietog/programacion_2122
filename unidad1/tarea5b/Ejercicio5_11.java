//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso.
//Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.
//Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.

package unidad1.tarea5b;

import java.util.Scanner;

public class Ejercicio5_11 {

    public static void main(String[] args) {

        int punto = 0;
        String respuesta;

        System.out.println("Minicuestionario 1º DAW - Tarde");

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. ¿Cual de los siguientes tipos de datos de Java tiene más precisión?");
        System.out.println("a) int\nb) double\nc) float");
        System.out.print("Respuesta: ");

        respuesta = scanner.next();
        if (respuesta.equals("b")) {
            punto++;
        }
        System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en BBDD?");
        System.out.println("a) XML\nb) SELECT\nc) SQL");
        System.out.println("Respuesta: ");

        respuesta = scanner.next();
        if (respuesta.equals("c")) {
            punto++;
        }
        System.out.println("3. Para insertar un hiperenlace en una pagina se utiliza la etiqueta ...");
        System.out.println("a) href\nb) a\nc) link");
        System.out.println("Respuesta: ");

        respuesta = scanner.next();
        if (respuesta.equals("b")) {
            punto++;
        }
        System.out.println("4. ¿En que directorio se encuentran los archivos de configuracion de Linux");
        System.out.println("a) /etc\nb) /config\nc) /config");
        System.out.println("Respuesta: ");

        respuesta = scanner.next();
        if (respuesta.equals("a")) {
            punto++;
        }
        System.out.println("5. ¿Cual de las siguientes memorias es volatil?");
        System.out.println("a) RAM\nb) EPROM\nc) ROM");
        System.out.println("Respuesta: ");

        respuesta = scanner.next();
        if (respuesta.equals("a")) {
            punto++;
        }
        System.out.println("Ha obtenido " + punto + " puntos. ");
    }
}
