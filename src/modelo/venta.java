
package modelo;

public class venta {
    private int serie;
    private int clienteid;
    private int nroVenta;
    private int cantidad;
    private String tipodocumento;

    public venta(int serie, int clienteid, int nroVenta, int cantidad, String tipodocumento) {
        this.serie = serie;
        this.clienteid = clienteid;
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

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
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
