package bd_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectFunctions {
    
    /**
     *
     * @param stmt
     * @param c
     * @return 
     */
    public static ResultSet formaturaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM FORMATURA");
                while (rs.next()) {
                    System.out.println(rs.getString("DATA") + "-"
                            + rs.getString("ESCOLA") + "-"
                            + rs.getString("NOME_CERIMONIALISTA_MISSA")+ "-"
                            + rs.getString("NRO_CONVIDADOS") + "-"
                            + rs.getString("DATA_COLACAO")                         
                            );
                }
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet formaturaDataOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM FORMATURA ORDER BY DATA");
            }else{
                rs = stmt.executeQuery("SELECT * FROM FORMATURA ORDER BY DATA DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet formaturaEscolaOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM FORMATURA ORDER BY ESCOLA, DATA");
            }else{
                rs = stmt.executeQuery("SELECT * FROM FORMATURA ORDER BY ESCOLA DESC, DATA");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet atracaoExtraAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM ATRACAO_EXTRA");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet atracaoExtraNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM ATRACAO_EXTRA ORDER BY NOME");
            }else{
                rs = stmt.executeQuery("SELECT * FROM ATRACAO_EXTRA ORDER BY NOME DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet atracaoExtraCNPJOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM ATRACAO_EXTRA ORDER BY CNPJ");
            }else{
                rs = stmt.executeQuery("SELECT * FROM ATRACAO_EXTRA ORDER BY CNPJ DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet bandaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM BANDA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet bandaNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM BANDA ORDER BY NOME");
            }else{
                rs = stmt.executeQuery("SELECT * FROM BANDA ORDER BY NOME DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet bandaCPFLiderOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM BANDA ORDER BY CPF_LIDER");
            }else{
                rs = stmt.executeQuery("SELECT * FROM BANDA ORDER BY CPF_LIDER DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet bandaSeApresentaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM BANDA_SE_APRESENTA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet bandaSeApresentaOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM BANDA_SE_APRESENTA ORDER BY DATA_EVENTO, BANDA");
            }else{
                rs = stmt.executeQuery("SELECT * FROM BANDA_SE_APRESENTA ORDER BY DATA_EVENTO DESC, BANDA");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet casaFestasAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet casaFestasCEPOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS ORDER BY CEP");
            }else{
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS ORDER BY CEP DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet casaFestasNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS ORDER BY NOME");
            }else{
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS ORDER BY NOME DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet casaFestasCidadeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS ORDER BY CIDADE");
            }else{
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS ORDER BY CIDADE DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet casaFestasLotacaoOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS ORDER BY LOTACAO");
            }else{
                rs = stmt.executeQuery("SELECT * FROM CASA_FESTAS ORDER BY LOTACAO DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet casalAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM CASAL");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet casamentoAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM CASAMENTO");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet cerNReligiosaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM CER_N_RELIGIOSA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet cerReligiosaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM CER_RELIGIOSA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet convidadosMesaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM CONVIDADOS_MESA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet decoraAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM DECORA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet decoraOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM DECORA ORDER BY DATA_EVENTO");
            }else{
                rs = stmt.executeQuery("SELECT * FROM DECORA ORDER BY DATA_EVENTO DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
     
    public static ResultSet decoradoraAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM DECORADORA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet decoradoraCNPJOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM DECORADORA ORDER BY CNPJ");
            }else{
                rs = stmt.executeQuery("SELECT * FROM DECORADORA ORDER BY CNPJ DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet decoradoraNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM DECORADORA ORDER BY NOME");
            }else{
                rs = stmt.executeQuery("SELECT * FROM DECORADORA ORDER BY NOME DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet emailsBandaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM EMAILS_BANDA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet emailsBandaNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM EMAILS_BANDA ORDER BY NOME");
            }else{
                rs = stmt.executeQuery("SELECT * FROM EMAILS_BANDA ORDER BY NOME DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet emailsBandaEmailOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM EMAILS_BANDA ORDER BY EMAIL");
            }else{
                rs = stmt.executeQuery("SELECT * FROM EMAILS_BANDA ORDER BY EMAIL DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet emailsDecoradoraAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM EMAILS_DECORADORA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
     public static ResultSet emailsDecoradoraOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM EMAILS_DECORADORA ORDER BY DEC, EMAIL");
            }else{
                rs = stmt.executeQuery("SELECT * FROM EMAILS_DECORADORA ORDER BY DEC DESC, EMAIL");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
     
    public static ResultSet emailsDecoradoraEmailOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM EMAILS_DECORADORA ORDER BY EMAIL, DEC");
            }else{
                rs = stmt.executeQuery("SELECT * FROM EMAILS_DECORADORA ORDER BY EMAIL DESC, DEC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet emailsFotografiaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM EMAILS_FOTOGRAFIA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet emailsFotografiaFotografiaOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM EMAILS_FOTOGRAFIA ORDER BY FOTGRF, EMAIL");
            }else{
                rs = stmt.executeQuery("SELECT * FROM EMAILS_FOTOGRAFIA ORDER BY FOTGRF DESC, EMAIL");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet emailsFotografiaEmailOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM EMAILS_FOTOGRAFIA ORDER BY EMAIL, FOTGRF");
            }else{
                rs = stmt.executeQuery("SELECT * FROM EMAILS_FOTOGRAFIA ORDER BY EMAIL DESC, FOTGRF");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet escolaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM ESCOLA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet escolaNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM ESCOLA ORDER BY NOME");
            }else{
                rs = stmt.executeQuery("SELECT * FROM ESCOLA ORDER BY NOME DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    
    public static ResultSet estilosBandaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM ESTILOS_BANDA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet estilosBandaNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM ESTILOS_BANDA ORDER BY BANDA, ESTILO");
            }else{
                rs = stmt.executeQuery("SELECT * FROM ESTILOS_BANDA ORDER BY BANDA DESC, ESTILO");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet estilosBandaEstiloOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM ESTILOS_BANDA ORDER BY ESTILO, BANDA");
            }else{
                rs = stmt.executeQuery("SELECT * FROM ESTILOS_BANDA ORDER BY ESTILO DESC, BANDA");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet eventoAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM EVENTO");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet eventoDataOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM EVENTO ORDER BY DATA");
            }else{
                rs = stmt.executeQuery("SELECT * FROM EVENTO ORDER BY DATA DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet formaturaTemAtrextraAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM FORMATURA_TEM_ATREXTRA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet formaturaTemAtrextraAtrOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM FORMATURA_TEM_ATREXTRA ORDER BY ATREXTRA, DATA_EVENTO");
            }else{
                rs = stmt.executeQuery("SELECT * FROM FORMATURA_TEM_ATREXTRA ORDER BY ATREXTRA DESC, DATA_EVENTO");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet formaturaTemAtrextraDataOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM FORMATURA_TEM_ATREXTRA ORDER BY DATA_EVENTO, ATREXTRA");
            }else{
                rs = stmt.executeQuery("SELECT * FROM FORMATURA_TEM_ATREXTRA ORDER BY DATA_EVENTO DESC, ATREXTRA");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet fotografiaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet fotografiaCNPJOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA ORDER BY CNPJ");
            }else{
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA ORDER BY CNPJ DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet fotografiaNumeroOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA ORDER BY NRO_FOTOGRAFOS");
            }else{
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA ORDER BY NRO_FOTOGRAFOS DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet fotografiaNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA ORDER BY NOME_EQUIPE");
            }else{
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA ORDER BY NOME_EQUIPE DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet fotografiaTipoOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA ORDER BY TIPO");
            }else{
                rs = stmt.executeQuery("SELECT * FROM FOTOGRAFIA ORDER BY TIPO DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet integrantesBandaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM INTEGRANTES_BANDA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet integrantesBandaOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM INTEGRANTES_BANDA ORDER BY BANDA, NOME_LIDER");
            }else{
                rs = stmt.executeQuery("SELECT * FROM INTEGRANTES_BANDA ORDER BY BANDA DESC, NOME_LIDER");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet integrantesBandaNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM INTEGRANTES_BANDA ORDER BY NOME_INTEGRANTE");
            }else{
                rs = stmt.executeQuery("SELECT * FROM INTEGRANTES_BANDA ORDER BY NOME_INTEGRANTE DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet listaFormandosAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM LISTA_FORMANDOS");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet listaFormandosDataOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM LISTA_FORMANDOS ORDER BY DATA_FORMATURA, NOME_FORMANDO");
            }else{
                rs = stmt.executeQuery("SELECT * FROM LISTA_FORMANDOS ORDER BY DATA_FORMATURA DESC, NOME_FORMANDO");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet listaFormandosNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM LISTA_FORMANDOS ORDER BY NOME_FORMANDO, DATA_FORMATURA");
            }else{
                rs = stmt.executeQuery("SELECT * FROM LISTA_FORMANDOS ORDER BY NOME_FORMANDO DESC, DATA_FORMATURA");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet mesaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM MESA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet paraninfoAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM PARANINFO");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet paraninfoNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM PARANINFO ORDER BY NOME, TELEFONE");
            }else{
                rs = stmt.executeQuery("SELECT * FROM PARANINFO ORDER BY NOME DESC, TELEFONE");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
     public static ResultSet paraninfoTelefoneOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM PARANINFO ORDER BY TELEFONE, NOME");
            }else{
                rs = stmt.executeQuery("SELECT * FROM PARANINFO ORDER BY TELEFONE DESC, NOME");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet paraninfoFormaturaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM PARANINFO_FORMATURA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet paraninfoFormaturaParaninfoOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM PARANINFO_FORMATURA ORDER BY PARANINFO, DATA_FORMATURA");
            }else{
                rs = stmt.executeQuery("SELECT * FROM PARANINFO_FORMATURA ORDER BY PARANINFO DESC, DATA_FORMATURA");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet paraninfoFormaturaDataOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM PARANINFO_FORMATURA ORDER BY DATA_FORMATURA, PARANINFO");
            }else{
                rs = stmt.executeQuery("SELECT * FROM PARANINFO_FORMATURA ORDER BY DATA_FORMATURA DESC, PARANINFO");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet presenteAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM PRESENTE");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet sites_presenteAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM SITES_PRESENTE");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet telefonesBandaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_BANDA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet telefonesBandaNomeOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_BANDA ORDER BY NOME");
            }else{
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_BANDA ORDER BY NOME DESC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet telefonesDecoradoraAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_DECORADORA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet telefonesDecoradoraOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_DECORADORA ORDER BY DEC, TELEFONE");
            }else{
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_DECORADORA ORDER BY DEC DESC, TELEFONE");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet telefonesDecoradoraTelefonesOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_DECORADORA ORDER BY TELEFONE, DEC");
            }else{
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_DECORADORA ORDER BY TELEFONE DESC, DEC");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet telefonesFotografiaAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_FOTOGRAFIA");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet telefonesFotografiaFotografiaOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_FOTOGRAFIA ORDER BY FOTGRF, TELEFONE");
            }else{
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_FOTOGRAFIA ORDER BY FOTGRF DESC, TELEFONE");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet telefonesFotografiaTelefonesOrder(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            if(order){
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_FOTOGRAFIA ORDER BY TELEFONE, FOTGRF");
            }else{
                rs = stmt.executeQuery("SELECT * FROM TELEFONES_FOTOGRAFIA ORDER BY TELEFONE DESC, FOTGRF");
            }
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public static ResultSet temploReligiosoAll(Statement stmt, Connection c){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
                rs = stmt.executeQuery("SELECT * FROM TEMPLO_RELIGIOSO");
                
                System.out.println("SELECT COMPLETO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    /**
     * Selecionar a quantidade de formaturas que acontecem em cada mes. Ordenar por mes.
     * 
     * @param stmt
     * @param c
     * @param order
     * @return 
     */
    public static ResultSet formaturasMes(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT EXTRACT(MONTH FROM F.DATA) AS \"Mes\", COUNT(*)\n" +
                                        "FROM FORMATURA F\n" +
                                        "GROUP BY EXTRACT(MONTH FROM F.DATA)\n" +
                                        "ORDER BY EXTRACT(MONTH FROM F.DATA)");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    /**
     * Selecionar a quantidade de cada tipo de servico de fotografia para formaturas no mes de fevereiro.
     * 
     * @param stmt
     * @param c
     * @param order
     * @return 
     */
    public static ResultSet fotografiaFevereiro(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT  FT.TIPO AS \"Tipo\",COUNT(*)\n" +
                                    "FROM FOTOGRAFIA FT, EVENTO EV\n" +
                                    "WHERE EV.FOTOGRAFIA = FT.CNPJ AND\n" +
                                    "        EXTRACT(MONTH FROM EV.DATA) = '02'\n" +
                                    "GROUP BY FT.TIPO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    /**
     * Selecione as formaturas da exibindo os nomes das equipes de fotografia, os nomes das casas de festa.
     * 
     * @param stmt
     * @param c
     * @param order
     * @return 
     */
    public static ResultSet formaturaFotoFesta(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT FO.ESCOLA AS \"Escola\", FT.NOME_EQUIPE AS \"Equipe\", CS.NOME AS \"CasaFesta\"\n" +
                                    "FROM EVENTO EV, FOTOGRAFIA FT, CASA_FESTAS CS, FORMATURA FO\n" +
                                    "WHERE EV.DATA = FO.DATA AND EV.FOTOGRAFIA = FT.CNPJ AND EV.NRO_CASA_FESTAS = CS.NRO AND EV.CEP_CASA_FESTAS = CS.CEP\n" +
                                    "ORDER BY FO.ESCOLA");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    /**
     * Selecionar todas as formaturas que ocorreram antes da colacao de grau
     * 
     * @param stmt
     * @param c
     * @param order
     * @return 
     */
    public static ResultSet formaturaAntesColacao(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT *\n" +
                                    "FROM FORMATURA F\n" +
                                    "WHERE F.DATA < F.DATA_COLACAO");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    /**
     * Selecionar para todas formaturas o nome da escola e se houver o nome da equipe de fotografia. Se nao houver equipe exibir null
     * 
     * @param stmt
     * @param c
     * @param order
     * @return 
     */
    public static ResultSet formaturaEscolaFoto(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT EV.DATA, FO.ESCOLA , FT.NOME_EQUIPE\n" +
                                    "FROM (EVENTO EV JOIN FORMATURA FO\n" +
                                    "                    ON EV.DATA = FO.DATA)\n" +
                                    "LEFT JOIN FOTOGRAFIA FT\n" +
                                    "ON FT.CNPJ = EV.FOTOGRAFIA\n" +
                                    "ORDER BY EV.DATA");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    /**
     * Selecionar os nomes das casas de festa nas quais ocorreram mais de uma formatura no ano de 2018
     * 
     * @param stmt
     * @param c
     * @param order
     * @return 
     */
    public static ResultSet casaFestasFormatura2018(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT CF.NOME AS \"CasaFestas\", COUNT(*) AS \"Qtd\"\n" +
                                    "FROM EVENTO EV, CASA_FESTAS CF\n" +
                                    "WHERE EV.CEP_CASA_FESTAS = CF.CEP AND EV.NRO_CASA_FESTAS = CF.NRO AND UPPER(EV.TIPO) = 'FORMATURA' AND EXTRACT(YEAR FROM EV.DATA) = '2018'\n" +
                                    "GROUP BY CF.NOME \n" +
                                    "HAVING COUNT(*) > 1");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    /**
     * Selecionar as quantidades de festas decoradas para cada decoradora. Agrupar pelos nomes das decoradoras
     * 
     * @param stmt
     * @param c
     * @param order
     * @return 
     */
    public static ResultSet decoradoraQuantidadeFestas(Statement stmt, Connection c, boolean order){
        ResultSet rs = null;
        
        try{
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT DR.NOME AS \"Decor\", COUNT(*) AS \"Qtd\"\n" +
                                    "FROM EVENTO EV, DECORA DA, DECORADORA DR\n" +
                                    "WHERE EV.DATA = DA.DATA_EVENTO AND DA.DECORADORA = DR.CNPJ\n" +
                                    "GROUP BY DR.NOME");
        } catch(Exception e){
            System.out.println("SELECT PROBLEM");
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
