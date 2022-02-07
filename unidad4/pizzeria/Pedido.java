package unidad4.pizzeria;

import java.util.Calendar;

//Clase - pedido.
public class Pedido<fecha> {

    private final String fecha;
    //Atributo pizza, de tipo pizza.
    private Pizza p;
    //Atributo fecha, atributo hora ¿tipo?
    private fecha; /*Revisar*/

    public Pedido(){
        p = new Pizza(Pizza.SizePizzas.FAMILIAR);
        Ingrediente ingrediente1 = new Ingrediente("Jamón Ibérico", 300);
        Ingrediente ingrediente2 = new Ingrediente();
        p.add_ingrediente(ingrediente1);
        p.add_ingrediente(ingrediente2);
        this.fecha = get_fecha_pedido();
    }

    public Pedido(Pizza p){
        this.p = p;
        this.fecha = get_fecha_pedido();
    }

    public String getFecha(){
        return fecha;
    }

    public Pizza getPizza(){
        return p;
    }

    private String get_fecha_pedido(){
        Calendar calendar = Calendar.getInstance();

        String dia, mes, annio, hora, minuto, segundo;

        dia = Integer.toString(calendar.get(Calendar.DATE));
        mes = Integer.toString(calendar.get(Calendar.MONTH));
        annio = Integer.toString(calendar.get(Calendar.YEAR));

        hora = Integer.toString(calendar.get(Calendar.HOUR));
        minuto = Integer.toString(calendar.get(Calendar.MINUTE));
        segundo = Integer.toString(calendar.get(Calendar.SECOND));

        return dia + "/" + mes + "/" + annio + " " + hora + ":" + minuto + ":" + segundo;
    }

    //GetInfoPedido - Devuelve la pizza y la fecha_hora en la que se realizó
    //Constructor vacío - crea pizzas familiares con jamón ibérico y queso.
    //Constructor que recibe una pizza concreta.
}