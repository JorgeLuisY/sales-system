
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.Compra;
public class compraDAO extends ConexionDBM {
     private ArrayList<Compra> lista=new ArrayList<Compra>();
    public compraDAO(){
        con = new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<Compra> reportarCompra(){
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from compra ").executeQuery();
            
            while(rs.next()){
                Compra compra = new Compra();
                compra.setNroCompra(rs.getInt("Compra"));
                compra.setProovedorid(rs.getInt("Proovedorid"));
                compra.setCantidad(rs.getInt("Cantidad")); 
                compra.setTipodocumento(rs.getString("Tipodocumento"));
                lista.add(compra);
                //System.out.println("OJO"+lista.size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error en Listado");
        }        
        return lista;
    }
    
    public void insertarCompra(Compra compra){
        int i=0;
        try {
            PreparedStatement ipcompra=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                ipcompra.setInt(++i, compra.getNroCompra());            
                ipcompra.setInt(++i, compra.getProovedorid());              
                ipcompra.setInt(++i, compra.getCantidad());  
                ipcompra.setString(++i, compra.getTipodocumento());
                
              
           
        } catch (SQLException ex) {
            System.out.println("Error en Insertar");
            System.out.println(ex.getMessage());
        }        
    }
    
    public void actualizarCompra(Compra compra){
        int i=0;
        try {
                PreparedStatement apcompra=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; ");                          
                apcompra.setInt(++i, compra.getNroCompra());            
                apcompra.setInt(++i, compra.getProovedorid());              
                apcompra.setInt(++i, compra.getCantidad());  
                apcompra.setString(++i, compra.getTipodocumento());    
           
        } catch (Exception e) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(e.getMessage());
        }         
    }
    
    
    public int eliminarCompra(int id){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" DELETE FROM compra WHERE id=?  ");
                ps.setInt(++i, id);  
               i= ps.executeUpdate();     
           
        } catch (Exception e) {
        } 
        return i;
    }
    
}
