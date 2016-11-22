
package modelo;
import java.sql.Timestamp;
import java.util.*;

public class DetalleCompra {
    public DetalleCompra(){}

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    private int id_d_c;
    private int  almacen;
    private int nroCompra;
    private int producto;
    private Timestamp fechaCompra;

    public DetalleCompra(int iadc,int almacenid, int nroCompra, int producto,Date fechaCompra) {
        id_d_c = iadc;
        this.almacen = almacenid;
        this.nroCompra = nroCompra;
        this.producto= producto;
        this.fechaCompra= new Timestamp(fechaCompra.getTime());
    }

    public int getId_d_c() {
        return id_d_c;
    }

    public void setId_d_c(int id_d_c) {
        this.id_d_c = id_d_c;
    }

    public int getAlmacen() {
        return almacen;
    }

    public void setAlmacen(int almacen) {
        this.almacen = almacen;
    }

    public int getNroCompra() {
        return nroCompra;
    }

    public void setNroCompra(int nroCompra) {
        this.nroCompra = nroCompra;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

}
