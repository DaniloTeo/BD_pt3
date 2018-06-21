
package bd_test;

import java.sql.*;



public class Deletion {
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static PreparedStatement pstmt;
 
    
 /**
  * Metodo para deletar apenas uma linha da tabela ListaFormandos
  * @param data_formatura: data da formatura
  * @param nome: nome do formando a ser deletado
  */   
 public static void DeleteListaFormandos(String data_formatura, String nome){
        
         conn = DB_Connection.connect();
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
     
            
            String delete = "DELETE FROM LISTA_FORMANDOS "
                    + "WHERE DATA_FORMATURA = TO_DATE(?, ?) AND NOME_FORMANDO = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, data_formatura);
            pstmt.setString(2, mask);
            pstmt.setString(3, nome);
            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    } 
    /**
     * Metodo para apagar apenas uma linha da tabela ParaninfoForamtura.
     * @param paraninfo: nome do paraninfo a ser deletado
     * @param data_formatura: data da formatura da qual o paraninfo sera deletado
     */
    public static void DeleteParaninfoFormatura(String paraninfo, String data_formatura){
        
        
        
         
         conn = DB_Connection.connect();
         
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            
            
            String delete = "DELETE FROM PARANINFO_FORMATURA "
                    + "WHERE DATA_FORMATURA = TO_DATE(?, ?) AND PARANINFO = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, data_formatura);
            pstmt.setString(2, mask);
            pstmt.setString(3, paraninfo);
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    } 
    
    /**
     * Metodo para deletar uma unica linha da tabela Paraninfo
     * @param nome: nome do paraninfo a ser deletado
     */
    public static void DeleteParaninfo(String nome){
        
         
         conn = DB_Connection.connect();
         
        
        try{
            
            
            
            
            String delete = "DELETE FROM PARANINFO "
                    + "WHERE NOME = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, nome);
    
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
               
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    } 
    
    /**
     * Metodo para deletar uma linha da tabela FormaturaTemAtrExtra
     * @param data: data da formatura
     * @param atr_extra: cnpj da atracao extra 
     */
    public static void DeleteFormaturaTemAtrExtra(String data, String atr_extra){
      
         
         conn = DB_Connection.connect();
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            String delete = "DELETE FROM FORMATURA_TEM_ATREXTRA "
                    + "WHERE DATA_FORMATURA = TO_DATE(?, ?) AND ATREXTRA = ?";             
            
            pstmt = conn.prepareStatement(delete);
         
            pstmt.setString(1, data);
            pstmt.setString(2, mask);
            pstmt.setString(3, atr_extra);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    } 
    
    /**
     * Metodo para deletar uma linha da tabela Decora.
     * @param data: data do evento a ser decorado 
     */
     public static void DeleteDecora(String data){
        
         
         conn = DB_Connection.connect();
         
        
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
           
            String delete = "DELETE FROM DECORA "
                    + "WHERE DATA_EVENTO = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, data);
            pstmt.setString(2, mask);
            

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    } 
     
     /**
      * Metodo para deletar uma linha da tabela BandaSeApresenta
      * @param data: data da apresentacao
      * @param banda: banda que se apresentaria/apresentou 
      */
     public static void DeleteBandaSeApresenta(String data, String banda){
        
         
         conn = DB_Connection.connect();
         
        
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            
            
            String delete = "DELETE FROM BANDA_SE_APRESENTA "
                    + "WHERE DATA_EVENTO = TO_DATE(?, ?) AND BANDA = ?";             
            
            pstmt = conn.prepareStatement(delete);
           
            pstmt.setString(1, data);
            pstmt.setString(2, mask);
            pstmt.setString(3, banda);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
               
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    } 
     
     /**
      * Metodo para deletar uma linha da tabela Formatura
      * @param data: data da formatura
      */
    public static void DeleteFormatura(String data){
        
         
         conn = DB_Connection.connect();
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            String delete = "DELETE FROM FORMATURA "
                    + "WHERE DATA = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, data);
            pstmt.setString(2, mask);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    } 
     
    /**
     * Metodo para deletar uma linha da tabela Evento
     * @param data: data do evento
     */
     public static void DeleteEvento(String data){
        
         conn = DB_Connection.connect();
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            String delete = "DELETE FROM EVENTO "
                    + "WHERE DATA = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(delete);
         
            pstmt.setString(1, data);
            pstmt.setString(2, mask);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    }
     /**
      * Metodo para deletar um unico telefone de uma certa decoradora
      * @param decoradora: cnpj da decoradora
      * @param tel: telefone a ser deletado
      */
     public static void DeleteTelefonesDecoradora(String decoradora, String tel){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM TELEFONES_DECORADORA "
                    + "WHERE DEC = ? AND TELEFONE = ?";             
            
            pstmt = conn.prepareStatement(delete);
           
            pstmt.setString(1, decoradora);
            pstmt.setString(2, tel);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
      }
     
     /**
      * Metodo para deletar um email de uma decoradora
      * @param decoradora: cnpj da decoradora
      * @param email: email a ser deletado
      */
     public static void DeleteEmailsDecoradora(String decoradora, String email){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM EMAILS_DECORADORA "
                    + "WHERE DEC = ? AND EMAIL = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, decoradora);
            pstmt.setString(2, email);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
      }
     
     /**
      * Metodo para deletar um telefone de uma empresa de fotografia
      * @param fotografia: cnpj da empresa
      * @param tel: telefone a ser deletado
      */
     public static void DeleteTelefonesFotografia(String fotografia, String tel){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM TELEFONES_FOTOGRAFIA "
                    + "WHERE FOTGRF = ? AND TELEFONE = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, fotografia);
            pstmt.setString(2, tel);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
      }
     
     /**
      * Metodo para deletar um email da empresa de fotografia
      * @param fotografia: cnpj da empresa
      * @param email: email a ser deletado
      */
     public static void DeleteEmailsFotografia(String fotografia, String email){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM EMAILS_FOTOGRAFIA "
                    + "WHERE FOTGRF = ? AND EMAIL = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, fotografia);
            pstmt.setString(2, email);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
      }
     
     /**
      * Metodo para deletar um estilo de uma banda
      * @param banda: cpf do lider da banda
      * @param estilo: estilo a ser deletado
      */
     public static void DeleteEstilosBanda(String banda, String estilo){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM ESTILOS_BANDA "
                    + "WHERE BANDA = ? AND ESTILO = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, banda);
            pstmt.setString(2, estilo);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
               
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
      }
     
     /**
      * Metodo para deletar um integrante de uma banda
      * @param banda: cpf do lider da banda
      * @param nome: nome do integrante a ser deletado
      */
     public static void DeleteIntegrantesBanda(String banda, String nome){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM INTEGRANTES_BANDA "
                    + "WHERE BANDA = ? AND NOME_INTEGRANTE = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, banda);
            pstmt.setString(2, nome);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
      }
     
     /**
      * Metodo para deletar um email de uma banda
      * @param banda: cpf do lider da banda
      * @param email: email a ser deletado
      */
     public static void DeleteEmailsBanda(String banda, String email){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM EMAILS_BANDA "
                    + "WHERE BANDA = ? AND EMAIL = ?";             
            
            pstmt = conn.prepareStatement(delete);
           
            pstmt.setString(1, banda);
            pstmt.setString(2, email);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
      }
     
     /**
      * Metodo para deletar o telefone de uma banda
      * @param banda: cpf do lider da banda
      * @param tel: telefone a ser deletado
      */
     public static void DeleteTelefonesBanda(String banda, String tel){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM TELEFONES_BANDA "
                    + "WHERE BANDA = ? AND TELEFONE = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, banda);
            pstmt.setString(2, tel);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
      }
     
        /**
         * Metodo para deletar uma linha da tabela Decoradora
         * @param cnpj: cnpj da decoradora
         */
        public static void DeleteDecoradora(String cnpj){
        
                
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM DECORADORA "
                    + "WHERE CNPJ = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, cnpj);

            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    }
     
     /**
      * Metodo para deletar uma linha da tabela CasaFestas
      * @param cep: cep da casa de festas
      * @param nro: numero da casa de festas
      */
     public static void DeleteCasaFestas(String cep, int nro){
       
         
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM CASA_FESTAS "
                    + "WHERE CEP = ? AND NRO = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, cep);
            pstmt.setInt(2, nro);
            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    }
     /**
      * Metodo para deletar uma linha da tabela Fotografia
      * @param cnpj: cnpj da empresa de fotografia
      */
    public static void DeleteFotografia(String cnpj){
         
         conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM FOTOGRAFIA "
                    + "WHERE CNPJ = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, cnpj);
            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    }
    
    /**
     * Metodo para deletar uma linha da tabela Banda
     * @param cpf: cpf do lider da banda
     */
    public static void DeleteBanda(String cpf){
        conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM BANDA "
                    + "WHERE CPF_LIDER = ?";             
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, cpf);
            
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    }
    
    /**
     * Metodo para deletar uma linha da tabela de AtracaoExtra
     * @param cnpj: cnpj da empresa que aluga a atracao 
     */
    public static void DeleteAtracaoExtra(String cnpj){
        
        
        
        conn = DB_Connection.connect();
        
        try{
            String delete = "DELETE FROM ATRACAO_EXTRA "
                    + "WHERE CNPJ = ?";             
            
            pstmt = conn.prepareStatement(delete);
            
            pstmt.setString(1, cnpj);
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    }
    
    /**
     * Metodo para deletar uma linha da tabela Escola
     * @param nome: nome da escola a ser deletada
     */
    public static void DeleteEscola(String nome){
       
        
        conn = DB_Connection.connect();
        
        try{
            //Query a ser executada com lacunas
            String delete = "DELETE FROM ESCOLA "
                    + "WHERE NOME = ?";             
            pstmt = conn.prepareStatement(delete);
            //preenchimento das lacunas
          
            pstmt.setString(1, nome);
            pstmt.executeUpdate();
            
            
        } catch(SQLException e){
            e.printStackTrace();
                    
        } finally{
            try{
                
                
                //encerramento do metodo
                pstmt.close();
                conn.close();
                System.out.println("CONEXAO ENCERRADA");
            } catch(SQLException ex){
                ex.printStackTrace();
            
            }
        
        }
        
       
    }
    
    
     
    public static void main(String[] args){
        //DeleteListaFormandos("1/2/2017 19:00:00", "FORMANDO2");
        //DeleteParaninfoFormatura("PARANINFO3", "1/2/2017 19:00:00");
        //DeleteParaninfo("PARANINFO3");
        //DeleteFormaturaTemAtrExtra("5/2/2017 18:00:00", "222222222222222222222222222222");
        //DeleteDecora("5/2/2017 18:00:00");
        //DeleteBandaSeApresenta("5/2/2017 18:00:00", "22222222222222222222");
        //DeleteFormatura("5/2/2017 18:00:00");
        //DeleteEvento("1/2/2017 20:00:00");
        //DeleteTelefonesDecoradora("111111111111111111111111111111", "TELEFONE4");
        //DeleteEmailsDecoradora("222222222222222222222222222222", "DECORADORA2@EMAIL.COM");
        //DeleteTelefonesFotografia("111111111111111111111111111111", "TELEFONE4");
        //DeleteEmailsFotografia("111111111111111111111111111111", "FOTGRF4@EMAIL.COM");
        //DeleteEstilosBanda("22222222222222222222", "ESTILO1");
        //DeleteIntegrantesBanda("33333333333333333333", "BANDA3_NOME1");
        //DeleteEmailsBanda("22222222222222222222", "BANDA4@EMAIL.COM");
        //DeleteTelefonesBanda("11111111111111111111", "TELEFONE4");
        //DeleteDecoradora("222222222222222222222222222222");
        //DeleteCasaFestas("2222222222", 2);
        //DeleteFotografia("222222222222222222222222222222");
        //DeleteBanda("22222222222222222222");
        //DeleteAtracaoExtra("222222222222222222222222222222");
        //DeleteEscola("ESCOLA2");
        
        
    }
            
            
}
