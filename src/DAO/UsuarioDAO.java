
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.Usuario;



public class UsuarioDAO extends ConexionDBM{
    public UsuarioDAO(){
        con = new ConexionDBM().getInstance();
    }
  
    public ArrayList<Usuario> reportarPersona(){
        Usuario to=null;
        ArrayList<Usuario> lista=new ArrayList<Usuario>();
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from usuario ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                to=new Usuario(20142226, null, null, null, 2016, 8, 5);
                to.setId_usuario(rs.getInt("id"));
                to.setUsuario(rs.getString("Usuario"));                
                to.setPassword(rs.getString("Password"));
                to.setFechaInicio(rs.getDate("FechaInicio"));
                to.setFechaFin(rs.getDate("FechaFin"));
                lista.add(to);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
        }        
        return lista;
    }
    public Usuario buscarUsuario(int id){
        Usuario to=null;               
        try {
            rs=con.prepareStatement("select * from "
                    + " persona where id="+id+" ")
                    .executeQuery();            
            if(rs.next()){
            to=new Usuario(id, null, null, null, id, id, id);
            to.setId_usuario(rs.getInt("id"));
            to.setUsuario(rs.getString("Usuario"));                
            to.setPassword(rs.getString("Password"));
            to.setFechaInicio(rs.getDate("FechaInicio"));
            to.setFechaFin(rs.getDate("FechaFin"));
            }
        } catch (Exception e) {}        
        return to;
    }
    
    public void insertarUsuario(Usuario to){
        int i=0;
        try {
            PreparedStatement ps=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                ps.setInt(++i, to.getId_usuario());            
                ps.setString(++i, to.getUsuario());              
                ps.setString(++i, to.getPassword());  
                //ps.setDate(++i,to.getFechaInicio());
                //ps.setDate(++i,to.getFechaFin(null));
                ps.execute();     
           
        } catch (Exception e) {
        }        
    }
    
    public void actualizarUsuario(Usuario to){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; ");                          
                ps.setString(++i, to.getUsuario());                
                ps.setString(++i, to.getPassword());  
                ps.setInt(++i, to.getId_usuario());  
                ps.executeUpdate();     
           
        } catch (Exception e) {
        }         
    }
    
    
    public int eliminarUsuario(int id){
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
