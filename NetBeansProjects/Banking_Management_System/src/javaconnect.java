
import java.sql.Connection;
import java.sql.DriverManager;


public class javaconnect {
    

 public static Connection getConnetion()
    {
     Connection con =  null;
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
     return con; 
    
}}

