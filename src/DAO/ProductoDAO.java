package DAO;

import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import modelo.Producto;

public class ProductoDAO extends ConexionDBM {
    // Variables
    private ArrayList<Producto> lista=new ArrayList<Producto>();
        
    
// Metodos
    public ProductoDAO(){
        con = new ConexionDBM().getInstance();
    }
    
    
    public ArrayList<Producto> reportaProducto(){
        con = new ConexionDBM().getInstance();
        try {
            rs=con.prepareStatement("SELECT * FROM producto order by 1").executeQuery();
            while(rs.next()){
                Producto producto= new Producto();// Esto crea una nueva variable cada ves que itera no lo mueva
                producto.setId_Producto(rs.getInt("id"));
                producto.setCodigoBarra(rs.getInt("codigobarra"));   
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descipcion"));
                producto.setPreCosto(rs.getDouble("preCosto"));
                producto.setPreVenta(rs.getDouble("preVenta"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setCodigoAltern(rs.getString("codigoAltern"));
                producto.setUtilidad(rs.getDouble("utilidad"));
                lista.add(producto);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado"); 
        }        
        return lista;
    }
    
    public void insertarProducto(Producto producto){
        int i=0;
        try {
            PreparedStatement iproduct=con.prepareStatement(" INSERT INTO "
                    + " producto "
                    + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?); ");
                iproduct.setInt(++i, producto.getId_Producto());            
                iproduct.setInt(++i, producto.getCodigoBarra());              
                iproduct.setString(++i, producto.getNombre());  
                iproduct.setString(++i, producto.getDescripcion());
                iproduct.setDouble(++i, producto.getPreCosto());
                iproduct.setDouble(++i, producto.getPreVenta());
                iproduct.setString(++i, producto.getCategoria());
                iproduct.setString(++i, producto.getCodigoAltern());
                iproduct.setDouble(++i, producto.getUtilidad());
                iproduct.executeUpdate();     
                iproduct.close();
        } catch (SQLException ex) {
            System.out.println("Error en Insertar");
            System.out.println(ex.getMessage());
            
        }        
    }
    
    public void actualizarProducto(Producto producto){
        int i=0;
        try {
                PreparedStatement aproduct=con.prepareStatement(" UPDATE producto SET codigobarra=?, nombre=?, descipcion=? , preCosto=?, preVenta=?, categoria=?, codigoAltern=?, utilidad=?  WHERE id=?; ");                          
                aproduct.setInt(++i, producto.getCodigoBarra());                
                aproduct.setString(++i, producto.getNombre()); 
                aproduct.setString(++i, producto.getDescripcion());
                aproduct.setDouble(++i, producto.getPreCosto()); 
                aproduct.setDouble(++i, producto.getPreVenta());
                aproduct.setString(++i, producto.getCategoria());  
                aproduct.setString(++i, producto.getCodigoAltern());
                aproduct.setDouble(++i, producto.getUtilidad());
                aproduct.executeUpdate();  
                aproduct.close();
           
        } catch (Exception ex) {
            System.out.println("Error en Actualizar Intente de nuevo");
            System.out.println(ex.getMessage());
        }         
    }
    
    public int eliminarProducto(int id){
        int i=0;
        try {
                PreparedStatement eproduct=con.prepareStatement(" DELETE FROM producto WHERE id=?  ");
                eproduct.setInt(++i, id);  
                i = eproduct.executeUpdate();
                eproduct.close();
           
        } catch (Exception ex) {
            System.out.println("Error en Eliminar");
            System.out.println(ex.getMessage());
        } 
        return i;
    }

    
}

