package modelo;

public class Cliente {
    
    private int id_cliente;
    private String nombreoRazonS;
    private int ruc;
    private int dni;
    private String direccion;
    private String telefono;
    private String observacion;
    
    public Cliente(){}

    public Cliente(int id_cliente, String nombre, int ruc, int dni, String direccion, String telefono, String observaciones) {
        this.id_cliente = id_cliente;
        this.nombreoRazonS = nombre;
        this.ruc = ruc;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.observacion = observaciones;
        
    }
    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombreoRazonS() {
        return nombreoRazonS;
    }

    public void setNombreoRazonS(String nombreoRazonS) {
        this.nombreoRazonS = nombreoRazonS;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
