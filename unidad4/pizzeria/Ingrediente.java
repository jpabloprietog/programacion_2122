package unidad4.pizzeria;

//Clase - ingrediente
public class Ingrediente {

    //Nombre (String)
    private String nombre;
    //Calorías_por_100 (integer)
    private int calorias_100;

    //Constructor vacío. (Crea "queso" con 250 calorías)
    public Ingrediente() {
        this.nombre = "Queso";
        this.calorias_100 = 250;
    }

    //Constructor "normal". (pasamos nombre y calorías)
    public Ingrediente(String nombre, int calorias_100) {
        this.nombre = nombre;
        this.calorias_100 = calorias_100;

    }

    //Método - getInformación - DEVUELVE una cadena con la información del ingrediente (nombre y caloría).
    public String getNombre() {
        return nombre;
    }
}
