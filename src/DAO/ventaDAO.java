
package DAO;

import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import modelo.Venta;

public class ventaDAO extends conexion.ConexionDBM{
    // Variables
    private ArrayList<Venta> lista=new ArrayList<Venta>();
        
    
// Metodos
    public ventaDAO(){
        con = new ConexionDBM().getInstance();
    }
    
    
    public ArrayList<Venta> reportaVenta(){
        con = new ConexionDBM().getInstance();
        try {
            rs=con.prepareStatement("SELECT * FROM ROL ORDER BY 1").executeQuery();
            while(rs.next()){
                Venta ventas= new Venta();// Esto crea una nueva variable cada ves que itera no lo mueva
                ventas.setSerie(rs.getInt("serie"));
                ventas.setCliente(rs.getInt("cliente"));
                ventas.setNroVenta(rs.getInt("nroVentas"));     
                ventas.setCantidad(rs.getInt("cantidad"));
                ventas.setTipodocumento(rs.getString("descripcion"));
                lista.add(ventas);
            }
        } catch (Exception ex) {
            System.out.println("Error en Listado"); 
            System.out.println(ex.getMessage());
        }        
        return lista;
    }
    
    public void insertarVenta(Venta venta){
        int i=0;
        try {
            PreparedStatement iventa=con.prepareStatement(" INSERT INTO "
                    + " rol "
                    + " VALUES(?, ?, ?, ?, ?); ");
                iventa.setInt(++i, venta.getSerie());   
                iventa.setInt(++i, venta.getCliente());  
                iventa.setInt(++i, venta.getNroVenta());  
                iventa.setInt(++i, venta.getCantidad());  
                iventa.setString(++i, venta.getTipodocumento());              
             
                iventa.executeUpdate();     
                iventa.close();
        } catch (SQLException ex) {
            System.out.println("Error en Insertar");
            System.out.println(ex.getMessage());
        }        
    }
    
    public void actualizarVenta(Venta venta){
        int i=0;
        try {
                PreparedStatement aventa=con.prepareStatement(" UPDATE rol SET rolnombre=?, descripcion=?, rolvalor=?, estado=? WHERE id=?; ");                          
                aventa.setString(++i, venta.getTipodocumento());  
                aventa.setInt(++i, venta.getSerie());
                aventa.setInt(++i, venta.getCantidad());
                aventa.setInt(++i, venta.getNroVenta());
                aventa.setInt(++i, venta.getCliente());   
                aventa.executeUpdate();  
                aventa.close();
           
        } catch (Exception ex) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(ex.getMessage());
        }         
    }
    
    public int eliminarVenta(int id){
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
