
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.detalleventa;

public class detalleventaDAO extends ConexionDBM{
     public detalleventaDAO() {
        con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<detalleventa> reportarDetalleVenta(){
        detalleventa to=null;
        ArrayList<detalleventa> lista=new ArrayList<detalleventa>();
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                //to=new detalleventa(id, serie, aproductoid, importe, cambio, total);
                to.setId(rs.getInt("id"));
                to.setSerie(rs.getInt("Serie"));
                to.setAproductoid(rs.getInt("Aproductoid"));
                to.setImporte(rs.getDouble("Importe"));
                to.setCambio(rs.getDouble("Cambio"));
                to.setTotal(rs.getDouble("Total"));
                                
                 
                lista.add(to);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
        }        
        return lista;
    }
    public detalleventa buscarDetalleVenta(int id){
        detalleventa to=null;               
        try {
            rs=con.prepareStatement("select * from "
                    + " persona where id="+id+" ")
                    .executeQuery();            
            if(rs.next()){
            to=new detalleventa(id, id, id, id, id, id);
            to.setId(rs.getInt("id"));
            to.setSerie(rs.getInt("Serie"));  
            to.setAproductoid(rs.getInt("Aproductoid"));
            to.setImporte(rs.getInt("Importe"));
            to.setCambio(rs.getInt("Cambio"));
            to.setTotal(rs.getInt("Total"));                                 
            }
        } catch (Exception e) {}        
        return to;
    }
    
    public void insertarDetalleVenta(detalleventa to){
        int i=0;
        try {
            PreparedStatement ps=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                ps.setInt(++i, to.getId());            
                ps.setInt(++i, to.getSerie());                
                ps.setInt(++i, to.getAproductoid());
                ps.setDouble(++i, to.getImporte());
                ps.setDouble(++i,to.getCambio());
                ps.setDouble(++i,to.getTotal());
                ps.execute();     
           
        } catch (Exception e) {
        }        
    }
    
    public void actualizarDetalleVenta(detalleventa to){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; "); 
                ps.setInt(++i, to.getId());            
                ps.setInt(++i, to.getSerie());                
                ps.setInt(++i, to.getAproductoid());
                ps.setDouble(++i, to.getImporte());
                ps.setDouble(++i,to.getCambio());
                ps.setDouble(++i,to.getTotal());     
           
        } catch (Exception e) {
        }         
    }
    
    
    public int eliminarDetalleVenta(int id){
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
