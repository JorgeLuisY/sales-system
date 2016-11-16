
package modelo;

public class Venta {
    private int serie;
    private int cliente;
    private int nroVenta;
    private int cantidad;
    private String tipodocumento;

    public Venta(int serie, int cliente, int nroVenta, int cantidad, String tipodocumento) {
        this.serie = serie;
        this.cliente = cliente;
        this.nroVenta = nroVenta;
        this.cantidad = cantidad;
        this.tipodocumento = tipodocumento;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int clienteid) {
        this.cliente = clienteid;
    }

    public int getNroVenta() {
        return nroVenta;
    }

    public void setNroVenta(int nroVenta) {
        this.nroVenta = nroVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }
    
    
}
