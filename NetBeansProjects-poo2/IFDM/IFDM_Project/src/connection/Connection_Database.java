package connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection_Database {
    
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/ifdmdb_project";
    private static String usuario = "root";
    private static String senha = "senha";
    
    public static Connection getConnection(){
        
        try{
            
            Class.forName(driver);
            
            return DriverManager.getConnection(url, usuario, senha);
            
        }catch(Exception ex){
            
            throw new RuntimeException("Erro na conexão: ", ex);
            
        }
        
    }
    
    public static void closeConnection(Connection con){
        
        try {
            if(con != null){
                con.close();
            }
        } catch (Exception ex) {

            ex.printStackTrace();

        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        closeConnection(con);
        
        try {
            if(stmt != null){
                stmt.close();
            }
        } catch (Exception ex) {

            ex.printStackTrace();

        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(con, stmt);
        
        try {
            if(rs != null){
                rs.close();
            }
        } catch (Exception ex) {

            ex.printStackTrace();

        }
        
    }
    
}
