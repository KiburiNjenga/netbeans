import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class CheckExpiry {
    Calendar calendar=Calendar.getInstance();
        SimpleDateFormat format1=new SimpleDateFormat("MM/dd/yy");
        String current= format1.format(calendar.getTime());
    public void  CheckExpiryDate(String tableName){
        String MedicineExpiryDate = "";
        String ProductID = "";
        String n="";
    Connection con = javaconnect.getConnetion();
    Statement st;
    Statement df;
    try {
        
            st = con.createStatement();
            df = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " +tableName);
           
            while(rs.next()){
              
             MedicineExpiryDate = rs.getString("exp_date");
             ProductID = rs.getString("Product_ID");
             
                System.out.println(String.valueOf(MedicineExpiryDate));
                try {
                    Date expiryDate=format1.parse(String.valueOf(MedicineExpiryDate));
                    Date currentDate=format1.parse(current);
                    
                    if(currentDate.after(expiryDate)){
                        
                        JOptionPane.showMessageDialog(null,"Medicine ID "+ProductID+" is expired check and delete ");
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(CheckExpiry.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        
        CheckExpiry exp=new CheckExpiry();
        exp.CheckExpiryDate("stock");
    }
    
    
}
