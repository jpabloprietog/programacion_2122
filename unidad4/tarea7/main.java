package unidad4.tarea7;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frecuencia que oscile entre 80 y 108");
        double frecuency = scanner.nextDouble();

        sintonizador F1 = new sintonizador(frecuency);

        //Mostramos la información al usuario
        F1.informacion();

        //Solicitamos al usuario si desea aumentar, bajar o salir de la emisora
        String movimiento = "";

        do {
            System.out.println("Para aumentar la frecuencia introduce ''UP'', para disminuir la frecuencia introduce ''DOWN'', y para salir ''SALIR''");
            movimiento = scanner.next();
            F1.movimiento(movimiento);
        } while (!movimiento.equalsIgnoreCase("SALIR"));
    }
}
