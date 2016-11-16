
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.empleado;

public class empleadoDAO extends ConexionDBM{
     public empleadoDAO() {
        con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<empleado> reportarEmpleado(){
        empleado to=null;
        ArrayList<empleado> lista=new ArrayList<empleado>();
        /*private int id_empleado;
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
    private String estado;*/
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                //to=new empleado(id_empleado, tipoUsuario, null, null, sexo, null, null, celular, dni, null, Double.NaN, null, agno, mes, dia);
                to.setId_empleado(rs.getInt("id_empleado"));
                to.setTipoUsuario(rs.getInt("tipoUsuario"));
                to.setNombre(rs.getString("Nombre"));                
                to.setApellido(rs.getString("Apellidos")); 
                //to.getSexo(rs.getCharacterStream(""));
                //to.getFechNac(rs.getDate(""));
                //to.getDireccion(rs.getString("Direccion"));
                to.getDireccion(rs.getString("Direccion"));
                lista.add(to);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
        }        
        return lista;
    }
    public PersonaTO buscarPersonaId(int id){
        PersonaTO to=null;               
        try {
            rs=con.prepareStatement("select * from "
                    + " persona where id="+id+" ")
                    .executeQuery();            
            if(rs.next()){
            to=new PersonaTO();
            to.setId(rs.getInt("id"));
            to.setNombres(rs.getString("nombres"));                
            to.setApellidos(rs.getString("apellidos"));                                 
            }
        } catch (Exception e) {}        
        return to;
    }
    
    public void insertarPersona(PersonaTO to){
        int i=0;
        try {
            PreparedStatement ps=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                ps.setInt(++i, to.getId());            
                ps.setString(++i, to.getNombres());                
                ps.setString(++i, to.getApellidos());                          
                ps.execute();     
           
        } catch (Exception e) {
        }        
    }
    
    public void actualizarPersona(PersonaTO to){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; ");                          
                ps.setString(++i, to.getNombres());                
                ps.setString(++i, to.getApellidos());  
                ps.setInt(++i, to.getId());  
                ps.executeUpdate();     
           
        } catch (Exception e) {
        }         
    }
    
    
    public int eliminarPersona(int id){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" DELETE FROM persona WHERE id=?  ");
                ps.setInt(++i, id);  
               i= ps.executeUpdate();     
           
        } catch (Exception e) {
        } 
        return i;
    }
    
    
}
