package bd_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lucas
 */
public class selectChooser {
    
    public static ResultSet chooseSelection(Statement stmt, Connection c, String tbl){
        ResultSet rs = null;
        switch(tbl){
            case "Formatura":
                return selectFunctions.formaturaAll(stmt, c);
            case "Escola":
                return selectFunctions.escolaAll(stmt, c);
            case "AtracaoExtra":
                return selectFunctions.atracaoExtraAll(stmt, c);
            case "FPossuiAExtra":
                return selectFunctions.formaturaTemAtrextraAll(stmt, c);
            case "Paraninfo":
                return selectFunctions.paraninfoAll(stmt, c);
            case "ParaninfosFormatura":
                return selectFunctions.paraninfoFormaturaAll(stmt, c);
            case "ListaFormandos":
                return selectFunctions.listaFormandosAll(stmt, c);
            case "Banda":
                return selectFunctions.bandaAll(stmt, c);
            case "EstiloBanda": 
                return selectFunctions.estilosBandaAll(stmt, c);
            case "IntegrantesBanda":
                return selectFunctions.integrantesBandaAll(stmt, c);
            case "EmailsBanda":
                return selectFunctions.emailsBandaAll(stmt, c);
            case "TelefonesBanda":
                return selectFunctions.telefonesBandaAll(stmt, c);
            case "BandaSeApresenta":
                return selectFunctions.bandaSeApresentaAll(stmt, c);
            case "TelefonesFotografia":
                return selectFunctions.telefonesFotografiaAll(stmt, c);
            case "EmailsFotografia":
                return selectFunctions.emailsFotografiaAll(stmt, c);
            case "Fotografia":
                return selectFunctions.fotografiaAll(stmt, c);
            case "Evento":
                return selectFunctions.eventoAll(stmt, c);
            case "CasaDeFestas":
                return selectFunctions.casaFestasAll(stmt, c);
            case "Decora":
                return selectFunctions.decoraAll(stmt, c);
            case "Decoradora":
                return selectFunctions.decoradoraAll(stmt, c);
            case "EmailsDecoradora":
                return selectFunctions.emailsDecoradoraAll(stmt, c);
            case "TelefonesDecoradora":
                return selectFunctions.telefonesDecoradoraAll(stmt, c);
            case "FormaturaMes":
                return selectFunctions.formaturasMes(stmt, c, true);
            case "FotografiaFevereiro":
                return selectFunctions.fotografiaFevereiro(stmt, c, true);
            case "FormaturaFotoFesta":
                return selectFunctions.formaturaFotoFesta(stmt, c, true);
            case "FormaturaAntesColacao":
                return selectFunctions.formaturaAntesColacao(stmt, c, true);
            case "FormaturaEscolaFoto":
                return selectFunctions.formaturaEscolaFoto(stmt, c, true);
            case "CasaFestasFormatura2018":
                return selectFunctions.casaFestasFormatura2018(stmt, c, true);
            case "DecoradoraQuantidadeFestas":
                return selectFunctions.decoradoraQuantidadeFestas(stmt, c, true);
        }
        return rs;
    }
    
    public static ResultSet chooseSelectionOrder(Statement stmt, Connection c, String tbl, boolean order, String att){
        ResultSet rs = null;
        
        switch(tbl){
            case "Formatura":
                switch(att){
                    case "Data":
                        return selectFunctions.formaturaDataOrder(stmt, c, order);
                    case "Escola":
                        return selectFunctions.formaturaEscolaOrder(stmt, c, order);
                }
            case "Escola":
                return selectFunctions.escolaNomeOrder(stmt, c, order);
            case "AtracaoExtra":
                switch(att){
                    case "CNPJ":
                        return selectFunctions.atracaoExtraCNPJOrder(stmt, c, order);
                    case "Nome":
                        return selectFunctions.atracaoExtraNomeOrder(stmt, c, order);
                }                   
            case "FPossuiAExtra":
                switch(att){
                    case "AtracaoExtra":
                        return selectFunctions.formaturaTemAtrextraAtrOrder(stmt, c, order);
                    case "Formatura":
                        return selectFunctions.formaturaTemAtrextraDataOrder(stmt, c, order);
                }               
            case "Paraninfo":
                switch(att){
                    case "Nome":
                        return selectFunctions.paraninfoNomeOrder(stmt, c, order);
                    case "Telefone":
                        return selectFunctions.paraninfoTelefoneOrder(stmt, c, order);
                }             
            case "ParaninfosFormatura":
                switch(att){
                    case "Formatura":
                        return selectFunctions.paraninfoFormaturaDataOrder(stmt, c, order);
                    case "Paraninfo":
                        return selectFunctions.paraninfoFormaturaParaninfoOrder(stmt, c, order);
                }            
            case "ListaFormandos":
                switch(att){
                    case "Formatura":
                        return selectFunctions.listaFormandosDataOrder(stmt, c, order);
                    case "Formando":
                        return selectFunctions.listaFormandosNomeOrder(stmt, c, order);
                }
            case "Banda":
                switch(att){
                    case "CPF-lider":
                        return selectFunctions.bandaCPFLiderOrder(stmt, c, order);
                    case "NomeBanda":
                        return selectFunctions.bandaNomeOrder(stmt, c, order);
                }
            case "EstiloBanda": 
                switch(att){
                    case "Banda":
                        return selectFunctions.estilosBandaNomeOrder(stmt, c, order);
                    case "Estilo":
                        return selectFunctions.estilosBandaEstiloOrder(stmt, c, order);
                }
            case "IntegrantesBanda":
                switch(att){
                    case "Banda":
                        return selectFunctions.integrantesBandaOrder(stmt, c, order);
                    case "Integrantes":
                        return selectFunctions.integrantesBandaNomeOrder(stmt, c, order);
                }
            case "EmailsBanda":
                switch(att){
                    case "Banda":
                        return selectFunctions.emailsBandaNomeOrder(stmt, c, order);
                    case "Email":
                        return selectFunctions.emailsBandaEmailOrder(stmt, c, order);
                }
            case "TelefonesBanda":
                return selectFunctions.telefonesBandaNomeOrder(stmt, c, order);
            case "BandaSeApresenta":
                return selectFunctions.bandaSeApresentaOrder(stmt, c, order);
            case "TelefonesFotografia":
                switch(att){
                    case "Fotografia":
                        return selectFunctions.telefonesFotografiaFotografiaOrder(stmt, c, order);
                    case "Telefone":
                        return selectFunctions.telefonesFotografiaTelefonesOrder(stmt, c, order);
                }
            case "EmailsFotografia":
                switch(att){
                    case "Emails":
                        return selectFunctions.emailsFotografiaEmailOrder(stmt, c, order);
                    case "Fotografia":
                        return selectFunctions.emailsFotografiaFotografiaOrder(stmt, c, order);
                }
            case "Fotografia":
                switch(att){
                    case "CNPJ":
                        return selectFunctions.fotografiaCNPJOrder(stmt, c, order);
                    case "NFotografos":
                        return selectFunctions.fotografiaNomeOrder(stmt, c, order);
                    case "NomeEquipe":
                        return selectFunctions.fotografiaNumeroOrder(stmt, c, order);
                    case "Tipo":
                        return selectFunctions.fotografiaTipoOrder(stmt, c, order);
                }
            case "Evento":
                return selectFunctions.eventoDataOrder(stmt, c, order);
            case "CasaDeFestas":
                switch(att){
                    case "CEP":
                        return selectFunctions.casaFestasCEPOrder(stmt, c, order);
                    case "Cidade":
                        return selectFunctions.casaFestasCidadeOrder(stmt, c, order);
                    case "Lotacao":
                        return selectFunctions.casaFestasLotacaoOrder(stmt, c, order);
                    case "Nome":
                        return selectFunctions.casaFestasNomeOrder(stmt, c, order);
                }
            case "Decora":
                return selectFunctions.decoraOrder(stmt, c, order);
            case "Decoradora":
                switch(att){
                    case "CNPJ":
                        return selectFunctions.decoradoraCNPJOrder(stmt, c, order);
                    case "Nome":
                        return selectFunctions.decoradoraNomeOrder(stmt, c, order);
                }
            case "EmailsDecoradora":
                switch(att){
                    case "Email":
                        return selectFunctions.emailsDecoradoraEmailOrder(stmt, c, order);
                    case "Decoradora":
                        return selectFunctions.emailsDecoradoraOrder(stmt, c, order);
                }
            case "TelefonesDecoradora":
                switch(att){
                    case "Decoradora":
                        return selectFunctions.telefonesDecoradoraOrder(stmt, c, order);
                    case "Telefone":
                        return selectFunctions.telefonesDecoradoraTelefonesOrder(stmt, c, order);
                }
        }
        return rs;
    }
}
