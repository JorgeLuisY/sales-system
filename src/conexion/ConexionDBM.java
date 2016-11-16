package conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDBM {
    public Connection con=null;
    public ResultSet rs=null;
    private String driver = "com.mysql.jdbc.Driver";
    private String myBD = "jdbc:mysql://localhost:3306/dbventas";
    private String usuario = "root";
    private String passw = "";//Cambie la contraseña por defecto algunos no tienen o estan con root
    
    public ConexionDBM(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(myBD,usuario,passw);
        }catch(SQLException e2){
         System.out.println("Error : "+e2.getMessage());
      }catch(ClassNotFoundException e2){
         Logger.getLogger(ConexionDBM.class.getName()).log(Level.SEVERE,null, e2);
      }
    }
    
    // Metodo para usar la conexion 
     public Connection getInstance(){
        if(con==null){
        con = (Connection) new ConexionDBM();
        }
        return con;
    }
    
    /* // Metodo para probar la conexxion */
    public static void main(String[] args) {
       ConexionDBM nuevaconec = new ConexionDBM();
       
       Connection imprimir = nuevaconec.getInstance();
        System.out.println("La conexiuon fue Existosa "+ imprimir);
    } 
}