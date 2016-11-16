
package modelo;
import java.sql.Timestamp;
import java.util.*;

public class Empleado {
    private int id_empleado;
    private int  tipoUsuario;
    private int rol;
    private String nombre;
    private String apellido;
    private char sexo;
    private Date fechNacimiento;
    private String direccion;
    private String telefono;
    private int celular;
    private int dni;
    private String email;
    private Double Sueldo;
    private String estado;

    public Empleado(int idEmp,String nombre, String apellido, char sexo,String direccion, String telefono, int celular, int dni,
            String email,Double Sueldo, String estado,Date fechaNac,int tipoUsuario,int rol) {
        this.id_empleado = idEmp;
        this.tipoUsuario = tipoUsuario;
        this.rol = rol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechNacimiento = new Timestamp(fechaNac.getTime());
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.dni = dni;
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

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
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

    public Date getFechNacimiento() {
        return fechNacimiento;
    }

    public void setFechNacimiento(Date fechNacimiento) {
        this.fechNacimiento = fechNacimiento;
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