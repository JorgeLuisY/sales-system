
package modelo;

/**
 *
 * @author RAMIREZ
 */
public class Detalleventa {

    private int id;
    private int serie;
    private int almacenproducto;
    private double importe;
    private double cambio;
    private double total;
    
    public Detalleventa(){}

    public Detalleventa(int id, int serie, int almacenproducto, double importe, double cambio, double total) {
        this.id = id;
        this.serie = serie;
        this.almacenproducto = almacenproducto;
        this.importe = importe;
        this.cambio = cambio;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getAlmacenproducto() {
        return almacenproducto;
    }

    public void setAlmacenproducto(int almacenproducto) {
        this.almacenproducto = almacenproducto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
}
