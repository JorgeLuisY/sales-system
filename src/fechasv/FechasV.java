package fechasv;

import java.sql.Timestamp;

public class FechasV {
    
    //public static void main(String arg[]){
    private long time = System.currentTimeMillis();//retorna la fecha y hora actual en milisegundos 
    private Timestamp fechaActual = new Timestamp(time);
    
    
    public Timestamp getFA(){
        return fechaActual;
    }
    
    

    
    
    
    //System.out.println("La fecha es : "+fechaActual);
    //System.out.println("o se que es "+time);    
//}
}
