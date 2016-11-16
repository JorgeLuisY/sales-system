
package modelo;
import java.sql.Timestamp;
import java.util.*;


public class Usuario {

    private int id_usuario;
    private String usuario;
    private String password;
    private Date fechaInicio;
    private Date fechaFin;
    
    public Usuario(){}
    
    public Usuario(int id_usuario, String usuario, String password,Date fechaFin) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.password = password;
        this.fechaFin= new Timestamp(fechaFin.getTime());
    }
    
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
} 