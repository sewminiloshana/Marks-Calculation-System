
package Login;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Loshana's PC
 */
public class JavaConnection {
    Connection conn=null;
    public static Connection ConnecrDb(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/marks_calculation_system","root","");
       // JOptionPane.showMessageDialog(null, "connection Establish");
        return conn;
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, e);
        return null;}
}
}
