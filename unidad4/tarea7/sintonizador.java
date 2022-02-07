//Actividad 7: Se quiere definir una clase que permita controlar un sintonizador digital de emisoras FM;
//concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar (down)
//la frecuencia (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display).
//
//Supondremos que el rango de frecuencias a manejar oscila entre los 80MHz y los 108MHz y que,
//al inicio, el controlador sintonice a 80MHz.
//Si durante una operación de subida o bajada se sobrepasa uno de los dos límites,
//la frecuencia sintonizada debe pasar a ser la del extremo contrario.
//
//Escribir un pequeño programa principal para probar su funcionamiento.

package unidad4.tarea7;

public class sintonizador {

    //Atributos de la clase sintonizador.
    private double inicio = 80;
    private double fin = 108;
    public double frecuencia;
    public double nuevaFrecuencia;

    //El constructor debe de llamarse igual que la clase.
    public sintonizador(double frecuency) {
        this.frecuencia = frecuency;
    }

    public void informacion() {
        System.out.println("La frecuencia de inicio es: " + inicio);
        System.out.println("La frecuencia máxima es: " + fin);
        System.out.println("La frecuencia introducida es: " + frecuencia);
    }

    //Creamos un método para el movimiento de sintonizar.
    public void movimiento(String movimiento) {
        if (movimiento.equalsIgnoreCase("UP") && frecuencia >= inicio && frecuencia < fin) {
            frecuencia += 0.5;
        }
        if (movimiento.equalsIgnoreCase("DOWN") && frecuencia > inicio && frecuencia <= fin) {
            frecuencia -= 0.5;
        }
        if (movimiento.equalsIgnoreCase("UP") && frecuencia >= inicio && frecuencia < fin) {
            frecuencia = inicio;
        }
        if (movimiento.equalsIgnoreCase("UP") && frecuencia >= inicio && frecuencia < fin) {
            frecuencia = fin;
        } else {
            System.out.println("Palabra Incorrecta, fallo del sistema. Introduce salir para salir");
            frecuencia = 0;
        }
        System.out.println("La nueva frecuencia es: " + frecuencia);
    }
}
