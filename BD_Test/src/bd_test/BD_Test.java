package bd_test;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BD_Test {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Statement stmt = null;
        Connection con = null;
        
        int etapa = 0;
        
        try {
            /*CONEXÃO*/
            con = DB_Connection.connect();
            

            /*SELEÇÃO*/
            if(con != null) DB_Connection.select(stmt, con);
            
            /*INSERCAO*/
           /* String insert = "INSERT INTO DIRETOR VALUES('UBERABA', 'JOSE')";
            System.out.println(insert);
            pstmt = connection.prepareStatement(insert);
            try{
                pstmt.executeUpdate();
                System.out.println("DADOS INSERIDOS!!!!!!");
            }catch(SQLException e){
                System.out.println("Xiii, deu ruim");
                System.out.println(e.getMessage());
            }*/
            
            /*DELECAO*/
            /*String del = "DELETE FROM DIRETOR WHERE TIME = 'UBERABA'";
            System.out.println(del);
            pstmt = connection.prepareStatement(del);
            try{
                pstmt.executeUpdate();
                System.out.println("DADOS REMOVIDOS!!!!!!");
            }catch(SQLException e){
                System.out.println("Xiii, deu ruim");
                System.out.println(e.getMessage());
            }*/
            
            
            
            stmt.close();
            con.close();
            
            
        } catch(Exception e){
            System.out.println(etapa + " " + e.getMessage());
        }
        
    }
}   
        
