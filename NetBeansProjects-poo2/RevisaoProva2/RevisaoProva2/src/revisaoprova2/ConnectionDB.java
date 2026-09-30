package revisaoprova2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectionDB {
    
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/prova2";
    private static String user = "root";
    private static String password = "";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
            try {
                
                if(con != null){
                    con.close();
                }
                
                if(stmt != null){
                    stmt.close();
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
            try {
                
                if(con != null){
                    con.close();
                }
                
                if(stmt != null){
                    stmt.close();
                }
                
                if(rs != null){
                    rs.close();
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }
    
}
