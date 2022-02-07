//Actividad 8: Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente.
//Para ello hacer una clase Bombilla con una variable privada que indique si está encendida o apagada, así como un método que nos diga el estado de la bombilla.
//
//Además, queremos poner un interruptor general, de forma que si saltan los fusibles, todas las bombillas se muestran como apagadas.
//Cuando el fusible se repara, las bombillas vuelven a estar encendidas o apagadas, según estuvieran antes del percance.
//Cada bombilla se enciende o se apagan individualmente,
//pero solo responde si su interruptor particular está activado y además hay luz general.

package unidad4.tarea8;

public class bombilla {

    //Creamos las variables bombilla.
    boolean bombilla1;
    String IntBombilla1;
    boolean bombilla2;
    String IntBombilla2;
    boolean bombilla3;
    String IntBombilla3;

    //Creamos la variable interruptor general.
    public boolean interruptor;

    //Creamos un constructor para traernos la información de la clase main
    public bombilla(boolean bombilla1, boolean bombilla2, boolean bombilla3) {
        this.bombilla1 = bombilla1;
        this.bombilla2 = bombilla2;
        this.bombilla3 = bombilla3;
    }

    public void estado(String bombilla1, String bombilla2, String bombilla3) {
        if (bombilla1.equalsIgnoreCase("encendida")) {
            this.bombilla2 = true;
            this.IntBombilla1 = "Bombilla 1 encendida";
            System.out.println("Bombilla 1 encendida");
        } else if (bombilla1.equalsIgnoreCase("apagada")) {
            this.bombilla1 = false;
            this.IntBombilla1 = "Bombilla 1 apagada";
            System.out.println("Bombilla 1 apagada");
        } else {
            System.out.println("Mensaje incorrecto, la bombilla 1 se queda apagada por defecto");
            this.IntBombilla1 = "Bombilla 1 apagada";
        }

        if (bombilla2.equalsIgnoreCase("encendida")) {
            this.bombilla2 = true;
            this.IntBombilla2 = "Bombilla 2 encendida";
            System.out.println("Bombilla 2 encendida");
        } else if (bombilla2.equalsIgnoreCase("apagada")) {
            this.bombilla2 = false;
            this.IntBombilla2 = "Bombilla 2 apagada";
            System.out.println("Bombilla 2 apagada");
        } else {
            System.out.println("Mensaje incorrecto, la bombilla 2 se queda apagada por defecto");
            this.IntBombilla2 = "Bombilla 2 apagada";
        }

        if (bombilla3.equalsIgnoreCase("encendida")) {
            this.bombilla3 = true;
            this.IntBombilla3 = "Bombilla 3 encendida";
            System.out.println("Bombilla 3 encendida");
        } else if (bombilla3.equalsIgnoreCase("apagada")) {
            this.bombilla3 = false;
            this.IntBombilla3 = "Bombilla 3 apagada";
            System.out.println("Bombilla 3 apagada");
        } else {
            System.out.println("Mensaje erróneo, la bombilla 3 se queda apagada por defecto");
            this.IntBombilla3 = "Bombilla 3 apagada";
        }
    }

    //Creamos el método del interruptor general de la casa
    public void interruptor(String inter) {
        if (inter.equalsIgnoreCase("encendido")) {
            this.interruptor = true;
            System.out.println("Los fusibles funcionan correctamente, fin de la aplicación.");
        }
        if (inter.equalsIgnoreCase("apagado")) {
            this.interruptor = false;
            System.out.println("Warning, todas las bombillas de la casa se han apagado");
        }
    }

    //Método para reiniciar los fusibles
    public void reiniciar(String inter) {
        if (inter.equalsIgnoreCase("Si")) {
            System.out.println("Los fusibles han vuelto a funcionar, fin de la aplicación.");
            System.out.println(IntBombilla1);
            System.out.println(IntBombilla2);
            System.out.println(IntBombilla3);
        } else if (inter.equalsIgnoreCase("no")) {
            System.out.println("Todas las bombillas siguen apagadas");
        } else {
            System.out.println("Mensaje incorrecto, todas las bombillas siguen apagadas");
        }
    }
}
