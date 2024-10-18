package Facturacion;

public class Clientes {
    private static Long n = 0L;
    protected Long id;
    protected String nombre;
    protected String apellido;

    public Clientes(String nombre, String apellido) {
        this.id = ++n;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
