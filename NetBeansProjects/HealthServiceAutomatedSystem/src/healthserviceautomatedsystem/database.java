/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package healthserviceautomatedsystem;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author madman
 */
public class database 
{
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    public database()
    {
        connect();
    }
    public static void connect()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/healthunit","root"," ");
            stmt = conn.createStatement();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Sorry...could not access the database at the moment");
        }
    }
    public static void closeConnection()
    {
        if (conn != null) 
        {
            try
            {
                conn.close();
            } catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }  
}
