package DAO;

import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import modelo.Rol;

public class RolDAO extends conexion.ConexionDBM{
    // Variables
    private ArrayList<Rol> lista=new ArrayList<Rol>();
        
    
// Metodos
    public RolDAO(){
        con = new ConexionDBM().getInstance();
    }
    
    
    public ArrayList<Rol> reportaRol(){
        con = new ConexionDBM().getInstance();
        try {
            rs=con.prepareStatement("SELECT * FROM ROL ORDER BY 1").executeQuery();
            while(rs.next()){
                Rol roles= new Rol();// Esto crea una nueva variable cada ves que itera no lo mueva
                roles.setId_rol(rs.getInt("id"));
                roles.setRolnombre(rs.getString("rolnombre"));                
                roles.setDescripcion(rs.getString("descripcion"));
                roles.setRolvalor(rs.getString("rolvalor"));
                roles.setEstado(rs.getString("estado"));
                lista.add(roles);
            }
        } catch (Exception ex) {
            System.out.println("Error en Listado"); 
            System.out.println(ex.getMessage());
        }        
        return lista;
    }
    
    public void insertarRol(Rol rol){
        int i=0;
        try {
            PreparedStatement irol=con.prepareStatement(" INSERT INTO "
                    + " rol "
                    + " VALUES(?, ?, ?, ?, ?); ");
                irol.setInt(++i, rol.getId_rol());            
                irol.setString(++i, rol.getRolnombre());              
                irol.setString(++i, rol.getDescripcion());  
                irol.setString(++i, rol.getRolvalor());
                irol.setString(++i, rol.getEstado());
                irol.executeUpdate();     
                irol.close();
        } catch (SQLException ex) {
            System.out.println("Error en Insertar");
            System.out.println(ex.getMessage());
        }        
    }
    
    public void actualizarRol(Rol rol){
        int i=0;
        try {
                PreparedStatement arol=con.prepareStatement(" UPDATE rol SET rolnombre=?, descripcion=?, rolvalor=?, estado=? WHERE id=?; ");                          
                arol.setString(++i, rol.getRolnombre());                
                arol.setString(++i, rol.getDescripcion()); 
                arol.setString(++i, rol.getRolvalor());
                arol.setString(++i, rol.getEstado()); 
                arol.setInt(++i, rol.getId_rol());
                arol.executeUpdate();  
                arol.close();
           
        } catch (Exception ex) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(ex.getMessage());
        }         
    }
    
    public int eliminarRol(int id){
        int i=0;
        try {
                PreparedStatement erol=con.prepareStatement(" DELETE FROM rol WHERE id=?  ");
                erol.setInt(++i, id);  
                i = erol.executeUpdate();
                erol.close();
           
        } catch (Exception ex) {
            System.out.println("Error en Eliminar");
            System.out.println(ex.getMessage());
        } 
        return i;
    }
}
