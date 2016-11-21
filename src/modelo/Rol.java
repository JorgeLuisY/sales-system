
package modelo;


public class Rol {

    private int id_rol ;
    private String rolnombre;
    private String descripcion;
    private String rolvalor;
    private String estado;

    public Rol(String rolnombre, String descripcion, String rolvalor, String estado) {
        this.rolnombre = rolnombre;
        this.descripcion = descripcion;
        this.rolvalor = rolvalor;
        this.estado = estado;
    }
    
    public Rol(){}

        public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRolnombre() {
        return rolnombre;
    }

    public void setRolnombre(String rolnombre) {
        this.rolnombre = rolnombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRolvalor() {
        return rolvalor;
    }

    public void setRolvalor(String rolvalor) {
        this.rolvalor = rolvalor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
