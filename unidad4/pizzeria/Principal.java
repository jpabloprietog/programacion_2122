package unidad4.pizzeria;

public class Principal {
    public static void main(String[] args) {
        Pizzeria luigi = new Pizzeria();
        luigi.add_pedido(new Pedido());
        luigi.mostrar_cantidad_pedidos();
        luigi.mostrar_pedidos();

        Pizza.mostrarTamaños();
        Pizza p = new Pizza(Pizza.SizePizzas.MEDIANA);
        Ingrediente i1 = new Ingrediente("Alcaparras", 35);
        Ingrediente i2 = new Ingrediente("Anchoas", 45);
        Ingrediente i3 = new Ingrediente("Tomate rodajas", 55);
        Ingrediente i4 = new Ingrediente("Pimiento verde", 65);
        add_ingre(p, i1);
        add_ingre(p, i2);
        add_ingre(p, i3);
        add_ingre(p, i4);
        System.out.println("La pizza p tiene: " + p.num_ingredientes() + " ingredientes");

        Pedido ped = new Pedido(p);
        luigi.add_pedido(ped);

        luigi.mostrar_cantidad_pedidos();
        luigi.mostrar_pedidos();

        for (int i = 1; i < 7; i++) {
            luigi.add_pedido(new Pedido());
        }

        luigi.mostrar_cantidad_pedidos();
        luigi.mostrar_pedidos();
    }

    public static boolean add_ingre(Pizza p, Ingrediente i) {
        boolean resultado = p.add_ingrediente(i);
        if (resultado) {
            System.out.println("Añadido ingrediente: " + i.getNombre());
        } else {
            System.out.println("No se pudo añadir el ingrediente: " + i.getNombre());
        }
        return resultado;


    }

}
