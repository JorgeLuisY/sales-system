package DAO;

import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.Cliente;

public class ClienteDAO extends ConexionDBM{
   private ArrayList<Cliente> listas=new ArrayList<Cliente>();
   
   public ClienteDAO(){
       con=new ConexionDBM().getInstance();
   }
  
    public ArrayList<Cliente> reportarCliente(){
        con=new ConexionDBM().getInstance();
        try {
            rs=con.prepareStatement("select * from cliente ").executeQuery();
            while(rs.next()){
                Cliente clien=new Cliente();
                clien.setId_cliente(rs.getInt("id"));
                clien.setNombreoRazonS(rs.getString("nombreRz"));
                clien.setRuc(rs.getInt("ruc"));                
                clien.setDni(rs.getInt("dni")); 
                clien.setDireccion(rs.getString("direccion"));
                clien.setTelefono(rs.getString("telefono"));
                clien.setObservacion(rs.getString("observac"));
                listas.add(clien);
            }
        } catch (Exception e) {
        }        
        return listas;
    }
    
    public void insertarCliente(Cliente clien){
        int i=0;
        try {
           PreparedStatement iclien=con.prepareStatement(" INSERT INTO "
                    + " cliente "
                    + " VALUES(?, ?, ?, ?, ?, ?, ?); ");
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
                PreparedStatement ps=con.prepareStatement(" UPDATE cliente SET nombreRz=?, ruc=?, dni=?, direccion=?, telefono=?, observac=? WHERE id=?; ");                          
                           
                ps.setString(++i, to.getNombreoRazonS());
                ps.setInt(++i, to.getRuc());
                ps.setInt(++i, to.getDni());  
                ps.setString(++i, to.getDireccion());
                ps.setString(++i, to.getTelefono());
                ps.setString(++i, to.getObservacion());
                ps.setInt(++i, to.getId_cliente()); 
                ps.executeUpdate();     
           
        } catch (Exception ex) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(ex.getMessage());
        }         
    }
    
    
    public int eliminarPersona(int id){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" DELETE FROM cliente WHERE id=?  ");
                ps.setInt(++i, id);  
               i= ps.executeUpdate();     
           
        } catch (Exception ex) {
            System.out.println("Error en Eliminar");
            System.out.println(ex.getMessage());
        } 
        return i;
    }
    
    
}
