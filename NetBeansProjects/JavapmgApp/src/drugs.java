
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class drugs {
       public  void insertUpdateDeletePharmacist(char operation,Integer Pid,Integer Sid,Double tdr ,String descp,String price,String quantity )
    {
     Connection con = MyConnection.getConnetion();
     PreparedStatement ps;
     
     //i for insert
     if(operation == 'i')
     {
         try {
             ps = con.prepareStatement("INSERT INTO `solddrugs`(`pharmacist_id`,`stock_id`, `total_drugs`, `description`,`unit_price`, `quantity`) VALUES (?,?,?,?,?,?)");
             ps.setInt(1, Pid);
             ps.setInt(2, Sid);
             ps.setDouble(3, tdr);
             ps.setString(4, descp);
             ps.setString(5, price);
             ps.setString(6, quantity);
             
             if(ps.executeUpdate() > 0){
             
             JOptionPane.showMessageDialog(null, "Sold   Drug Added");
             }
         } catch (SQLException ex) {
             Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    
       if( operation == 'u')//u for update
     {
     try{
             ps = con.prepareStatement("UPDATE `solddrugs` SET`total_drugs`=?,`description`=?,`unit_price`=?,`quantity`=? WHERE\n" +
"`pharmacist_id`=? AND`stock_id`=?");
             
               ps.setDouble(1, tdr);
               ps.setString(2, descp);
               ps.setInt(3, Pid);
               ps.setInt(4, Sid);
               ps.setString(5, price);
               ps.setString(6, quantity);
               
            
             if(ps.executeUpdate() > 0){
             
             JOptionPane.showMessageDialog(null, "Drug Data Update");
             }
     }catch (SQLException ex) {
             Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
     }
     
    }
      if(operation == 'd')//u for delete
          {
     try{
             ps = con.prepareStatement("DELETE FROM `solddrugs` WHERE `pharmacist_id`=? AND `stock_id`=?");
             ps.setInt(1, Pid);
             ps.setInt(2, Sid);
             if(ps.executeUpdate() > 0){
                 JOptionPane.showMessageDialog(null, "Drug Removed");
             }
     }catch (SQLException ex) {
             Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
     }
     
             }}
  
     public  void fillDrugJtable(JTable table, String valueToSearch)
   {
    
        Connection con = MyConnection.getConnetion();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `solddrugs`" );
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
              row = new Object [6];
              row[0] = rs.getInt(1);
              row[1] = rs.getInt(2);
              row[2] = rs.getDouble(3);
              row[3] = rs.getString(4);
              row[4] = rs.getString(5);
              row[5] = rs.getString(6);
              
              model.addRow(row);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  
       public  void ShowAllSoldDrugs(JTable table, String valueToSearch)
   {
    
        Connection con = MyConnection.getConnetion();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT `pharmacist_id`,first_name,last_name,name,total_drugs,solddrugs.unit_price,solddrugs.quantity\n"+
                    "FROM `solddrugs` \n"+
                     "INNER JOIN pharmacist AS ptab ON ptab.id =`pharmacist_id`\n"+
                    "INNER JOIN stock AS stab on stab.id = `stock_id`" );
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object [] row;
            
            while(rs.next()){
              row = new Object [7];
              row[0] = rs.getInt(1);
              row[1] = rs.getString(2);
              row[2] = rs.getString(3);
              row[3] = rs.getString(4);
              row[4] = rs.getDouble(5);
              row[5] = rs.getString(6);
              row[6] = rs.getString(7);
              
              model.addRow(row);    
            }
        } catch (SQLException ex) {
            Logger.getLogger(pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

     
     
}