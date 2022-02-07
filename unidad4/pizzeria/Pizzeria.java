package unidad4.pizzeria;

import java.util.Arrays;

public class Pizzeria {
    private int MAX_PEDIDOS;
    private int contador_pedidos;
    private Pedido[] pedidos;

    //Clase - pizzeria
    public Pizzeria() {
        MAX_PEDIDOS = 5;
        pedidos = new Pedido[MAX_PEDIDOS];
    }

    public Pizzeria(int MAX_PEDIDOS) {
        this.MAX_PEDIDOS = MAX_PEDIDOS;
        pedidos = new Pedido[MAX_PEDIDOS];
    }

    public void add_pedido(Pedido p) {
        if (contador_pedidos < MAX_PEDIDOS) {
            pedidos[contador_pedidos++] = p;
        } else {
            pedidos = Arrays.copyOf(pedidos, pedidos.length + 1);
            pedidos[contador_pedidos++] = p;
        }
    }

    public void mostrar_pedidos() {
        System.out.println("Pedidos: ");
        for (int i = 0; i < contador_pedidos; i++) {
            System.out.println("- Pedido " + i + " (" + pedidos[i].getFecha() + ") :");
            pedidos[i].getPizza().mostrar_pizza();
        }
    }

    public void mostrar_cantidad_pedidos() {
        System.out.println("Num. pedidos: " + contador_pedidos);
    }
}
    //Constructor que recibe la capacidad de pedidos inicial.
    //Array de pedidos (capacidad inicial de 5).
    //Constructor que recibe la capacidad de pedidos inicial. OJO podemos aumentarla posteriormente.
    //Método que recibe pedido, y lo añade al array de pedidos.
    //Método - mostrarInformación, que muestra todos los pedidos.
    //Método - getNumPedidos, que devuelve el tamaño del array pedido.
