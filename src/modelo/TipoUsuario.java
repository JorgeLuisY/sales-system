
package modelo;
import java.sql.Timestamp;
import java.util.*;

public class TipoUsuario {

    
    private int usuario;
    private int rolid;
    private String creadoPor;
    private String descripcion;

    public TipoUsuario(int usuario, int rolid, String creadoPor, String descripcion) {
        this.usuario = usuario;
        this.rolid = rolid;
        this.creadoPor = creadoPor;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getRolid() {
        return rolid;
    }

    public void setRolid(int rolid) {
        this.rolid = rolid;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
