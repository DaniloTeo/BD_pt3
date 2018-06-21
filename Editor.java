package bd_test;




import java.sql.*;

/*
Nenhuma das funções oferece suporte a mudanca dos valores de chaves estrangeiras. Caso isso seja o desejado
o usuario deve deletar a tupla existente e criar uma nova.

*/

public class Editor {
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private static PreparedStatement pstmt;
    
    /**
     * Metodo para edicao de uma tupla da tabela Escola
     * @param nome: nome da Escola a ser editada - pk
     * @param telN: telefone atualizado
     * @param emailN: email atualizado
     * @param telComN: telefone da comissao atualizado
     * @param emailComN: email da comissao atualizado
     */
    public static void EditEscola(String nome,String telN, String emailN, String telComN, String emailComN){
        //estabelece conexao com o banco de dados
        if(telN == null || telComN == null){
            System.out.println("Numeros de Telefone nao podem ser nulos. Tente novamnete");
            return;
        }
        
        conn = DB_Connection.connect();
        
        try{
            //Query a ser executada com lacunas
            String edit = "UPDATE ESCOLA SET TELEFONE = ?, EMAIL = ?, TELEFONE_COMISSAO = ?, EMAIL_COMISSAO = ? "
                    + "WHERE NOME = ?";             
            pstmt = conn.prepareStatement(edit);
            //preenchimento das lacunas
            pstmt.setString(1, telN);
            pstmt.setString(2, emailN);
            pstmt.setString(3, telComN);
            pstmt.setString(4, emailComN);
            pstmt.setString(5, nome);
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
   
    /**
     * Metodo para editar uma tupla da tabela Atracao Extra
     * @param cnpj: CNPJ da empresa que gerencia a atracao extra - pk
     * @param nome: nome atualizado da atracao extra
     * @param tel: telefone atualizado para contato da empresa
     * @param email: email atualizado para contato da empresa
     * @param descricao: descricao atualizada da atracao extra
     */
    public static void EditAtracaoExtra(String cnpj,String nome, String tel, String email, String descricao){
        
        if(nome == null || tel == null){
            System.out.println("O nome e o telefone nao podem ser nulos. Tente novamente");
            return;
        }
        
        conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE ATRACAO_EXTRA SET NOME = ?, TELEFONE = ?, EMAIL = ?, DESCRICAO = ? "
                    + "WHERE CNPJ = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, nome);
            pstmt.setString(2, tel);
            pstmt.setString(3, email);
            pstmt.setString(4, descricao);
            pstmt.setString(5, cnpj);
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
      * Metodo para editar o nome de uma Banda da tabela Banda
      * @param cpf: cpf do lider da banda - pk
      * @param nome: nome atualizado da banda
      */
     public static void EditNomeBanda(String cpf,String nome){
        conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE BANDA SET NOME = ? "
                    + "WHERE CPF_LIDER = ?";             
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, nome);
            pstmt.setString(2, cpf);
            
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
      * Metodo para editar uma tupla da tabela Fotografia
      * @param cnpj: cnpj da empresa de fotografia - pk
      * @param nfotografos: numero atualizado de fotografos na equipe
      * @param nome_equipe: nome atualizado da equipe
      * @param tipo: tipo de trabalho (ensaio ou cobertura) atualizado
      */
     public static void EditFotografia(String cnpj, int nfotografos, String nome_equipe, String tipo){
        if(nome_equipe == null || tipo == null || (tipo.toUpperCase() != "COBERTURA" && tipo.toUpperCase() != "ENSAIO")){
            System.out.println("O nome da equipe nao pode ser nulo e o tipo deve ser ou 'cobertura' ou 'ensaio'.");
            System.out.println("Tente novamente.");
            return;
        }
         
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE FOTOGRAFIA SET NRO_FOTOGRAFOS = ?, NOME_EQUIPE = ?, TIPO = ? "
                    + "WHERE CNPJ = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setInt(1, nfotografos);
            pstmt.setString(2, nome_equipe);
            pstmt.setString(3, tipo);
            pstmt.setString(4, cnpj);
            
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
      * Metodo para editar uma tupla da tabela Casa Festas
      * @param cep: cep da casa de festas a ser editada - pk
      * @param nro: nro da casa de festas a ser editada - pk
      * @param nome: nome atualizado da casa de festas
      * @param complemento: complemento atualizado do endereco
      * @param bairro: bairro atualizado da casa de festas
      * @param lotacao: lotacao atualizada da casa de festas
      */
     public static void EditCasaFestas(String cep, int nro, String nome,String complemento, String bairro, int lotacao){
        if(nome == null){
            System.out.println("O nome da Casa de Festas nao pode ser nulo.");
            System.out.println("Tente novamente.");
            return;
        }
         
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE CASA_FESTAS SET NOME = ?, COMPLEMENTO = ?, BAIRRO = ?, LOTACAO = ? "
                    + "WHERE CEP = ? AND NRO = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, nome);
            pstmt.setString(2, complemento);
            pstmt.setString(3, bairro);
            pstmt.setInt(4, lotacao);
            pstmt.setString(5, cep);
            pstmt.setInt(6, nro);
            
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
      * Metodo para editar uma tupla da tabela Decoradora
      * @param cnpj: cnpj da decoradora a ser editada - pk
      * @param nome: nome atualizado da decoradora
      * @param descricao: descricao atualizada da decoradora
      */
      public static void EditDecoradora(String cnpj, String nome, String descricao){
        if(nome == null){
            System.out.println("O nome da Decoradora nao pode ser nulo.");
            System.out.println("Tente novamente.");
            return;
        }
         
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE DECORADORA SET NOME = ?, DESCRICAO = ? "
                    + "WHERE CNPJ = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, nome);
            pstmt.setString(2, descricao);
            pstmt.setString(3, cnpj);

            
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
       * Metodo para editar algum numero de telefone das bandas. Unicidade do atributo multivalorado e garantido por
       * condicoes de mundo real.
       * @param banda: cpf do lider da banda
       * @param telAntigo: numero antigo de telefone
       * @param telNovo: numero atualizado de telefone
       */
      public static void EditTelefonesBanda(String banda, String telAntigo, String telNovo){
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE TELEFONES_BANDA SET TELEFONE = ? "
                    + "WHERE BANDA = ? AND TELEFONE = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, telNovo);
            pstmt.setString(2, banda);
            pstmt.setString(3, telAntigo);

            
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
       * Metodo para editar algum email das bandas. Unicidade do atributo multivalorado e garantido por
       * condicoes de mundo real.
       * @param banda: cpf do lider da banda
       * @param emailAntigo: email antigo de telefone
       * @param emailNovo: email atualizado de telefone
       */
      public static void EditEmailsBanda(String banda, String emailAntigo, String emailNovo){
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE EMAILS_BANDA SET EMAIL = ? "
                    + "WHERE BANDA = ? AND EMAIL = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, emailNovo);
            pstmt.setString(2, banda);
            pstmt.setString(3, emailAntigo);

            
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
       * Metodo para editar algum membro das bandas. Unicidade do atributo multivalorado e garantido por
       * condicoes de mundo real.
       * @param banda: cpf do lider da banda
       * @param nomeAntigo: nome antigo de telefone
       * @param nomeNovo: nome atualizado de telefone
       */
      public static void EditIntegrantesBanda(String banda, String nomeAntigo, String nomeNovo){
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE INTEGRANTES_BANDA SET NOME_INTEGRANTE = ? "
                    + "WHERE BANDA = ? AND NOME_INTEGRANTE = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, nomeNovo);
            pstmt.setString(2, banda);
            pstmt.setString(3, nomeAntigo);

            
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
       * Metodo para editar algum estilo das bandas. Unicidade do atributo multivalorado e garantido por
       * condicoes de mundo real.
       * @param banda: cpf do lider da banda
       * @param nomeAntigo: estilo antigo de telefone
       * @param nomeNovo: estilo atualizado de telefone
       */
      public static void EditEstilosBanda(String banda, String estiloAntigo, String estiloNovo){
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE ESTILOS_BANDA SET ESTILO = ? "
                    + "WHERE BANDA = ? AND ESTILO = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, estiloNovo);
            pstmt.setString(2, banda);
            pstmt.setString(3, estiloAntigo);

            
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
       * Metodo para editar algum email das empresas de fotografia. Unicidade do atributo multivalorado e garantido por
       * condicoes de mundo real.
       * @param fotografia: cnpj da empresa de fotografia
       * @param emailAntigo: email antigo de telefone
       * @param emailNovo: email atualizado de telefone
       */
      public static void EditEmailsFotografia(String fotografia, String emailAntigo, String emailNovo){
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE EMAILS_FOTOGRAFIA  SET EMAIL = ? "
                    + "WHERE FOTGRF = ? AND EMAIL = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, emailNovo);
            pstmt.setString(2, fotografia);
            pstmt.setString(3, emailAntigo);

            
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
       * Metodo para editar algum telefone das empresas de fotografia. Unicidade do atributo multivalorado e garantido por
       * condicoes de mundo real.
       * @param fotografia: cnpj da empresa de fotografia
       * @param emailAntigo: telefone antigo de telefone
       * @param emailNovo: telefone atualizado de telefone
       */
      public static void EditTelefonesFotografia(String fotografia, String telAntigo, String telNovo){
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE TELEFONES_FOTOGRAFIA  SET TELEFONE = ? "
                    + "WHERE FOTGRF = ? AND TELEFONE = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, telNovo);
            pstmt.setString(2, fotografia);
            pstmt.setString(3, telAntigo);

            
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
       * Metodo para editar algum email das decoradoras. Unicidade do atributo multivalorado e garantido por
       * condicoes de mundo real.
       * @param decoradora: cnpj da empresa de decoracao
       * @param emailAntigo: email antigo de telefone
       * @param emailNovo: email atualizado de telefone
       */
      public static void EditEmailsDecoradora(String decoradora, String emailAntigo, String emailNovo){
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE EMAILS_DECORADORA  SET EMAIL = ? "
                    + "WHERE DEC = ? AND EMAIL = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, emailNovo);
            pstmt.setString(2, decoradora);
            pstmt.setString(3, emailAntigo);

            
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
       * Metodo para editar algum telefone das decoradoras. Unicidade do atributo multivalorado e garantido por
       * condicoes de mundo real.
       * @param decoradora: cnpj da empresa de decoracao
       * @param emailAntigo: telefone antigo de telefone
       * @param emailNovo: telefone atualizado de telefone
       */
      public static void EditTelefonesDecoradora(String decoradora, String telAntigo, String telNovo){
         
         conn = DB_Connection.connect();
        
        try{
            String edit = "UPDATE TELEFONES_DECORADORA  SET TELEFONE = ? "
                    + "WHERE DEC = ? AND TELEFONE = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, telNovo);
            pstmt.setString(2, decoradora);
            pstmt.setString(3, telAntigo);

            
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
      
      
     public static void EditEvento(String data, String fotografia, int nro_casa_festas, String cep_casa_festas, String tipo ){
        if(tipo == null || (tipo.toUpperCase() != "CASAMENTO" && tipo.toUpperCase() != "FORMATURA")){
            System.out.println("O tipo do Evento nao pode ser nulo e os tipos de evento so podem ser 'casamento' ou 'formatura'.");
            System.out.println("Tente novamente.");
            return;
        }
        // os demais erros que podem originar da atribuicao de um valor nao definido na tabela mae de um atributo fk, 
        // sao tratados atraves da interface que nao oferece opcoes invalidas
         
         conn = DB_Connection.connect();
         
         
         
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            
            
            String edit = "UPDATE EVENTO SET FOTOGRAFIA = ?, NRO_CASA_FESTAS = ?, CEP_CASA_FESTAS = ? , TIPO = ? "
                    + "WHERE DATA = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, fotografia);
            pstmt.setInt(2, nro_casa_festas);
            pstmt.setString(3, cep_casa_festas);
            pstmt.setString(4, tipo);
            pstmt.setString(5, data);
            pstmt.setString(6, mask);

            
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
      * Metodo que edita uma tupla da tabela Formatura.
      * @param data: data da formatura
      * @param nome_escola: nome da escola cliente
      * @param nome_cerimonialista: nome do cerimonialista da missa de formatura
      * @param nro_convidados: numero de convidados para a formatura
      * @param data_colacao: data da colacao de grau
      */
    public static void EditFormatura(String data, String nome_escola, String nome_cerimonialista, int nro_convidados, String data_colacao){
        if(data_colacao == null || nome_escola == null){
            System.out.println("A data da Colacao de Grau e o Nome da Escola nao podem ser nulos.");
            System.out.println("Tente novamente.");
            return;
        }
        // os demais erros que podem originar da atribuicao de um valor nao definido na tabela mae de um atributo fk, 
        // sao tratados atraves da interface que nao oferece opcoes invalidas
         
         conn = DB_Connection.connect();
         
         
         
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            
            
            String edit = "UPDATE FORMATURA SET ESCOLA = ?, NOME_CERIMONIALISTA_MISSA = ?, NRO_CONVIDADOS = ?, DATA_COLACAO = TO_DATE(?,?)"
                    + "WHERE DATA = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, nome_escola);
            pstmt.setString(2, nome_cerimonialista);
            pstmt.setInt(3, nro_convidados);
            pstmt.setString(4, data_colacao);
            pstmt.setString(5, mask);
            pstmt.setString(6, data);
            pstmt.setString(7, mask);

            
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
     * Metodo para editar uma tupla da tabela BandaSeApresenta.
     * @param data: data da apresentacao
     * @param banda: cpf do lider da banda
     * @param hora_ini: horario de inicio da apresentacao
     * @param hora_fim: horario de fim da apresentacao
     */
    public static void EditBandaSeApresenta(String data, String banda, String hora_ini, String hora_fim){
        
        // os demais erros que podem originar da atribuicao de um valor nao definido na tabela mae de um atributo fk, 
        // sao tratados ATRAVES DA INTERFACE que nao oferece opcoes invalidas
         
         conn = DB_Connection.connect();
         
         
         
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            
            
            String edit = "UPDATE BANDA_SE_APRESENTA SET HORA_INI = TO_DATE(?, ?), HORA_FIM = TO_DATE(?, ?)"
                    + "WHERE DATA_EVENTO = TO_DATE(?, ?) AND BANDA = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, hora_ini);
            pstmt.setString(2, mask);
            pstmt.setString(3, hora_fim);
            pstmt.setString(4, mask);
            pstmt.setString(5, data);
            pstmt.setString(6, mask);
            pstmt.setString(7, banda);

            
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
     * Metodo para alterar uma tupla da tabela Decora.
     * @param data: data do evento
     * @param decoradora: cnpj da decoradora
     */
    public static void EditDecora(String data, String decoradora){
        if(decoradora == null){
            System.out.println("O CNPJ da decoradora nao pode ser nulo. Tente novamente.");
            return;
        }
        
        // os demais erros que podem originar da atribuicao de um valor nao definido na tabela mae de um atributo fk, 
        // sao tratados ATRAVES DA INTERFACE que nao oferece opcoes invalidas
         
         conn = DB_Connection.connect();
         
         
         
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            
            
            String edit = "UPDATE DECORA SET DECORADORA = ? "
                    + "WHERE DATA_EVENTO = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, decoradora);
            pstmt.setString(2, data);
            pstmt.setString(3, mask);
            

            
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
     * Metodo que gerencia atributo multivalorado de Atracoes Extra da Formatura
     * @param data: data da formatura
     * @param atr_extra: cnpj da empresa que oferece a atracao extra
     */
    public static void EditFormaturaTemAtrExtra(String data, String atr_extra){
        
        
        // os demais erros que podem originar da atribuicao de um valor nao definido na tabela mae de um atributo fk, 
        // sao tratados ATRAVES DA INTERFACE que nao oferece opcoes invalidas
         
         conn = DB_Connection.connect();
         
         
         
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            
            
            String edit = "UPDATE FORMATURA_TEM_ATREXTRA SET ATREXTRA = ? "
                    + "WHERE DATA_FORMATURA = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, atr_extra);
            pstmt.setString(2, data);
            pstmt.setString(3, mask);
            

            
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
     * Metodo que altera o numero de telefone de um paraninfo.
     * @param nome: nome do paraninfo - pk
     * @param tel: telefone atualizado do paraninfo
     */
    public static void EditTelefoneParaninfo(String nome, String tel){
        if(tel == null){
            System.out.println("O telefone do paraninfo nao pode ser nulo. Tente novamente.");
            return;
        }
        
        // os demais erros que podem originar da atribuicao de um valor nao definido na tabela mae de um atributo fk, 
        // sao tratados ATRAVES DA INTERFACE que nao oferece opcoes invalidas
         
         conn = DB_Connection.connect();
         
        
        try{
            
            
            
            
            String edit = "UPDATE PARANINFO SET TELEFONE = ? "
                    + "WHERE NOME = ?";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, tel);
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
     * Metodo que gerencia atributo multivalorado de Paraninfo da Formatura
     * @param data_formatura: data da formatura
     * @param paraninfo: nome do paraninfo
     */
    public static void EditParaninfoFormatura(String paraninfo, String data_formatura){
        
        
        // os demais erros que podem originar da atribuicao de um valor nao definido na tabela mae de um atributo fk, 
        // sao tratados ATRAVES DA INTERFACE que nao oferece opcoes invalidas
         
         conn = DB_Connection.connect();
         
         
         
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
            
            
            
            
            String edit = "UPDATE PARANINFO_FORMATURA SET PARANINFO = ? "
                    + "WHERE DATA_FORMATURA = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, paraninfo);
            pstmt.setString(2, data_formatura);
            pstmt.setString(3, mask);
           
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
     * Metodo que gerencia atributo multivalorado de Formandos da Formatura
     * @param data_formatura: data da formatura
     * @param nome: nome do formando
     */
    public static void EditListaFormandos(String data_formatura, String nome){
        
        
        // os demais erros que podem originar da atribuicao de um valor nao definido na tabela mae de um atributo fk, 
        // sao tratados ATRAVES DA INTERFACE que nao oferece opcoes invalidas
         
         conn = DB_Connection.connect();
         
         
        String mask = "DD/MM/YYYY HH24:MI:SS";
        try{
     
            
            String edit = "UPDATE LISTA_FORMANDOS  SET NOME_FORMANDO = ? "
                    + "WHERE DATA_FORMATURA = TO_DATE(?, ?)";             
            
            pstmt = conn.prepareStatement(edit);
            pstmt.setString(1, nome);
            pstmt.setString(2, data_formatura);
            pstmt.setString(3, mask);
           
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
    
    
    public static void main(String[] args) {
       
        
        
        
       //EditTelefoneParaninfo("PARANINFO1", "32466789");
       //EditParaninfoFormatura("PARANINFO3", "5/2/2017 18:00:00");
       //EditListaFormandos("5/2/2017 18:00:00", "FORMANDO2");
       

    }
}   
        
