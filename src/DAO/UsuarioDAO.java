package DAO;

import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import modelo.Usuario;

public class UsuarioDAO extends ConexionDBM{
    public UsuarioDAO(){
        con = new ConexionDBM().getInstance();
    }
  
    public ArrayList<Usuario> reportaUsuario(){
        ArrayList<Usuario> lista=new ArrayList<Usuario>();
        con=new ConexionDBM().getInstance();
        Usuario usuario= new Usuario();
        
        try {
            rs=con.prepareStatement("select * from usuario ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                usuario.setId_usuario(rs.getInt("id"));
                usuario.setUsuario(rs.getString("usuario"));                
                usuario.setPassword(rs.getString("password"));
                usuario.setFechaInicio(rs.getDate("fechaInicio"));
                usuario.setFechaFin(rs.getDate("FechaFin"));
                lista.add(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado"); 
        }        
        return lista;
    }
    
    public void insertarUsuario(Usuario usuario){
        int i=0;
        try {
            PreparedStatement iuser=con.prepareStatement(" INSERT INTO "
                    + " usuario "
                    + " VALUES(?, ?, ?, ?, ?); ");
                iuser.setInt(++i, usuario.getId_usuario());            
                iuser.setString(++i, usuario.getUsuario());              
                iuser.setString(++i, usuario.getPassword());  
            //    iuser.setDate(++i, usuario.getFechaInicio(date.getTime()));
            //    iuser.setDate(++i, usuario.getFechaFin(date.getTime()));
                iuser.executeUpdate();     
                iuser.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Insertar");
        }        
    }
    
    public void actualizarUsuario(Usuario usuario){
        int i=0;
        try {
                PreparedStatement auser=con.prepareStatement(" UPDATE usuario SET usuario=?, password=? WHERE id=?; ");                          
                auser.setString(++i, usuario.getUsuario());                
                auser.setString(++i, usuario.getPassword());  
                auser.setInt(++i, usuario.getId_usuario());  
                auser.executeUpdate();  
                auser.close();
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Actualizar Intente de nuevo");
        }         
    }
    
    public int eliminarUsuario(int id){
        int i=0;
        try {
                PreparedStatement euser=con.prepareStatement(" DELETE FROM persona WHERE id=?  ");
                euser.setInt(++i, id);  
                i = euser.executeUpdate();
                euser.close();
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar");
        } 
        return i;
    }

    
}
/* PASAR A LA LOGICA DEL NOEGICIO
    public Usuario buscarUsuario(int id){
        Usuario to=new Usuario();               
        try {
            rs=con.prepareStatement("select * from "
                    + " persona where id="+id+" ")
                    .executeQuery();            
            if(rs.next()){
            to.setId_usuario(rs.getInt("id"));
            to.setUsuario(rs.getString("Usuario"));                
            to.setPassword(rs.getString("Password"));
            to.setFechaInicio(rs.getDate("FechaInicio"));
            to.setFechaFin(rs.getDate("FechaFin"));
            }
        } catch (Exception e) {}        
        return to;
    }*/