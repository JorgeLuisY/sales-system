
package DAO;
import conexion.ConexionDBM;
import java.sql.*;
import java.util.*;
import java.util.Date;
import modelo.Almacen;
public class almacenDAO extends ConexionDBM{
    
    ArrayList<Almacen> lista=new ArrayList<Almacen>();
    
    public almacenDAO() {
        
       con=new ConexionDBM().getInstance();
    }      
       public ArrayList<Almacen> reportaAlmacen(){
        con = new ConexionDBM().getInstance();
        try {
            rs=con.prepareStatement("SELECT * FROM ROL ORDER BY 1").executeQuery();
            while(rs.next()){
                Almacen almacenes= new Almacen();// Esto crea una nueva variable cada ves que itera no lo mueva
                almacenes.setId_alamcen(rs.getInt("id"));
                almacenes.setEstado(rs.getString("estado")); 
                almacenes.setStock(rs.getInt("stock"));
                almacenes.setStockmin(rs.getInt("stockmin"));
                
                lista.add(almacenes);
            }
        } catch (Exception ex) {
            System.out.println("Error en Listado"); 
            System.out.println(ex.getMessage());
        }        
        return lista;
    }
    
    public void insertarRol(Almacen almace){
        int i=0;
        try {
            PreparedStatement ialmacen=con.prepareStatement(" INSERT INTO "
                    + " rol "
                    + " VALUES(?, ?, ?, ?, ?); ");
                ialmacen.setInt(++i, almace.getId_alamcen());            
                ialmacen.setString(++i, almace.getEstado());
                ialmacen.setInt(++i, almace.getStock());
                ialmacen.setInt(++i, almace.getStockmin());
                ialmacen.executeUpdate();     
                ialmacen.close();
        } catch (SQLException ex) {
            System.out.println("Error en Insertar");
            System.out.println(ex.getMessage());
        }        
    }
    
    public void actualizarRol(Almacen almace){
        int i=0;
        try {
                PreparedStatement aAlmacen=con.prepareStatement(" UPDATE rol SET rolnombre=?, descripcion=?, rolvalor=?, estado=? WHERE id=?; ");                          
                aAlmacen.setInt(++i, almace.getId_alamcen());                
                aAlmacen.setString(++i, almace.getEstado()); 
                aAlmacen.setInt(++i, almace.getStock());
                aAlmacen.setInt(++i, almace.getStockmin());  
                aAlmacen.executeUpdate();  
                aAlmacen.close();
           
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

    
    

