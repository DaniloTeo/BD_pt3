
package bd_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author danilo
 */
public class DB_Connection {
    public static  Connection connect(){
        Connection c = null;
        try{
        
            System.out.println("iniciando conexao");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c = DriverManager.getConnection(
                        "jdbc:oracle:thin:@grad.icmc.usp.br:15215:orcl",
                        "D9293626",
                        "D9293626");
            
            
        } catch(Exception e){
            System.out.println("Não conseguiu se conectar...");
            System.out.println(e.getMessage());
        }
        
        System.out.println("CONEXAO COMPLETA");
        return c;
    }
    public static void select(Statement stmt, Connection c){
        ResultSet rs;
        
        try{
        
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM DIRETOR");
                while (rs.next()) {
                    System.out.println(rs.getString("TIME") + "-"
                            + rs.getString("NOME")                        
                            );
                }
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("Deu ruim no SELECT");
            System.out.println(e.getMessage());
        }
    }
    
    
    
}
