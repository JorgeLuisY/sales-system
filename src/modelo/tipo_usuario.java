
package modelo;


public class tipo_usuario {
    private int usuario_idFK;
    private String rolidFK;
    private String descripcion;
    private String creadoPor;
    private String fechaCrea;

    public int getUsuario_idFK() {
        return usuario_idFK;
    }

    public void setUsuario_idFK(int usuario_idFK) {
        this.usuario_idFK = usuario_idFK;
    }

    public String getRolidFK() {
        return rolidFK;
    }

    public void setRolidFK(String rolidFK) {
        this.rolidFK = rolidFK;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(String fechaCrea) {
        this.fechaCrea = fechaCrea;
    }
    
}
