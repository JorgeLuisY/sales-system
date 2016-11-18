
package modelo;
import java.sql.Timestamp;
import java.util.*;


public class Usuario {

    private int id_usuario;
    private String usuario;
    private String password;
    private Timestamp fechaInicio;
    private Timestamp fechaFin;
    
    public Usuario(){}
    
    public Usuario(int id_usuario, String usuario, String password,Timestamp fechaFin) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.password = password;
        this.fechaFin= fechaFin;
        // this.fechaFin= new Timestamp(fechaFin.getTime());
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

    public Timestamp getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Timestamp fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
} 