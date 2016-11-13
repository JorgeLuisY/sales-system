
package modelo;

/**
 *
 * @author RAMIREZ
 */
public class detalleventa {
    private int id;
    private int serie;
    private int aproductoid;
    private double importe;
    private double cambio;
    private double total;

    public detalleventa(int id, int serie, int aproductoid, double importe, double cambio, double total) {
        this.id = id;
        this.serie = serie;
        this.aproductoid = aproductoid;
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

    public int getAproductoid() {
        return aproductoid;
    }

    public void setAproductoid(int aproductoid) {
        this.aproductoid = aproductoid;
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
