
package modelo;


public class tipobase {
    private String tipoCode;
    private String tipoCategoria;
    private String descripcion;
    private String registrador; 

    public tipobase(String tipoCode, String tipoCategoria, String descripcion, String registrador) {
        this.tipoCode = tipoCode;
        this.tipoCategoria = tipoCategoria;
        this.descripcion = descripcion;
        this.registrador = registrador;
    }

    public String getTipoCode() {
        return tipoCode;
    }

    public void setTipoCode(String tipoCode) {
        this.tipoCode = tipoCode;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRegistrador() {
        return registrador;
    }

    public void setRegistrador(String registrador) {
        this.registrador = registrador;
    }
}
