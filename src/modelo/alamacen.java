
package modelo;


public class alamacen {
    private int id_alamcen;
    private int stock;
    private int stockmin;
    private String estado;

    public int getId_alamcen() {
        return id_alamcen;
    }

    public void setId_alamcen(int id_alamcen) {
        this.id_alamcen = id_alamcen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockmin() {
        return stockmin;
    }

    public void setStockmin(int stockmin) {
        this.stockmin = stockmin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
