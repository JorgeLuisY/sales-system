
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.Empleado;

public class empleadoDAO extends ConexionDBM{
    
    private ArrayList<Empleado> lista=new ArrayList<Empleado>();
     public empleadoDAO() {
        con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<Empleado> reportarEmpleado(){
        Empleado to=null;
        ArrayList<Empleado> lista=new ArrayList<Empleado>();
    
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                Empleado emplea= new Empleado();// Esto crea una nueva variable cada ves que itera no lo mueva
                emplea.setId_empleado(rs.getInt("id_empleado"));
                emplea.setTipoUsuario(rs.getInt("tipo_usuario"));
                emplea.setRol(rs.getInt("rol"));
                emplea.setNombre(rs.getString("nombre"));       
                emplea.setApellido(rs.getString("apellido"));
                emplea.setSexo(rs.getString("sexo"));
                emplea.setFechNacimiento(rs.getTimestamp("fechaNacimiento"));
                emplea.setDireccion(rs.getString("direccion"));
                emplea.setTelefono(rs.getString("telefono"));
                emplea.setCelular(rs.getInt("celular"));
                emplea.setDni(rs.getInt("dni"));
                emplea.setEmail(rs.getString("email"));
                emplea.setSueldo(rs.getDouble("sueldo"));
                emplea.setEstado(rs.getString("estado"));
                
                lista.add(emplea);
            }
        } catch (Exception e) {
            System.out.println("Error en Listado"); 
            System.out.println(e.getMessage());
        }        
        return lista;
    }
   
    
    public void insertarPersona(Empleado emplea){
        int i=0;
        try {
            PreparedStatement iemplea=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                iemplea.setInt(++i, emplea.getId_empleado());  
                iemplea.setInt(++i, emplea.getTipoUsuario()); 
                iemplea.setInt(++i, emplea.getRol()); 
                iemplea.setString(++i, emplea.getNombre());              
                iemplea.setString(++i, emplea.getApellido());  
                iemplea.setString(++i, emplea.getSexo());
                iemplea.setTimestamp(++i, emplea.getFechNacimiento());
                iemplea.setString(++i, emplea.getDireccion());
                iemplea.setString(++i, emplea.getTelefono());
                iemplea.setInt(++i, emplea.getCelular()); 
                iemplea.setInt(++i, emplea.getDni()); 
                iemplea.setString(++i, emplea.getEmail());
                iemplea.setDouble(++i, emplea.getSueldo());
                iemplea.setString(++i, emplea.getEstado());
                
                iemplea.executeUpdate();     
                iemplea.close();   
           
        } catch (Exception e) {
            System.out.println("Error en Insertar");
            System.out.println(e.getMessage());
        }        
    }
    
    public void actualizarPersona(Empleado emplea){
        int i=0;
        try {
                PreparedStatement aemplea=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; ");                          
                aemplea.setInt(++i, emplea.getId_empleado()); 
                aemplea.setInt(++i, emplea.getTipoUsuario());
                aemplea.setInt(++i, emplea.getRol());
                aemplea.setString(++i, emplea.getNombre());  
                aemplea.setString(++i, emplea.getApellido());
                aemplea.setString(++i, emplea.getSexo());
                aemplea.setTimestamp(++i, emplea.getFechNacimiento());
                aemplea.setString(++i, emplea.getDireccion());
                aemplea.setString(++i, emplea.getTelefono());
                aemplea.setInt(++i, emplea.getCelular());
                aemplea.setInt(++i, emplea.getDni());
                aemplea.setString(++i, emplea.getEmail());
                aemplea.setDouble(++i, emplea.getSueldo());
                aemplea.setString(++i, emplea.getEstado());
                
                
                aemplea.executeUpdate();     
           
        } catch (Exception e) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(e.getMessage());
        }         
    }
    
    
    public int eliminarPersona(int id){
        int i=0;
        try {
                PreparedStatement emplead=con.prepareStatement(" DELETE FROM persona WHERE id=?  ");
                emplead.setInt(++i, id);  
               i= emplead.executeUpdate();     
           
        } catch (Exception e) {
            System.out.println("Error en Eliminar");
            System.out.println(e.getMessage());
        } 
        return i;
    }
    
    
}
