package unidad4.pizzeria;

public class Pizza {

    //Tamaño (enum - valores: mediana o familiar)
    public enum SizePizzas {
        MEDIANA,
        FAMILIAR;
    }

    //Ingredientes array de tamaño 3
    private final int MAX_INGREDIENTES = 3;
    private final SizePizzas size;
    private Ingrediente[] ingredientes = new Ingrediente[MAX_INGREDIENTES];
    private int contador_ingredientes = 0;

    public Pizza() {
        this.size = SizePizzas.FAMILIAR;
    }

    public Pizza(SizePizzas size) {
        this.size = size;
    }

    //Constructor con el tamaño
    public static void mostrarTamaños() {
        System.out.println("Tamaños: ");
        for (SizePizzas size: SizePizzas.values()) {
            System.out.println("  -" + size);
        }
    }

    public int num_ingredientes() {
        return contador_ingredientes;
    }

    public boolean add_ingrediente(Ingrediente ingrediente) {
        boolean resultado = false;
        if (contador_ingredientes < MAX_INGREDIENTES) {
            ingredientes[contador_ingredientes++] = ingrediente;
            resultado = true;
        }
        return resultado;
    }

    public void mostrar_pizza() {
        System.out.println("Tamaño: " + size);
        System.out.println("Ingredientes: ");
        for (int i = 0; i < contador_ingredientes; i++) {
            System.out.println("  - " + ingredientes[i].getNombre());
        }
    }
}
    //Constructor sin tamaño (por defecto creará la pizza familiar)
    //Método de clase (static) getSize devuelve todos los valores del enum size */
    //Método - getNumIngredientes. Devuelve el tamaño del array ingredientes
    //Método - addIngredientes devuelve "false" si ya hay 3 en el array ingredientes. Devuelve true añadiendo el ingrediente al array.
    //Método - mostrarInformación - "Sout" con toda la información del tamaño e ingredientes.


