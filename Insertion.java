
package bd_test;

import java.sql.*;


public class Insertion {
    private static Connection conn;
    private static PreparedStatement pstmt;
    
    public static void InsertEscola (String nome, String telefone, String email, String telefoneComissao, String emailComissao) throws SQLException
    {
        if (telefone == null)
        {
            System.out.println ("Telefone da escola deve ser nao nulo. Tente novamente.");
            return;
        }
        if(telefoneComissao == null)
        {
            System.out.println ("Telefone da comissao deve ser nao nulo. Tente novamente.");
            return;
        }
        
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO ESCOLA (NOME, TELEFONE, EMAIL, TELEFONE_COMISSAO, EMAIL_COMISSAO)"
                    + " VALUES (?, ?, ?, ?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, nome);
                pstmt.setString (2, telefone);
                pstmt.setString (3, email);
                pstmt.setString (4, telefoneComissao);
                pstmt.setString (5, emailComissao);
                pstmt.executeUpdate ();
            }
            
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
 
    public static void InsertAtracaoExtra (String cnpj, String nome, String telefone, String email, String descricao) throws SQLException
    {
       if (nome == null)
        {
            System.out.println ("Nome da atracao extra deve ser nao nulo. Tente novamente.");
            return;
        }
       if (telefone == null)
       {
           System.out.println ("Telefone da atracao extra deve ser nao nulo. Tente novamente.");
           return;
       }
        
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO ATRACAO_EXTRA (CNPJ, NOME, TELEFONE, EMAIL, DESCRICAO)"
                    + " VALUES (?, ?, ?, ?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, cnpj);
                pstmt.setString (2, nome);
                pstmt.setString (3, telefone);
                pstmt.setString (4, email);
                pstmt.setString (5, descricao);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertBanda (String cpfLider, String nome) throws SQLException
    {
       if (nome == null)
        {
            System.out.println ("Nome da banda deve ser não nulo. Tente novamente.");
            return;
        }
        
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO BANDA (CPF_LIDER, NOME)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, cpfLider);
                pstmt.setString (2, nome);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertFotografia (String cnpj, int nroFotografos, String nomeEquipe, String tipo) throws SQLException
    {
       if (nomeEquipe == null)
        {
            System.out.println ("Nome da equipe deve ser nao nulo. Tente novamente.");
            return;
        }
        if (tipo == null)
        {
            System.out.println ("Tipo de fotografia da equipe deve ser nao nulo. Tente novamente");
            return;
        }
        
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO FOTOGRAFIA (CNPJ, NRO_FOTOGRAFOS, NOME_EQUIPE, TIPO)"
                    + " VALUES (?, ?, ?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, cnpj);
                pstmt.setInt (2, nroFotografos);
                pstmt.setString (3, nomeEquipe);
                pstmt.setString (4, tipo);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
  
    public static void InsertCasaFestas (String cep, int nro, String nome, String rua, String complemento, String bairro, String cidade, int lotacao) throws SQLException
    {
       if (nome == null)
        {
            System.out.println ("Nome da casa de festas deve ser não nulo. Tente novamente.");
            return;
        }
        
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO CASA_FESTAS (CEP, NRO, NOME, RUA, COMPLEMENTO, BAIRRO, CIDADE, LOTACAO)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, cep);
                pstmt.setInt (2, nro);
                pstmt.setString (3, nome);
                pstmt.setString (4, rua);
                pstmt.setString (5, complemento);
                pstmt.setString (6, bairro);
                pstmt.setString (7, cidade);
                pstmt.setInt (8, lotacao);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertDecoradora (String cnpj, String nome, String descricao) throws SQLException
    {       
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO DECORADORA (CNPJ, NOME, DESCRICAO)"
                    + " VALUES (?, ?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, cnpj);
                pstmt.setString (2, nome);
                pstmt.setString (3, descricao);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertTelefonesBanda (String banda, String telefone) throws SQLException
    {
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO TELEFONES_BANDA (BANDA, TELEFONE)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, banda);
                pstmt.setString (2, telefone);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertEmailsBanda (String banda, String email) throws SQLException
    {
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO EMAILS_BANDA (BANDA, EMAIL)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, banda);
                pstmt.setString (2, email);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertIntegrantesBanda (String banda, String nomeIntegrante) throws SQLException
    {
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO INTEGRANTES_BANDA (BANDA, NOME_INTEGRANTE)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, banda);
                pstmt.setString (2, nomeIntegrante);
                pstmt.executeUpdate ();
            } 
        }
        catch(SQLException e)
        {                  
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertEstilosBanda (String banda, String estilo) throws SQLException
    {
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO ESTILOS_BANDA (BANDA, ESTILO)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, banda);
                pstmt.setString (2, estilo);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertEmailsFotografia (String fotgrf, String email) throws SQLException
    {
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO EMAILS_FOTOGRAFIA (FOTGRF, EMAIL)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, fotgrf);
                pstmt.setString (2, email);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertTelefonesFotografia (String fotgrf, String telefone) throws SQLException
    {
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO TELEFONES_FOTOGRAFIA (FOTGRF, TELEFONE)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, fotgrf);
                pstmt.setString (2, telefone);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertEmailsDecoradora (String dec, String email) throws SQLException
    {
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO EMAILS_DECORADORA (DEC, EMAIL)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, dec);
                pstmt.setString (2, email);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertTelefonesDecoradora (String dec, String telefone) throws SQLException
    {
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO TELEFONES_DECORADORA (DEC, TELEFONE)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, dec);
                pstmt.setString (2, telefone);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertEvento (String data, String fotografia, int nroCasaFestas, String cepCasaFestas, String tipo) throws SQLException
    {
       if (tipo == null)
        {
            System.out.println ("Tipo do evento deve ser nao nulo. Tente novamente.");
            return;
        }
        
        conn = DB_Connection.connect ();
        String mask = "DD/MM/YYYY HH24:MI:SS";
        
        try
        {
            String query = "INSERT INTO EVENTO (DATA, FOTOGRAFIA, NRO_CASA_FESTAS, CEP_CASA_FESTAS, TIPO)"
                    + " VALUES (TO_DATE(?, ?), ?, ?, ?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, data);
                pstmt.setString (2, mask);
                pstmt.setString (3, fotografia);
                pstmt.setInt (4, nroCasaFestas);
                pstmt.setString (5, cepCasaFestas);
                pstmt.setString (6, tipo);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertFormatura (String data, String escola, String nomeCerimonialistaMissa, int nroConvidados, String dataColacao) throws SQLException
    {
       if (escola == null)
        {
            System.out.println ("Nome da escola deve ser não nulos. Tente novamente.");
            return;
        }
        if (dataColacao == null)
        {
            System.out.println ("Data da colacao deve ser nao nulo. Tente novamente");
            return;
        }
        conn = DB_Connection.connect ();
        String mask = "DD/MM/YYYY HH24:MI:SS";
        
        try
        {
            String query = "INSERT INTO FORMATURA (DATA, ESCOLA, NOME_CERIMONIALISTA_MISSA, NRO_CONVIDADOS, DATA_COLACAO)"
                    + " VALUES (TO_DATE(?, ?), ?, ?, ?, TO_DATE(?, ?))";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, data);
                pstmt.setString (2, mask);
                pstmt.setString (3, escola);
                pstmt.setString (4, nomeCerimonialistaMissa);
                pstmt.setInt (5, nroConvidados);
                pstmt.setString (6, dataColacao);
                pstmt.setString (7, mask);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertBandaSeApresenta (String dataEvento, String banda, String horaIni, String horaFim) throws SQLException
    {
        conn = DB_Connection.connect ();
        String mask = "DD/MM/YYYY HH24:MI:SS";
        
        try
        {
            String query = "INSERT INTO BANDA_SE_APRESENTA (DATA_EVENTO, BANDA, HORA_INI, HORA_FIM)"
                    + " VALUES (TO_DATE(?, ?), ?, TO_DATE(?, ?), TO_DATE(?, ?))";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, dataEvento);
                pstmt.setString (2, mask);
                pstmt.setString (3, banda);
                pstmt.setString (4, horaIni);
                pstmt.setString (5, mask);
                pstmt.setString (6, horaFim);
                pstmt.setString (7, mask);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertDecora (String dataEvento, String decoradora) throws SQLException
    {
       if (decoradora == null)
        {
            System.out.println ("Decoradoa deve ser nao nulo. Tente novamente.");
            return;
        }
        
        conn = DB_Connection.connect ();
        String mask = "DD/MM/YYYY HH24:MI:SS";
        
        try
        {
            String query = "INSERT INTO DECORA (DATA_EVENTO, DECORADORA)"
                    + " VALUES (TO_DATE(?, ?), ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, dataEvento);
                pstmt.setString (2, mask);
                pstmt.setString (3, decoradora);
                pstmt.executeUpdate ();
            } 
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertFormaturaTemAtrExtra (String atrExtra, String dataFormatura) throws SQLException
    {
        conn = DB_Connection.connect ();
        String mask = "DD/MM/YYYY HH24:MI:SS";
        
        try
        {
            String query = "INSERT INTO FORMATURA_TEM_ATREXTRA (ATREXTRA, DATA_FORMATURA)"
                    + " VALUES (?, TO_DATE(?, ?))";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, atrExtra);
                pstmt.setString (2, dataFormatura);
                pstmt.setString (3, mask);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertParaninfo (String nome, String telefone) throws SQLException
    {
       if (telefone == null)
        {
            System.out.println ("Telefone do paraninfo deve ser nao nulo. Tente novamente.");
            return;
        }
        
        conn = DB_Connection.connect ();
        
        try
        {
            String query = "INSERT INTO PARANINFO (NOME, TELEFONE)"
                    + " VALUES (?, ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, nome);
                pstmt.setString (2, telefone);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertParaninfoFormatura (String paraninfo, String dataFormatura) throws SQLException
    {
        conn = DB_Connection.connect ();
        String mask = "DD/MM/YYYY HH24:MI:SS";
        
        try
        {
            String query = "INSERT INTO PARANINFO_FORMATURA (PARANINFO, DATA_FORMATURA)"
                    + " VALUES (?, TO_DATE(?, ?))";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, paraninfo);
                pstmt.setString (2, dataFormatura);
                pstmt.setString (3, mask);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void InsertListaFormandos (String dataFormatura, String nomeFormando) throws SQLException
    {
        conn = DB_Connection.connect ();
        String mask = "DD/MM/YYYY HH24:MI:SS";
        
        try
        {
            String query = "INSERT INTO LISTA_FORMANDOS (DATA_FORMATURA, NOME_FORMANDO)"
                    + " VALUES (TO_DATE(?, ?), ?)";

            pstmt = conn.prepareStatement (query);
            
            for (int i = 0; i < 1; i++)
            {
                pstmt.setString (1, dataFormatura);
                pstmt.setString (2, mask);
                pstmt.setString (3, nomeFormando);
                pstmt.executeUpdate ();
            }
        }
        catch(SQLException e)
        {                 
            e.printStackTrace();
        }
        
        pstmt.close ();
        conn.close ();
        System.out.println ("CONEXAO ENCERRADA.");
    }
    
    public static void main (String[] args) throws SQLException
    {
    /*InsertEscola ("ESCOLA6", "66666666666666666666", "ESCOLA6@EMAIL.COM", "66666666666666666666", "COMISSAO6@EMAIL.COM");
    InsertAtracaoExtra ("666666666666666666666666666666", "ATRACAO_EXTRA6", "66666666666666666666", "ATRACAO6@EMAIL.COM", "DESCRICAO6");
    InsertBanda ("66666666666666666666", "BANDA6");
    InsertFotografia ("666666666666666666666666666666", 6, "EQUIPE6", "COBERTURA");
    InsertCasaFestas ("6666666666", 6, "CASA_FESTAS6", "RUA6", "COMPLEMENTO6", "BAIRRO6", "CIDADE6", 6);
    InsertDecoradora ("666666666666666666666666666666", "DECORADORA6", "DESCRICAO6");
    InsertTelefonesBanda ("66666666666666666666", "TELEFONE6");
    InsertEmailsBanda ("66666666666666666666", "BANDA6@EMAIL.COM");
    InsertIntegrantesBanda ("66666666666666666666", "BANDA6_NOME1");
    InsertEstilosBanda ("66666666666666666666", "ESTILO6");
    InsertEmailsFotografia ("666666666666666666666666666666", "FOTGRF6@EMAIL.COM");
    InsertTelefonesFotografia ("666666666666666666666666666666", "TELEFONE6");
    InsertEmailsDecoradora ("666666666666666666666666666666", "DECORADORA6@EMAIL.COM");
    InsertTelefonesDecoradora ("666666666666666666666666666666", "TELEFONE6");*/
    InsertEvento ("6/6/6666 21:00:00", "666666666666666666666666666666", 6, "6666666666", "FORMATURA");
    InsertFormatura ("6/6/6666 21:00:00", "ESCOLA6", "CERIMONIALISTA6", 6, "6/6/6666 21:00:00");
    InsertBandaSeApresenta ("6/6/6666 21:00:00", "66666666666666666666", "6/6/6666 22:00:00", "6/6/6666 23:00:00");
    InsertDecora ("6/6/6666 21:00:00", "666666666666666666666666666666");
    InsertFormaturaTemAtrExtra ("666666666666666666666666666666", "6/6/6666 21:00:00");
    //InsertParaninfo ("PARANINFO6", "66666666666666666666");
    InsertParaninfoFormatura ("PARANINFO6", "6/6/6666 21:00:00");
    InsertListaFormandos ("6/6/6666 21:00:00", "FORMANDO6");
    }
}
