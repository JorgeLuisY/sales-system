
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.detallecompra;

public class detallecompraDAO extends ConexionDBM{
    public detallecompraDAO() {
        con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<detallecompra> reportarDetalleCompra(){
        detallecompra to=null;
        ArrayList<detallecompra> lista=new ArrayList<detallecompra>();
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            System.out.println("Probar:" +rs.getRow());
            while(rs.next()){
                //to=new detallecompra(almacenid, nroCompra, productoid, agno, mes, dia)pra();
                to.setAlmacenid(rs.getInt("Almacenid"));
                to.setNroCompra(rs.getInt("NroCompra"));                
                to.setProductoid(rs.getInt("Productoid"));
                to.setFechaCompra(rs.getDate("FechaCompra"));
                lista.add(to);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
        }        
        return lista;
    }
    public detallecompra buscarDetalleCompra(int id){
        detallecompra to=null;               
        try {
            rs=con.prepareStatement("select * from "
                    + " persona where id="+id+" ")
                    .executeQuery();            
            if(rs.next()){
            to=new detallecompra(id, id, id, id, id, id);
            to.setAlmacenid(rs.getInt("Almacenid"));
            to.setNroCompra(rs.getInt("NroCompra"));                
            to.setProductoid(rs.getInt("Productoid"));  
            to.setFechaCompra(rs.getDate("FechaCompra"));
            }
        } catch (Exception e) {}        
        return to;
    }
    
    public void insertarDetalleCompra(detallecompra to){
        int i=0;
        try {
            PreparedStatement ps=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                ps.setInt(++i, to.getAlmacenid());            
                ps.setInt(++i, to.getNroCompra());  
                ps.setInt(++i, to.getProductoid());
                //ps.setDate(++i, to.getFechaCompra());                          
                ps.execute();     
           
        } catch (Exception e) {
        }        
    }
    
    public void actualizarDetalleCompra(detallecompra to){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; ");                          
                ps.setInt(++i, to.getAlmacenid());                
                ps.setInt(++i, to.getNroCompra());  
                ps.setInt(++i, to.getProductoid()); 
                //ps.setDate(++i, to.getFechaCompra());
                ps.executeUpdate();     
           
        } catch (Exception e) {
        }         
    }
    
    
    public int eliminarDetalleCompra(int id){
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
