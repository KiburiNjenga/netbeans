
import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {
    
    public static Connection getConnetion()
    {
     Connection con =  null;
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pmymgdb","root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
     return con; 
    }
}
