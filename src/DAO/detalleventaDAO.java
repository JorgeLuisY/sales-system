
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.Detalleventa;

public class detalleventaDAO extends ConexionDBM{
    private ArrayList<Detalleventa> lista=new ArrayList<Detalleventa>();
     public detalleventaDAO() {
        con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<Detalleventa> reportarDetalleVenta(){
        Detalleventa to=null;
        ArrayList<Detalleventa> lista=new ArrayList<Detalleventa>();
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            
            while(rs.next()){
                Detalleventa venta= new Detalleventa();// Esto crea una nueva variable cada ves que itera no lo mueva
                venta.setId(rs.getInt("id"));
                venta.setSerie(rs.getInt("setSerie"));                
                venta.setAlmacenproducto(rs.getInt("descripcion"));
                venta.setImporte(rs.getDouble("Importe"));
                venta.setCambio(rs.getDouble("Cambio"));
                venta.setTotal(rs.getDouble("total"));
                lista.add(venta);
            }
        } catch (Exception e) {
            System.out.println("Error en Listado"); 
            System.out.println(e.getMessage());
        }        
        return lista;
    }
    public void insertarDetalleVenta(Detalleventa to){
        int i=0;
        try {
            PreparedStatement venta=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                venta.setInt(++i, to.getId());            
                venta.setInt(++i, to.getSerie());                
                venta.setInt(++i, to.getAlmacenproducto());
                venta.setDouble(++i, to.getImporte());
                venta.setDouble(++i,to.getCambio());
                venta.setDouble(++i,to.getTotal());
                venta.execute();     
           
        } catch (Exception e) {
            System.out.println("Error en Insertar");
            System.out.println(e.getMessage());
        }        
    }
    
    public void actualizarDetalleVenta(Detalleventa to){
        int i=0;
        try {
                PreparedStatement venta=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; "); 
                venta.setInt(++i, to.getId());            
                venta.setInt(++i, to.getSerie());                
                venta.setInt(++i, to.getAlmacenproducto());
                venta.setDouble(++i, to.getImporte());
                venta.setDouble(++i,to.getCambio());
                venta.setDouble(++i,to.getTotal());     
           
        } catch (Exception e) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(e.getMessage());
        }         
    }
    
    
    public int eliminarDetalleVenta(int id){
        int i=0;
        try {
                PreparedStatement ps=con.prepareStatement(" DELETE FROM persona WHERE id=?  ");
                ps.setInt(++i, id);  
               i= ps.executeUpdate();     
           
        } catch (Exception e) {
            System.out.println("Error en Eliminar");
            System.out.println(e.getMessage());
            
        } 
        return i;
    }
    
    
}
