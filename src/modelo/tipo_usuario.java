
package modelo;
import java.util.*;

public class tipo_usuario {
    private int usuario;
    private int rolid;
    private String creadoPor;
    private Date fechaCrea;
    private String descripcion;

    public tipo_usuario(int usuario, int rolid, String creadoPor, String descripcion,int agno,int mes,int dia) {
        this.usuario = usuario;
        this.rolid = rolid;
        this.creadoPor = creadoPor;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        this.fechaCrea=calendario.getTime();
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

    public Date getFechaCrea() {
        return fechaCrea;
    }

    public void setFechaCrea(Date fechaCrea) {
        this.fechaCrea = fechaCrea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
