
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class JConnection {
    public static Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/testdb","root","");
            System.out.println("Connected");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
