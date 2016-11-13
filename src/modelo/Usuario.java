
package modelo;
import java.util.*;


public class Usuario {
    private int id_usuario;
    private String Usuario;
    private String Password;
    private Date FechaInicio;
    private Date FechaFin;

    public Usuario(int id_usuario, String Usuario, String Password, String fechaFin,int agno,int mes,int dia) {
        this.id_usuario = id_usuario;
        this.Usuario = Usuario;
        this.Password = Password;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        this.FechaInicio=calendario.getTime();
        this.FechaFin=calendario.getTime();
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
}
    