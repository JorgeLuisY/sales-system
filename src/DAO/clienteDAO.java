
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.Cliente;
public class clienteDAO extends ConexionDBM{
     public clienteDAO() {
        con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<Cliente> reportarCliente(){
        Cliente to=null;
        ArrayList<Cliente> lista=new ArrayList<Cliente>();
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                to=new Cliente(166161, null, 12, 6465, null, null, null);
                to.setId_cliente(rs.getInt("Id_cliente"));
                to.setRuc(rs.getInt("Ruc"));                
                to.setDni(rs.getInt("Dni")); 
                to.setDireccion(rs.getString("Direccion"));
                to.setTelefono(rs.getString("Telefono"));
                to.setObservacion(rs.getString("Observaciones"));
                lista.add(to);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
        }        
        return lista;
    }
    public Cliente buscarCliente(int id){
        Cliente to=null;               
        try {
            rs=con.prepareStatement("select * from "
                    + " persona where id="+id+" ")
                    .executeQuery();            
            if(rs.next()){
            to=new Cliente(id, null, id, id, null, null, null);
            to.setId_cliente(rs.getInt("Id_cliente"));
            to.setRuc(rs.getInt("Ruc"));                
            to.setDni(rs.getInt("Dni")); 
            to.setDireccion(rs.getString("Direccion"));
            to.setTelefono(rs.getString("Telefono"));
            to.setObservacion(rs.getString("Observaciones"));
            }
        } catch (Exception e) {}        
        return to;
    }
    
    public void insertarCliente(Cliente to){
        int i=0;
        try {
            PreparedStatement ps=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                ps.setInt(++i, to.getId_cliente());
                ps.setInt(++i, to.getRuc());
                ps.setInt(++i, to.getDni());
                ps.setString(++i, to.getDireccion());
                ps.setString(++i, to.getTelefono());                
                ps.setString(++i, to.getObservacion());                          
                ps.execute();     
           
        } catch (Exception e) {
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
