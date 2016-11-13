
package conexion;
import java.sql.*;

public class clsConexion {
    public Connection con=null;
    public ResultSet rs=null;

   
    public static void main(String[] args) {
        try{
            System.out.println("Estoy tratando conectarme a la base de datos");
            Class.forName("com.mysql.jdbc.Driver");
            //Localhost cambiar por el nombre  de base datos
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo", "root","");
            System.out.println("Conexion Exitosa");
            
            
        }
        catch(SQLException e){
            System.out.println("Error de MySQl");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Se ha encontrado el siguiente error: "+e.getMessage());
            
        }
        
        
        
    }
     public Connection getInstance(){
        if(con==null){
        con=(Connection) new clsConexion();
        }

        
        return con;
    }
    
}
