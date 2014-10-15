
package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 
 * @author RonnieDave
 */
public class Conexion {
    
    Connection con;
    
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            System.out.println("carga driver");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
             System.out.println(e);
         }
    }
    
    public Connection obtenerConexion(){        
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            String host = "jdbc:oracle:thin:@localhost:1521:XE";
            con = DriverManager.getConnection(host,"PPI","7098");
          
            if(con !=null){
                System.out.println("Conexión exitosa a la BD");
            }else{
                System.out.println("Conexión fallida a la BD");
             }
        } catch (Exception e){
            e.printStackTrace();
        }        
        return con;
    }        
}