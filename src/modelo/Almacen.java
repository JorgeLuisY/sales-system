
package modelo;


public class Almacen {
    private int id_alamcen;
    private String estado;
    private int stock;
    private int stockmin;
    
    public Almacen(){}

    public Almacen(int id_alamcen, String estado, int stock, int stockmin) {
        this.id_alamcen = id_alamcen;
        this.estado = estado;
        this.stock = stock;
        this.stockmin = stockmin;
    }

    public int getId_alamcen() {
        return id_alamcen;
    }

    public void setId_alamcen(int id_alamcen) {
        this.id_alamcen = id_alamcen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
    
    

}
