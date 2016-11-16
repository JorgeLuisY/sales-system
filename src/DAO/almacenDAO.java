
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.almacen;
public class almacenDAO extends ConexionDBM{
    public almacenDAO() {
        //con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<almacen> mostrarProducto(){
        almacen to=null;
        ArrayList<almacen> lista=new ArrayList<almacen>();
        con=new  ConexionDBM ().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                to=new almacen(20154, null, 8, 5);
                to.setId_alamcen(rs.getInt("id_almcen"));
                //to.setStock(rs.getString());                
                //to.setStockmin(rs.getString("stockmin")); 
                lista.add(to);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
        }        
        return lista;
    }
    public almacen buscarProduct(int id){
        almacen to=null;               
        try {
            rs=con.prepareStatement("select * from "
                    + " persona where id="+id+" ")
                    .executeQuery();            
            if(rs.next()){
            to=new almacen(id, null, id, id);
            to.setId_alamcen(rs.getInt("id_alamcen"));
            to.setEstado(rs.getString("Estado"));                
            //to.setStock(rs.getString("Stock")); 
            to.setStockmin(5);
            }
        } catch (Exception e) {}        
        return to;
    }
    
    public void insertarProdcuto(almacen to){
        int i=0;
        try {
            PreparedStatement ps=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                ps.setInt(++i, to.getId_alamcen());            
                ps.setString(++i, to.getEstado());                
                ps.setInt(++i, to.getStock());
                ps.setInt(++i, to.getStockmin());
                ps.execute();     
           
        } catch (Exception e) {
        }        
    }
    
    public void actualizarProducto(almacen to){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; ");                          
                ps.setString(++i, to.getEstado());                
                ps.setInt(++i, to.getStock());  
                ps.setInt(++i, to.getStockmin());
                //ps.setInt(++i, to.setId_alamcen(5554));
                ps.executeUpdate();     
           
        } catch (Exception e) {
        }         
    }
    
    
    public int eliminarProducto(int id){
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
