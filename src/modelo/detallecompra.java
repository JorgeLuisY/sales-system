
package modelo;
import java.util.*;

public class detallecompra {
    private int  almacenid;
    private int nroCompra;
    private int productoid;
    private Date fechaCompra;

    public detallecompra(int almacenid, int nroCompra, int productoid,int agno,int mes, int dia) {
        this.almacenid = almacenid;
        this.nroCompra = nroCompra;
        this.productoid = productoid;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        this.fechaCompra=calendario.getTime();
    }

    public int getAlmacenid() {
        return almacenid;
    }

    public void setAlmacenid(int almacenid) {
        this.almacenid = almacenid;
    }

    public int getNroCompra() {
        return nroCompra;
    }

    public void setNroCompra(int nroCompra) {
        this.nroCompra = nroCompra;
    }

    public int getProductoid() {
        return productoid;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    
    
}
