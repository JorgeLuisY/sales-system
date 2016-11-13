
package modelo;
import java.util.*;

public class empleado {
    private int id_empleado;
    private int  tipoUsuario;
    private String nombre;
    private String apellido;
    private char sexo;
    private Date fechNac;
    private String direccion;
    private String telefono;
    private int celular;
    private int dni;
    private Date fechaIngreso;
    private String email;
    private Double Sueldo;
    private String estado;

    public empleado(int id_empleado, int tipoUsuario, String nombre, String apellido, char sexo,String direccion, String telefono, int celular, int dni,
            String email, Double Sueldo, String estado,int agno,int mes,int dia) {
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        this.id_empleado = id_empleado;
        this.tipoUsuario = tipoUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechNac = calendario.getTime();
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.dni = dni;
        this.fechaIngreso = calendario.getTime();
        this.email = email;
        this.Sueldo = Sueldo;
        this.estado = estado;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechNac() {
        return fechNac;
    }

    public void setFechNac(Date fechNac) {
        this.fechNac = fechNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}