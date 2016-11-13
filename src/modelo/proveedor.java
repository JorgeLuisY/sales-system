
package modelo;


public class proveedor {
    private int id_provedor;
    private int  ruc;
    private String direccion;
    private String telefono;
    private String email;
    private int numCuenta1;
    private int numCuenta2;
    private String observacion;
    private String estado;
    private int celular;
    private int dni;

    public proveedor(int id_provedor, int ruc, String direccion, String telefono, String email, int numCuenta1, int numCuenta2, String observacion, String estado, int celular, int dni) {
        this.id_provedor = id_provedor;
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.numCuenta1 = numCuenta1;
        this.numCuenta2 = numCuenta2;
        this.observacion = observacion;
        this.estado = estado;
        this.celular = celular;
        this.dni = dni;
    }

    public int getId_provedor() {
        return id_provedor;
    }

    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumCuenta1() {
        return numCuenta1;
    }

    public void setNumCuenta1(int numCuenta1) {
        this.numCuenta1 = numCuenta1;
    }

    public int getNumCuenta2() {
        return numCuenta2;
    }

    public void setNumCuenta2(int numCuenta2) {
        this.numCuenta2 = numCuenta2;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

   
}
