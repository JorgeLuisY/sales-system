
package modelo;
import java.util.*;

public class compra {
    private int nroCompra;
    private int proovedorid;
    private Date fechaCompra;
    private int cantidad;
    private String tipodocumento;

    public compra(int nroCompra, int proovedorid, int cantidad, String tipodocumento,int agno,int mes,int dia) {
        this.nroCompra = nroCompra;
        this.proovedorid = proovedorid;
        this.cantidad = cantidad;
        this.tipodocumento = tipodocumento;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        this.fechaCompra=calendario.getTime();
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

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
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
