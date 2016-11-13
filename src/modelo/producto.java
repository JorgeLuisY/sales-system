
package modelo;

public class producto {
    private int id_Producto;
    private int codigoBarra;
    private String nombre;
    private String descripcion;
    private Double preCosto;
    private Double preVenta;
    private String categoria;
    private String codigoAltern;
    private Double utilidad; 

    public producto(int id_Producto, int codigoBarra, String nombre, String descripcion, Double preCosto, Double preVenta, String categoria, Double utilidad) {
        this.id_Producto = id_Producto;
        this.codigoBarra = codigoBarra;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.preCosto = preCosto;
        this.preVenta = preVenta;
        this.categoria = categoria;
        this.utilidad = utilidad;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
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

    public Double getPreCosto() {
        return preCosto;
    }

    public void setPreCosto(Double preCosto) {
        this.preCosto = preCosto;
    }

    public Double getPreVenta() {
        return preVenta;
    }

    public void setPreVenta(Double preVenta) {
        this.preVenta = preVenta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigoAltern() {
        return codigoAltern;
    }

    public void setCodigoAltern(String codigoAltern) {
        this.codigoAltern = codigoAltern;
    }

    public Double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Double utilidad) {
        this.utilidad = utilidad;
    }
}
