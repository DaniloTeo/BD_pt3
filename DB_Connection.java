
package bd_test;

import java.sql.*;


public class DB_Connection {
    public static  Connection connect(){
    Connection c = null;
    try{
        System.out.println("iniciando conexao");
        Class.forName("oracle.jdbc.driver.OracleDriver");
        c = DriverManager.getConnection(
                    "jdbc:oracle:thin:@grad.icmc.usp.br:15215:orcl",
                    "R9278132",
                    "1414027141");
               
    } catch(ClassNotFoundException | SQLException e){
        e.printStackTrace();
        System.out.println("Erro ao abrir a conexão");
    }
      
    System.out.println("CONEXAO COMPLETA");
    return c;
    }  
}
