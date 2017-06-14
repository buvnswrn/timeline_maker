/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import java.sql.*;
import javax.swing.*;


/**
 *
 * @author Anetha
 */
public class Mysql {
    Connection conn = null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/timeline?zeroDateTimeBehavior=convertToNull","root","");
            System.out.println("Connected"); 
                  return conn;
        }
        catch(Exception e)
                {
 JOptionPane.showMessageDialog(null,e.getMessage());
 return null;
    }
    
}
}
