
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.compra;
public class compraDAO extends ConexionDBM {
     public compraDAO () {
        con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<compra> reportarCompra(){
        compra to=null;
        ArrayList<compra> lista=new ArrayList<compra>();
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                //to=new compra(nroCompra, proovedorid, cantidad, null, agno, mes, dia);
                to.setNroCompra(rs.getInt("Compra"));
                to.setProovedorid(rs.getInt("Proovedorid"));
                to.setFechaCompra(rs.getDate("FechaCompra"));
                to.setCantidad(rs.getInt("Cantidad")); 
                to.setTipodocumento(rs.getString("Tipodocumento"));
                lista.add(to);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
        }        
        return lista;
    }
    public compra buscarCompra(int id){
        compra to=null;               
        try {
            rs=con.prepareStatement("select * from "
                    + " persona where id="+id+" ")
                    .executeQuery();            
            if(rs.next()){
            to=new compra(id, id, id, null, id, id, id);
            to.setNroCompra(rs.getInt("NroCompra"));
            to.setCantidad(rs.getInt("Cantidad"));
            to.setProovedorid(rs.getInt("Proovedorid"));                
            to.setFechaCompra(rs.getDate("FechaCompra"));
            
            to.setTipodocumento(rs.getString("Tipodocumento"));
            }
        } catch (Exception e) {}        
        return to;
    }
    
    public void insertarCompra(compra to){
        int i=0;
        try {
            PreparedStatement ps=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
            
                ps.setInt(++i, to.getNroCompra());
                ps.setInt(++i, to.getCantidad()); 
                ps.setInt(++i, to.getProovedorid());
                //ps.setDate(++i, to.getFechaCompra()); 
                 ps.setString(++i, to.getTipodocumento());
                
                ps.execute();     
           
        } catch (Exception e) {
        }        
    }
    
    public void actualizarCompra(compra to){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; ");                          
                ps.setInt(++i, to.getNroCompra());                
                ps.setInt(++i, to.getCantidad());  
                ps.setInt(++i, to.getProovedorid());
                //ps.setDate(++i, to.getFechaCompra());
                ps.setString(++i, to.getTipodocumento());
                ps.executeUpdate();     
           
        } catch (Exception e) {
        }         
    }
    
    
    public int eliminarCompra(int id){
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
