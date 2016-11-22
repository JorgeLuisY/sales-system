
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import modelo.DetalleCompra;

public class detallecompraDAO extends ConexionDBM{
    private ArrayList<DetalleCompra> lista=new ArrayList<DetalleCompra>();
    
    public detallecompraDAO() {
        con=new ConexionDBM().getInstance();
    }
   
    
    public ArrayList<DetalleCompra> reportarDetalleCompra(){
        
        con=new ConexionDBM().getInstance();
        
        try {
            rs=con.prepareStatement("select * from persona ").executeQuery();
            
            while(rs.next()){
                DetalleCompra compra = new DetalleCompra();
                compra.setId_d_c(rs.getInt("id"));
                compra.setAlmacen(rs.getInt("almacen"));
                compra.setNroCompra(rs.getInt("compra"));
                compra.setProducto(rs.getInt("producto"));
                compra.setFechaCompra(rs.getTimestamp("fechaCompra"));
                lista.add(compra);
            }
        } catch (Exception e) {
            System.out.println("Error en Listado"); 
            System.out.println(e.getMessage());
        }        
        return lista;
    }

    public void insertarDetalleCompra(DetalleCompra compra){
        int i=0;
        try {
            PreparedStatement icompra=con.prepareStatement(" INSERT INTO "
                    + " persona(id, nombres, apellidos)"
                    + " VALUES(?, ?, ?); ");
                icompra.setInt(++i, compra.getId_d_c());
                icompra.setInt(++i, compra.getAlmacen());
                icompra.setInt(++i, compra.getNroCompra());
                icompra.setInt(++i, compra.getProducto());
                icompra.setTimestamp(++i,compra.getFechaCompra());
                icompra.executeUpdate();     
                icompra.close();

           
        } catch (Exception e) {
            System.out.println("Error en Insertar");
            System.out.println(e.getMessage());
        }        
    }
    
    public void actualizarDetalleCompra(DetalleCompra compra){
        int i=0;
        try {
                PreparedStatement Dcompra=con.prepareStatement(" UPDATE persona SET nombres=?, apellidos=? WHERE id=?; "); 
                Dcompra.setInt(++i, compra.getId_d_c());
                Dcompra.setInt(++i, compra.getAlmacen());
                Dcompra.setInt(++i, compra.getNroCompra());
                Dcompra.setInt(++i, compra.getProducto());
                Dcompra.setTimestamp(++i,compra.getFechaCompra());
                Dcompra.executeUpdate();  
                Dcompra.close();  
           
        } catch (Exception e) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(e.getMessage());
        }         
    }

    public int eliminarDetalleCompra(int id){
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
