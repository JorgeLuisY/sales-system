
package modelo;

public class cliente {
    private int id_cliente;
    private String nombre;
    private int ruc;
    private int dni;
    private String direccion;
    private String telefono;
    private String observaciones;

    public cliente(int id_cliente, String nombre, int ruc, int dni, String direccion, String telefono, String observaciones) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.ruc = ruc;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.observaciones = observaciones;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
