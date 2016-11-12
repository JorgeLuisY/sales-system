
package modelo;

public class producto {
    private int id_Producto;
    private int codBarra;
    private String nombre;
    private String descripcion;
    private String preCosto;
    private String preVenta;
    private int almacenid;

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(int codBarra) {
        this.codBarra = codBarra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPreCosto() {
        return preCosto;
    }

    public void setPreCosto(String preCosto) {
        this.preCosto = preCosto;
    }

    public String getPreVenta() {
        return preVenta;
    }

    public void setPreVenta(String preVenta) {
        this.preVenta = preVenta;
    }

    public int getAlmacenid() {
        return almacenid;
    }

    public void setAlmacenid(int almacenid) {
        this.almacenid = almacenid;
    }
    
}
