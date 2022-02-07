package unidad4.tarea8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean bombilla1 = false;
        boolean bombilla2 = false;
        boolean bombilla3 = false;
        boolean interruptor = false;

        //Necesitamos Crear el objeto bombilla.
        bombilla bombilla = new bombilla(bombilla1, bombilla2, bombilla3);

        //Comprobamos el estado en el que se encuentran las tres bombillas.
        System.out.println("Indica el estado de la bombilla1: ''encendida'', ''apagada");
        String bomb1 = scanner.next();
        System.out.println("Indica el estado de la bombilla2: ''encendida'', ''apagada");
        String bomb2 = scanner.next();
        System.out.println("Indica el estado de la bombilla3: ''encendida'', ''apagada");
        String bomb3 = scanner.next();

        //Realizamos la llamada al método "estado" creado anteriormente.
        bombilla.estado(bomb1, bomb2, bomb3);

        //Preguntamos por el interruptor, si se encuentra encendido o apagado.
        System.out.println("Estado en el que se encuentra el interruptor general: ''encendido'', ''apagado''");
        String inter = scanner.next();
        if (inter.equalsIgnoreCase("encendido")){
            interruptor = true;

            //Llamamos al método "inter" (interruptor).
            bombilla.interruptor(inter);


            //Preguntamos si todos los fusibles del interruptor se encuentran encendidos.
            if (!interruptor){
                System.out.println("¿Están ya encendidos los fusibles? ''si'', ''no''");
                inter = scanner.next();

                //LLamamos al método reiniciar.
                bombilla.reiniciar(inter);
            }
        }
    }
}
