
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class stock {
    
      public  void insertUpdateDeletePharmacist(char operation,Integer id,String dname , String category, String description ,String status 
                                               ,String mdate, String edate,Integer hour,String price,String quantity)
    {
     Connection con = MyConnection.getConnetion();
     PreparedStatement ps;
     
     //i for insert
     if(operation == 'i')
     {
         try {
             ps = con.prepareStatement("INSERT INTO `stock`(`name`, `category`, `description`, `status`, `manufactury_date`, `expiry_date`, `hours_number`, `unit_price`, `quantity`) VALUES (?,?,?,?,?,?,?,?,?)");
             ps.setString(1, dname);
             ps.setString(2, category);
             ps.setString(3, description);
             ps.setString(4, status);
             ps.setString(5, mdate);
             ps.setString(6, edate);
             ps.setInt   (7, hour);
             ps.setString(8, price);
             ps.setString(9, quantity);
             
             if(ps.executeUpdate() > 0){
             
             JOptionPane.showMessageDialog(null, "New Stock Added");
             }
         } catch (SQLException ex) {
             Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    
       if( operation == 'u')//u for update
     {
     try{
             ps = con.prepareStatement("UPDATE `stock` SET `name`=?,`category`=?,`description`=?,`status`=?,`manufactury_date`=?,`expiry_date`=?,`hours_number`=? , `unit_price`=?, `quantity`=? WHERE `id` = ?");
             ps.setString(1, dname);
             ps.setString(2, category);
             ps.setString(3, description);
             ps.setString(4, status);
             ps.setString(5, mdate);
             ps.setString(6, edate);
             ps.setInt (7, hour);
             ps.setString(8, price);
             ps.setString(9, quantity);
             ps.setInt(10, id);
            
             if(ps.executeUpdate() > 0){
             
             JOptionPane.showMessageDialog(null, "Stock Data Update");
             }
     }catch (SQLException ex) {
             Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
     }
     
    }
      if(operation == 'd')//u for delete
          {
          
          int YESOrNO = JOptionPane.showConfirmDialog(null, "The Sold Drugs will Also Be Deleted","Delete stock",JOptionPane.OK_CANCEL_OPTION, 0);
          if(YESOrNO == JOptionPane.OK_OPTION)
          {
          try{
             ps = con.prepareStatement("DELETE FROM stock WHERE  id = ?");
             ps.setInt(1, id);
             if(ps.executeUpdate() > 0){
                 JOptionPane.showMessageDialog(null, "Stock Removed");
             }
     }catch (SQLException ex) {
             Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
     } 
          }
     
             }}   
    public boolean isDrugExist(String stockName)
    {
        boolean isExist = false;
        Connection con = MyConnection.getConnetion();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `stock` WHERE `name`=?" );         
            ps.setString(1, stockName);
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next()){
            isExist =  true; 
            } 
        } catch (SQLException ex) {
            Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return isExist;
    }
           
    public  void fillStockJtable(JTable table, String valueToSearch)
   {
    
        Connection con = MyConnection.getConnetion();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `stock`" );
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
              row[7] = rs.getInt(8);
              row[8] = rs.getString(9);
              row[9] = rs.getString(10);
              
              
              model.addRow(row);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }
   }    
    
    public int getStockId(String stockLabel){
    
    int stockId = 0;
    
    Connection con = MyConnection.getConnetion();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `stock` WHERE `name`=?" );         
            ps.setString(1, stockLabel);
            ResultSet rs = ps.executeQuery();
            
            
            if(rs.next()){
            stockId = rs.getInt("Id");
            } 
        } catch (SQLException ex) {
            Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }
    return stockId;
    }
    
    public  void fillStockCombo(JComboBox combo)
   {
    
        Connection con = MyConnection.getConnetion();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `stock`" );
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next()){
              
              
              combo.addItem(rs.getString(2));
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
