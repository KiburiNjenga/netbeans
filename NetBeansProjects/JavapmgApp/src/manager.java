
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class manager {
    public  void insertUpdateDeleteManager(char operation,Integer id,String fname , String lname, String sex ,String bdate 
                                               ,String phone, String address,String email,String username,String password) 
            
    {
     Connection con = MyConnection.getConnetion();
     PreparedStatement ps;
     
     //i for insert
     if( operation == 'i')
     {    
         try {
             ps = con.prepareStatement("INSERT INTO `manager`(`first_name`,`last_name`, `sex`, `birthdate`, `phone`, `address`,`email`, `username`, `password`) VALUES (?,?,?,?,?,?,?,?,?)");
             ps.setString(1, fname);
             ps.setString(2, lname);
             ps.setString(3, sex);
             ps.setString(4, bdate);
             ps.setString(5, phone);
             ps.setString(6, address);
             ps.setString(7, email);
             ps.setString(8, username);
             ps.setString(9, password);
             
             if(ps.executeUpdate() > 0){
             
             JOptionPane.showMessageDialog(null, "New Manager Added");
             }
         } catch (SQLException ex) {
             Logger.getLogger(manager.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     if(operation == 'u')//u for update
     {
    try{
             ps = con.prepareStatement("UPDATE `manager` SET `first_name`=?,`last_name`=?,`sex`=?,`birthdate`=?,`phone`=?,`address`=?,`email`=?,`username`=?,`password`=? WHERE `id`=?");
          
             ps.setString(1, fname);
             ps.setString(2, lname);
             ps.setString(3, sex);
             ps.setString(4, bdate);
             ps.setString(5, phone);
             ps.setString(6, address);
             ps.setString(7, email);
             ps.setString(8, username);
             ps.setString(9,String.valueOf(""));
             ps.setInt(10, id);
             
        
             if(ps.executeUpdate() > 0){
             
             JOptionPane.showMessageDialog(null, "Manager Data Update");
             }
     }catch (SQLException ex) {
             Logger.getLogger(manager.class.getName()).log(Level.SEVERE, null, ex);
     }
     
    }
      if(operation == 'd')//u for delete
          {
           int YESOrNO = JOptionPane.showConfirmDialog(null, "The Sold Drugs will Also Be Deleted","Delete Manager",JOptionPane.OK_CANCEL_OPTION, 0);
          if(YESOrNO == JOptionPane.OK_OPTION)
          {
          try{   
         
          ps = con.prepareStatement("DELETE FROM manager WHERE  id = ?");
             ps.setInt(1, id);
             if(ps.executeUpdate() > 0){
                 JOptionPane.showMessageDialog(null, "manager Removed");
             }
     }catch (SQLException ex) {
             Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
     }
     
          }
     
             }
          
    }
    public  void fillManagerJtable(JTable table, String valueToSearch)
   {
    
        Connection con = MyConnection.getConnetion();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM manager WHERE CONCAT(first_name, last_name, phone, address,email,username,password ) LIKE ?" );
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
              row = new Object [10];
              row[0] = rs.getInt(1);
              row[1] = rs.getString(2);
              row[2] = rs.getString(3);
              row[3] = rs.getString(4);
              row[4] = rs.getString(5);
              row[5] = rs.getString(6);
              row[6] = rs.getString(7);
              row[7] = rs.getString(8);
              row[8] = rs.getString(9);
              row[9] = rs.getString(10);
                      
               
              model.addRow(row);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(manager.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
