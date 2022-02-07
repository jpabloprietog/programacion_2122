//Actividad 1: Diseñar la clase CuentaCorriente, sabiendo que los datos que caracterizan a un objeto de ese tipo son:
//saldo, límite de descubrimiento (cantidad de dinero que se permite sacar de una cuenta que ya está a cero),
//nombre y DNI del titular. Las operaciones típicas con una cuenta corriente son:
//
//Crear la cuenta: se necesita el nombre y DNI del titular.
//El saldo inicial será 0 y el límite de descubierto será de -50 euros.
//
//Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto.
//El método debe indicar, por pantalla, un mensaje que indique si ha sido posible llevar a cabo la operación.
//Además, deberá devolver un valor booleano que indique lo mismo.
//
//Ingresar dinero: se incrementa el saldo.
//
//Mostrar información: muestra la información de la cuenta corriente.

package unidad4.tarea1;

public class CuentaCorriente {

    private int saldo;
    private int limiteDescubrimiento;
    private String nombre;
    private String DNI;

    //Constructor de la cuenta corriente
    public CuentaCorriente(String nombreCliente, String dni) {

        this.nombre = nombreCliente;
        this.DNI = dni;
        this.saldo = 0;
        this.limiteDescubrimiento = -50;
    }

    public boolean sacarDinero(int cantidad) {
        boolean puede_sacar = true;
        this.saldo += cantidad;
        if (saldo > 50) {
            System.out.println("No puedes sacar dinero");
            puede_sacar = false;
        } else {
            System.out.println("Puedes sacar dinero");
        }
        this.saldo = 0;
        return puede_sacar;
    }

    public void ingresarDinero(int ingresar) {
        this.saldo += ingresar;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getlimiteDescubrimiento() {
        return limiteDescubrimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void informacion() {
        System.out.println("El saldo es: " + getSaldo());
        System.out.println("El limite es: " + getlimiteDescubrimiento());
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El DNI es: " + getDNI());
    }
}
