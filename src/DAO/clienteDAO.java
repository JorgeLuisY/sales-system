
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.Cliente;
public class clienteDAO extends ConexionDBM{
   private ArrayList<Cliente> listas=new ArrayList<Cliente>();
   
   class clienteDAO(){
       con=new ConexionDBM().getInstance();
   }
  
    public ArrayList<Cliente> reportarCliente(){
        con=new ConexionDBM().getInstance();
        
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            while(rs.next()){
                Cliente clien=new Cliente();
                clien.setId_cliente(rs.getInt("Id_cliente"));
                clien.setRuc(rs.getInt("Ruc"));                
                clien.setDni(rs.getInt("Dni")); 
                clien.setDireccion(rs.getString("Direccion"));
                clien.setTelefono(rs.getString("Telefono"));
                clien.setObservacion(rs.getString("Observaciones"));
                listas.add(clien);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
        }        
        return listas;
    }
   /* public Cliente buscarCliente(Cliente clien){
        int i=0;               
        try {
             PreparedStatement iclien=con.prepareStatement(" BUSCAR INTO "
                    + " clien "
                    + " VALUES(?, ?, ?, ?, ?); ");
                iclien.setInt(++i, clien.getId_cliente());            
                iclien.setString(++i, clien.getNombreoRazonS());
                iclien.setInt(++i, clien.getRuc());
                iclien.setInt(++i, clien.getDni());  
                iclien.setString(++i, clien.getDireccion());
                iclien.setString(++i, clien.getTelefono());
                iclien.setString(++i, clien.getObservacion());
                iclien.executeUpdate();     
                iclien.close();
            }
         catch (SQLException ex) {        
        System.out.println("Error en buscar");
            System.out.println(ex.getMessage());
    }*/
    
    public void insertarCliente(Cliente clien){
        int i=0;
        try {
           PreparedStatement iclien=con.prepareStatement(" INSERT INTO "
                    + " rol "
                    + " VALUES(?, ?, ?, ?, ?); ");
                iclien.setInt(++i, clien.getId_cliente());            
                iclien.setString(++i, clien.getNombreoRazonS());
                iclien.setInt(++i, clien.getRuc());
                iclien.setInt(++i, clien.getDni());  
                iclien.setString(++i, clien.getDireccion());
                iclien.setString(++i, clien.getTelefono());
                iclien.setString(++i, clien.getObservacion());
                iclien.executeUpdate();     
                iclien.close();
        } catch (SQLException ex) {
            System.out.println("Error en Insertar");
            System.out.println(ex.getMessage());
        }    
              
    }
    
    public void actualizarCliente(Cliente to){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; ");                          
                ps.setString(++i, to.getDireccion());                
                ps.setString(++i, to.getTelefono());
                ps.setString(++i, to.getObservacion()); 
                ps.setInt(++i, to.getId_cliente());  
                ps.setInt(++i, to.getRuc()); 
                ps.setInt(++i, to.getDni()); 
                ps.executeUpdate();     
           
        } catch (Exception ex) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(ex.getMessage());
        }         
    }
    
    
    public int eliminarPersona(int id){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" DELETE FROM persona WHERE id=?  ");
                ps.setInt(++i, id);  
               i= ps.executeUpdate();     
           
        } catch (Exception ex) {
            System.out.println("Error en Eliminar");
            System.out.println(ex.getMessage());
        } 
        return i;
    }
    
    
}
