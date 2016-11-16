
package modelo;

public class Compra {
    private int nroCompra;
    private int proovedorid;
    private int cantidad;
    private String tipodocumento;

    public Compra(int nroCompra, int proovedorid, int cantidad, String tipodocumento){
        this.nroCompra = nroCompra;
        this.proovedorid = proovedorid;
        this.cantidad = cantidad;
        this.tipodocumento = tipodocumento;
    }

    public int getNroCompra() {
        return nroCompra;
    }

    public void setNroCompra(int nroCompra) {
        this.nroCompra = nroCompra;
    }

    public int getProovedorid() {
        return proovedorid;
    }

    public void setProovedorid(int proovedorid) {
        this.proovedorid = proovedorid;
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
