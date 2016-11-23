package DAO;

import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import modelo.TipoUsuario;

public class TipoUsuarioDAO extends ConexionDBM{
    // Variables
    private ArrayList<TipoUsuario> lista=new ArrayList<TipoUsuario>();
        
    
// Metodos
    public TipoUsuarioDAO(){
        con = new ConexionDBM().getInstance();
    }
    
    
    public ArrayList<TipoUsuario> reportaTipoUsuario(){
        con = new ConexionDBM().getInstance();
        try {
            rs=con.prepareStatement("SELECT * FROM tipousuario order by 1").executeQuery();
            while(rs.next()){
                TipoUsuario tuser= new TipoUsuario();// Esto crea una nueva variable cada ves que itera no lo mueva
                tuser.setUsuario(rs.getInt("usuarioid"));
                tuser.setRolid(rs.getInt("rolid"));   
                tuser.setCreadoPor(rs.getString("creadoPor"));
                tuser.setFechCreacion(rs.getTimestamp("fechCrea"));
                tuser.setDescripcion(rs.getString("descripcion"));
                lista.add(tuser);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado"); 
        }        
        return lista;
    }
    
    public void insertarTipoUser(TipoUsuario tipousuario){
        int i=0;
        try {
            PreparedStatement ituser=con.prepareStatement(" INSERT INTO "
                    + " producto "
                    + " VALUES(?, ?, ?, ?, ?); ");
                ituser.setInt(++i, tipousuario.getUsuario());            
                ituser.setInt(++i, tipousuario.getRolid());              
                ituser.setString(++i, tipousuario.getCreadoPor());  
                ituser.setTimestamp(++i, tipousuario.getFechCreacion());
                ituser.setString(++i, tipousuario.getDescripcion());
                ituser.executeUpdate();     
                ituser.close();
        } catch (SQLException ex) {
            System.out.println("Error en Insertar");
            System.out.println(ex.getMessage());
            
        }        
    }
    
    public void actualizarTtipoUser(TipoUsuario tipousuario){
        int i=0;
        try {
                PreparedStatement aproduct=con.prepareStatement(" UPDATE tipousuario SET usuarioid=?, rolid=?, creadoPor=? , fechCrea=?, descripcion=? WHERE id=?; ");                          
                aproduct.setInt(++i, tipousuario.getUsuario());                
                aproduct.setInt(++i, tipousuario.getRolid()); 
                aproduct.setString(++i, tipousuario.getCreadoPor());
                aproduct.setTimestamp(++i, tipousuario.getFechCreacion()); 
                aproduct.setString(++i, tipousuario.getDescripcion());
                aproduct.executeUpdate();  
                aproduct.close();
           
        } catch (Exception ex) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(ex.getMessage());
        }         
    }
    
    public int eliminarTipoUser(int id){
        int i=0;
        try {
                PreparedStatement eproduct=con.prepareStatement(" DELETE FROM tipousuario WHERE id=?  ");
                eproduct.setInt(++i, id);  
                i = eproduct.executeUpdate();
                eproduct.close();
           
        } catch (Exception ex) {
            System.out.println("Error en Eliminar");
            System.out.println(ex.getMessage());
        } 
        return i;
    }

}
