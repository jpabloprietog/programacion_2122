package unidad4.tarea1;

public class CuentaCorriente {

    private int saldo;
    private int limiteDescubrimiento;
    private String nombre;
    private String DNI;

    //Constructor
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
