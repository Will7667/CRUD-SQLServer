package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection getConexion(){
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=JavaCRUD;"
                + "user=sa;"
                + "password=Spoon12!@_Man;"
                + "encrypt=true;"
                + "trustServerCertificate=true";
        
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }
}
