//Actividad 3: Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas,
//y la visibilidad de sus atributos para que:
//
//saldo y limite no sean visibles para otras clases.
//nombre sea público para cualquier clase.
//dni solo sea visible por clases vecinas.
//
//(Comprueba la visibilidad desde el programa principal comentando
//cada acceso o intento de acceso)

package unidad4.tarea3;

public class cuentaCorriente {

    //Este objeto no es visible para otras clases.
    private long saldo;
    //Este objeto no es visible para otras clases.
    private long limite;
    //Este objeto es publico para cualquier clase.
    public String nombre;
    //Este objeto es visible para clases vecinas.
    String DNI;

    public cuentaCorriente(String nombreCLiente, String dni) {
        this.nombre = nombreCLiente;
        this.DNI = dni;
        this.saldo = 0;
        this.limite = -50;
    }

    public cuentaCorriente(int saldoBanco) {
        this.saldo = saldoBanco;
        this.limite = 0;
    }

    public cuentaCorriente(int saldoBanco, int limite, String DNI){
        this.saldo = saldoBanco;
        this.limite = limite;
        this.DNI = DNI;
    }

    public boolean sacarDinero(int cantidad) {
        boolean puedeSacar = true;
        this.saldo += cantidad;
        if (saldo > 50) {
            System.out.println("No puede sacar dinero");
            puedeSacar = false;
        } else {
            System.out.println("Puede sacar dinero");
        }
        this.saldo = 0;
        return puedeSacar;
    }

    public void ingresarDinero(int ingresar) {
        this.saldo += ingresar;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getLimite() {
        return limite;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void informacion() {
        System.out.println("El saldo es: " + getSaldo());
        System.out.println("El limite es: " + getLimite());
        System.out.println("El nombre es: " + getNombre());
        System.out.println("El DNI es: " + getDNI());
    }
}
