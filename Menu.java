/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd_test;

import java.io.IOException;
import java.sql.*;






public class Menu {
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    
    
    
    
    
    public static void mainMenu(){
        System.out.println("0 - sair");
        System.out.println("1 - Inserir em Tabela");
        System.out.println("2 - Editar Tabela");
        System.out.println("3 - Excluir de Tabela");
        System.out.println("4 - Consultar Tabela");
        System.out.println("5 - Consultas Avancadas");
    }
    
    public static void printTables(){
        System.out.println("Digite o nome de uma das tabelas abaixo ou 'sair' para sair");
        System.out.println("Formatura   Escola  AtracaoExtra    FPossuiAExtra   Paraninfo");
        System.out.println("ParaninfosFormatura ListaFormandos  Banda   EstiloBanda IntegrantesBanda");
        System.out.println("EmailsBanda TelefonesBanda  BandaSeApresenta    TelefonesFotografia EmailsFotografia");
        System.out.println("Fotografia  Evento  CasaDeFestas    Decora  Decoradora");
        System.out.println("EmailsDecoradora    TelefonesDecoradora");
    }
    
    
    public static void menuCriacao() throws IOException{
        String table;
        printTables();
        table = EntradaTeclado.leString();
        while(!"sair".equals(table)){
            switch(table){
                case "Formatura":
                  System.out.println("Abaixo digite: data da formatura (DD/MM/AAAA HH:MI:SS), escola, nome do cerimonilista, numero de Convidados, data da colacao (DD/MM/AAAA HH:MI:SS)");
                  String data = EntradaTeclado.leString();
                  String escola = EntradaTeclado.leString();
                  String  nomeCerimonialistaMissa = EntradaTeclado.leString();
                  int  nroConvidados = EntradaTeclado.leInt();
                  String dataColacao = EntradaTeclado.leString();

                  Insertion.InsertFormatura ( data,  escola,  nomeCerimonialistaMissa,  nroConvidados,  dataColacao);
                    break;
                case "Escola":
                    System.out.println("Abaixo digite: nome da escola, telefone, email, telefone da comissao, email da comissao");
                    String nome = EntradaTeclado.leString();
                    String telefone = EntradaTeclado.leString();
                    String email = EntradaTeclado.leString();
                    String telefoneComissao = EntradaTeclado.leString();
                    String emailComissao = EntradaTeclado.leString();
                   
                    Insertion.InsertEscola (nome, telefone, email, telefoneComissao, emailComissao);
                    break;
                case "AtracaoExtra":
                    System.out.println("Abaixo digite: CNPJ da atracao extra, nome, telefone, email, descricao");
                    String cnpj = EntradaTeclado.leString();
                    nome = EntradaTeclado.leString();
                    telefone = EntradaTeclado.leString();
                    email = EntradaTeclado.leString();
                    String descricao = EntradaTeclado.leString();
                    
                    Insertion.InsertAtracaoExtra (cnpj, nome, telefone, email, descricao);
                    break;
                case "FPossuiAExtra":
                    System.out.println("Abaixo digite: CNPJ da atracao extra, data da formatura (DD/MM/AAAA HH:MI:SS)");
                    String atrExtra = EntradaTeclado.leString();
                    String dataFormatura = EntradaTeclado.leString();
                    
                    Insertion.InsertFormaturaTemAtrExtra (atrExtra, dataFormatura);
                    break;
                case "Paraninfo":
                    System.out.println("Abaixo digite: nome do paraninfo, telefone)");
                     nome = EntradaTeclado.leString();
                     telefone = EntradaTeclado.leString();
                    
                    Insertion.InsertParaninfo ( nome,  telefone);
                    break;
                case "ParaninfosFormatura":
                    System.out.println("Abaixo digite: nome do paraninfo, data da formatura (DD/MM/AAAA HH:MI:SS)");

                    String paraninfo = EntradaTeclado.leString();
                    dataFormatura = EntradaTeclado.leString();
                    
                    Insertion.InsertParaninfoFormatura ( paraninfo,  dataFormatura);
                    break;
                case "ListaFormandos":
                    System.out.println("Abaixo digite: nome do formando, data da formatura (DD/MM/AAAA HH:MI:SS)");
                    String nomeFormando = EntradaTeclado.leString();
                    dataFormatura = EntradaTeclado.leString();
                    
                     Insertion.InsertListaFormandos ( dataFormatura,  nomeFormando);
                   break;
                case "Banda":
                    System.out.println("Abaixo digite:cpf do lider da banda, nome da banda");
                    
                    String cpfLider = EntradaTeclado.leString();
                    nome = EntradaTeclado.leString();
                    
                     Insertion.InsertBanda ( cpfLider,  nome);
                   break;
                case "EstiloBanda": 
                    System.out.println("Abaixo digite:cpf do lider da banda, estilo da banda");
                    
                    String banda = EntradaTeclado.leString();
                    String estilo = EntradaTeclado.leString(); 
                    Insertion.InsertEstilosBanda (banda, estilo);
                    break;
                case "IntegrantesBanda":
                    System.out.println("Abaixo digite:cpf do lider da banda, nome do integrante da banda");
                    
                    
                    banda = EntradaTeclado.leString();
                    String nomeIntegrante = EntradaTeclado.leString();
                     Insertion.InsertIntegrantesBanda ( banda,  nomeIntegrante);
                    break;
                case "EmailsBanda":
                    System.out.println("Abaixo digite:cpf do lider da banda, email da banda");
                    
                    banda = EntradaTeclado.leString();
                    email = EntradaTeclado.leString();
                    
                     Insertion.InsertEmailsBanda ( banda,  email);
                   break;
                case "TelefonesBanda":
                    System.out.println("Abaixo digite:cpf do lider da banda, telefone da banda");
                    
                    banda = EntradaTeclado.leString();
                    telefone = EntradaTeclado.leString();
                    Insertion.InsertTelefonesBanda ( banda, telefone);
                   break;
                case "BandaSeApresenta":
                    System.out.println("Abaixo digite: data do evento (DD/MM/AAAA HH:MI:SS), nome da banda, hora de inicio (DD/MM/AAAA HH:MI:SS), hora do fim (DD/MM/AAAA HH:MI:SS)");
                  
                    String dataEvento = EntradaTeclado.leString();
                    banda = EntradaTeclado.leString();
                    String horaIni = EntradaTeclado.leString();
                    String horaFim = EntradaTeclado.leString();
                    Insertion.InsertBandaSeApresenta (dataEvento,banda, horaIni, horaFim);
                    break;
                case "TelefonesFotografia":
                    System.out.println("Abaixo digite: CNPJ da empresa de fotografia, telefone da empresa de fotografia");
                    
                     String fotgrf = EntradaTeclado.leString();
                     telefone = EntradaTeclado.leString();
                    Insertion.InsertTelefonesFotografia ( fotgrf,  telefone);
                    break;
                case "EmailsFotografia":
                    System.out.println("Abaixo digite: CNPJ da empresa de fotografia, email da empresa de fotografia");
                    
                    fotgrf = EntradaTeclado.leString();
                    email = EntradaTeclado.leString();
                    
                     Insertion.InsertEmailsFotografia ( fotgrf,  email);
                   break;
                case "Fotografia":
                    System.out.println("Abaixo digite: CNPJ da empresa de fotografia, numero de fotografos, nome da equipe, tipo (cobertura ou ensaio)");
                    
                    cnpj = EntradaTeclado.leString();
                    int nroFotografos = EntradaTeclado.leInt();;
                    String nomeEquipe = EntradaTeclado.leString();;
                    String tipo = EntradaTeclado.leString();
                     Insertion.InsertFotografia ( cnpj,  nroFotografos,  nomeEquipe,  tipo);
                   break;
                case "Evento":
                    System.out.println("Abaixo digite: data do evento (DD/MM/AAAA HH:MI:SS), CNPJ da empresa de fotografia, numero da casa de festas, cep da casa de festas, tipo do evento (formatura ou casamento)");
                    
                    data = EntradaTeclado.leString();
                    String fotografia = EntradaTeclado.leString();
                    int nroCasaFestas = EntradaTeclado.leInt();
                    String cepCasaFestas = EntradaTeclado.leString();
                    tipo = EntradaTeclado.leString();
                     Insertion.InsertEvento ( data,  fotografia,  nroCasaFestas,  cepCasaFestas,  tipo);
                  break;
                case "CasaDeFestas":
                    System.out.println("Abaixo digite: cep da casa de festas, nome, rua, numero, complemento, bairro, cidade e lotação");
                  
                    String cep = EntradaTeclado.leString();
                    nome = EntradaTeclado.leString();
                    String rua = EntradaTeclado.leString();
                    int nro = EntradaTeclado.leInt();
                    String complemento = EntradaTeclado.leString();
                    String bairro = EntradaTeclado.leString();
                    String cidade = EntradaTeclado.leString();
                    int lotacao = EntradaTeclado.leInt();
                    Insertion.InsertCasaFestas (cep, nro, nome, rua, complemento, bairro, cidade, lotacao);
                  break;
                case "Decora":
                    System.out.println("Abaixo digite: data do evento, CNPJ da decoradora");
                    
                    dataEvento = EntradaTeclado.leString();
                    String decoradora = EntradaTeclado.leString();
                    
                    Insertion.InsertDecora (dataEvento, decoradora);
                  break;
                case "Decoradora":
                    System.out.println("Abaixo digite: CNPJ da decoradora, nome, descricao");
                    cnpj = EntradaTeclado.leString();
                    nome = EntradaTeclado.leString();
                    descricao = EntradaTeclado.leString();
                    
                    Insertion.InsertDecoradora (cnpj, nome, descricao);
                  break;
                case "EmailsDecoradora":
                    System.out.println("Abaixo digite: CNPJ da decoradora, email");
                    String dec = EntradaTeclado.leString();
                    email  = EntradaTeclado.leString();
                    
                    Insertion.InsertEmailsDecoradora (dec, email);
                  break;
                case "TelefonesDecoradora":
                    System.out.println("Abaixo digite: CNPJ da decoradora, telefone");
                    dec = EntradaTeclado.leString();
                    telefone  = EntradaTeclado.leString();
                    
                    Insertion.InsertTelefonesDecoradora (dec, telefone);
                    break;
                case "sair":
                    return;
                    break;
            }
            printTables();
            table = EntradaTeclado.leString();
            
        }
    }
    
    public static void menuEdicao() throws IOException{
        String table;
        printTables();
        table = EntradaTeclado.leString();
        while(!"sair".equals(table)){
            switch(table){
                case "Formatura":
                  System.out.println("Abaixo digite: data da formatura (DD/MM/AAAA HH:MI:SS)(sem alteracao), escola, nome do cerimonilista, numero de Convidados, data da colacao (DD/MM/AAAA HH:MI:SS)");
                  String data = EntradaTeclado.leString();
                  String escola = EntradaTeclado.leString();
                  String  nome_cerimonialista = EntradaTeclado.leString();
                  int  nroConvidados = EntradaTeclado.leInt();
                  String dataColacao = EntradaTeclado.leString();
                  
                  Editor.EditFormatura( data,  escola,  nome_cerimonialista,  nroConvidados,  dataColacao);
                    break;
                case "Escola":
                    System.out.println("Abaixo digite: nome da escola(sem alteracao), telefone, email, telefone da comissao, email da comissao");
                    String nome = EntradaTeclado.leString();
                    String telefone = EntradaTeclado.leString();
                    String email = EntradaTeclado.leString();
                    String telefoneComissao = EntradaTeclado.leString();
                    String emailComissao = EntradaTeclado.leString();
                    
                     Editor.EditEscola( nome, telefone,  email,  telefoneComissao,  emailComissao);
                   
                    break;
                case "AtracaoExtra":
                    System.out.println("Abaixo digite: CNPJ da atracao extra(sem alteracao), nome, telefone, email, descricao");
                    String cnpj = EntradaTeclado.leString();
                    nome = EntradaTeclado.leString();
                    telefone = EntradaTeclado.leString();
                    email = EntradaTeclado.leString();
                    String descricao = EntradaTeclado.leString();
                    
                     Editor.EditAtracaoExtra( cnpj, nome,  telefone,  email,  descricao);
                    
                    break;
                case "FPossuiAExtra":
                    System.out.println("Abaixo digite: data da formatura (DD/MM/AAAA HH:MI:SS)(sem alteracao), CNPJ da atracao extra");
                    
                    String dataFormatura = EntradaTeclado.leString();
                    String atrExtra = EntradaTeclado.leString();
                    
                     Editor.EditFormaturaTemAtrExtra( dataFormatura,  atrExtra);
                    
                    break;
                case "Paraninfo":
                    System.out.println("Abaixo digite: nome do paraninfo(sem alteracao), telefone)");
                     nome = EntradaTeclado.leString();
                     telefone = EntradaTeclado.leString();
                    
                     Editor.EditTelefoneParaninfo( nome,  telefone);
                    break;
                case "ParaninfosFormatura":
                    System.out.println("Abaixo digite: data da formatura (DD/MM/AAAA HH:MI:SS)(sem alteracao), nome do paraninfo");

                    dataFormatura = EntradaTeclado.leString();
                    String paraninfo = EntradaTeclado.leString();
                    
                    Editor.EditParaninfoFormatura( paraninfo,  dataFormatura);
                    
                    break;
                    
                case "ListaFormandos":
                    System.out.println("Abaixo digite: data da formatura (DD/MM/AAAA HH:MI:SS)(sem alteracao), nome do formando");
                    
                    dataFormatura = EntradaTeclado.leString();
                    String nomeFormando = EntradaTeclado.leString();
                    
                     Editor.EditListaFormandos( dataFormatura,  nomeFormando);
                    
                   break;
                case "Banda":
                    System.out.println("Abaixo digite:cpf do lider da banda(sem alteracao), nome da banda");
                    
                    String cpfLider = EntradaTeclado.leString();
                    nome = EntradaTeclado.leString();
                    
                     Editor.EditNomeBanda( cpfLider, nome);
                    
                   break;
                case "EstiloBanda": 
                    System.out.println("Abaixo digite:cpf do lider da banda(sem alteracao), estilo que deseja alterar, estilo atualizado");
                    
                    String banda = EntradaTeclado.leString();
                    String estiloAntigo = EntradaTeclado.leString(); 
                    String estiloNovo = EntradaTeclado.leString(); 
                    
                     Editor.EditEstilosBanda( banda,  estiloAntigo,  estiloNovo);
                    break;
                case "IntegrantesBanda":
                    System.out.println("Abaixo digite:cpf do lider da banda(sem alteracao), nome do membro que deseja alterar, nome atualizado");
                    
                    
                    banda = EntradaTeclado.leString();
                    String nomeAntigo = EntradaTeclado.leString();
                    String nomeNovo = EntradaTeclado.leString();
                    
                    Editor.EditIntegrantesBanda( banda,  nomeAntigo,  nomeNovo);
                    
                    break;
                case "EmailsBanda":
                    System.out.println("Abaixo digite:cpf do lider da banda(sem alteracao), email que deseja alterar, email atualizado");
                    
                    banda = EntradaTeclado.leString();
                    String emailAntigo = EntradaTeclado.leString();
                    String emailNovo = EntradaTeclado.leString();
                    
                   Editor.EditEmailsBanda( banda,  emailAntigo,  emailNovo);
                    
                   break;
                case "TelefonesBanda":
                    System.out.println("Abaixo digite:cpf do lider da banda(sem alteracao), telefone que deseja alterar, telefone atualizado");
                    
                    banda = EntradaTeclado.leString();
                    String telAntigo = EntradaTeclado.leString();
                    String telNovo = EntradaTeclado.leString();
                    
                     Editor.EditTelefonesBanda( banda,  telAntigo,  telNovo);
                            
                   break;
                case "BandaSeApresenta":
                    System.out.println("Abaixo digite: data do evento (DD/MM/AAAA HH:MI:SS)(sem alteracao), nome da banda(sem alteracao), hora de inicio (DD/MM/AAAA HH:MI:SS), hora do fim (DD/MM/AAAA HH:MI:SS)");
                  
                    String dataEvento = EntradaTeclado.leString();
                    banda = EntradaTeclado.leString();
                    String horaIni = EntradaTeclado.leString();
                    String horaFim = EntradaTeclado.leString();
                    
                    Editor.EditBandaSeApresenta( dataEvento,  banda,  horaIni,  horaFim);
                    break;
                case "TelefonesFotografia":
                    System.out.println("Abaixo digite: CNPJ da empresa de fotografia(sem alteracao), telefone que deseja atualizar, telefone novo");
                    
                     String fotografia = EntradaTeclado.leString();
                     telAntigo = EntradaTeclado.leString();
                     telNovo = EntradaTeclado.leString();
                     
                     Editor.EditTelefonesFotografia( fotografia,  telAntigo,  telNovo);
                     
                    break;
                case "EmailsFotografia":
                    System.out.println("Abaixo digite: CNPJ da empresa de fotografia (nao editar), email da empresa de fotografia que deseja atualizar, email atualizado");
                    
                    fotografia = EntradaTeclado.leString();
                    emailAntigo = EntradaTeclado.leString();
                    emailNovo = EntradaTeclado.leString();
                    Editor.EditEmailsFotografia(fotografia, emailAntigo, emailNovo);
                   break;
                case "Fotografia":
                    System.out.println("Abaixo digite: CNPJ da empresa de fotografia (nao editar), numero de fotografos, nome da equipe, tipo (cobertura ou ensaio)");
                    
                    cnpj = EntradaTeclado.leString();
                    int nfotografos = EntradaTeclado.leInt();;
                    String nome_equipe = EntradaTeclado.leString();;
                    String tipo = EntradaTeclado.leString();
                    
                    Editor.EditFotografia(cnpj, nfotografos, nome_equipe, tipo);
                    break;
                case "Evento":
                    System.out.println("Abaixo digite: data do evento (DD/MM/AAAA HH:MI:SS)(nao editar), CNPJ da empresa de fotografia, numero da casa de festas, cep da casa de festas, tipo do evento (formatura ou casamento)");
                    
                    data = EntradaTeclado.leString();
                    fotografia = EntradaTeclado.leString();
                    int nro_casa_festas = EntradaTeclado.leInt();
                    String cep_casa_festas = EntradaTeclado.leString();
                    tipo = EntradaTeclado.leString();
                    
                    Editor.EditEvento(data, fotografia, nro_casa_festas, cep_casa_festas, tipo );
                  break;
                case "CasaDeFestas":
                    System.out.println("Abaixo digite: cep da casa de festas (nao editar), numero (nao editar), nome, rua, numero, complemento, bairro, cidade e lotação");
                  
                    String cep = EntradaTeclado.leString();
                    int nro = EntradaTeclado.leInt();
                    nome = EntradaTeclado.leString();
                    String rua = EntradaTeclado.leString();
                    String complemento = EntradaTeclado.leString();
                    String bairro = EntradaTeclado.leString();
                    String cidade = EntradaTeclado.leString();
                    int lotacao = EntradaTeclado.leInt();
                    Editor.EditCasaFestas(cep, nro, nome, complemento, bairro, lotacao);
                  break;
                case "Decora":
                    System.out.println("Abaixo digite: data do evento (nao editar), CNPJ da decoradora");
                    
                    dataEvento = EntradaTeclado.leString();
                    String decoradora = EntradaTeclado.leString();
                    Editor.EditDecora(dataEvento, decoradora);
                  break;
                case "Decoradora":
                    System.out.println("Abaixo digite: CNPJ da decoradora (nao editar), nome, descricao");
                    cnpj = EntradaTeclado.leString();
                    nome = EntradaTeclado.leString();
                    descricao = EntradaTeclado.leString();
                    Editor.EditDecoradora(cnpj, nome, descricao);
                  break;
                case "EmailsDecoradora":
                    System.out.println("Abaixo digite: CNPJ da decoradora (nao editar), email que deseja editar, email atualizado");
                    String dec = EntradaTeclado.leString();
                    emailAntigo  = EntradaTeclado.leString();
                    emailNovo  = EntradaTeclado.leString();
                    
                    Editor.EditEmailsDecoradora(dec, emailAntigo, emailNovo);
                  break;
                case "TelefonesDecoradora":
                    System.out.println("Abaixo digite: CNPJ da decoradora (nao editar), telefone que deseja editar, telefone atualizado");
                    dec = EntradaTeclado.leString();
                    telAntigo  = EntradaTeclado.leString();
                    telNovo  = EntradaTeclado.leString();
                    
                     Editor.EditTelefonesDecoradora( dec,  telAntigo,  telNovo);
                    break;
                case "sair":
                    return;
                    //break;
            }
            printTables();
            table = EntradaTeclado.leString();
            
        }
    }
    
    public static void menuDelecao() throws IOException{
       String table;
        printTables();
        table = EntradaTeclado.leString();
        while(!"sair".equals(table)){
            switch(table){
                case "Formatura":
                    System.out.println("Digite a data (DD/MM/AAAA HH:MM:SS) da formatura a ser deletada.");
                    String data = EntradaTeclado.leString();
                  
                    Deletion.DeleteFormatura (data);
                    break;
                    
                case "Escola":
                    System.out.println("Digite o nome da escola a ser deletada.");
                    String nome = EntradaTeclado.leString ();
                    
                    Deletion.DeleteEscola (nome);
                    break;
                    
                case "AtracaoExtra":
                    System.out.println("Digite o CNPJ da atracao extra a ser deletada.");
                    String cnpj = EntradaTeclado.leString();
                    
                    Deletion.DeleteAtracaoExtra (cnpj);
                    break;
                    
                case "FPossuiAExtra":
                    System.out.println("Digite a data (DD/MM/AAAA HH:MM:SS) da formatura e o CNPJ da atracao extra a ser deletada.");
                     data = EntradaTeclado.leString ();
                     nome = EntradaTeclado.leString ();
                    
                    Deletion.DeleteFormaturaTemAtrExtra (data, nome);
                    break;
                   
                case "Paraninfo":
                    System.out.println("Digite o nome do paraninfo a ser deletado.");
                     nome = EntradaTeclado.leString ();
                    
                    Deletion.DeleteParaninfo (nome);
                    break;
                    
                case "ParaninfosFormatura":
                    System.out.println("Digite o nome do paraninfo e a data (DD/MM/AAAA HH:MM:SS) da formatura a ser deletada.");
                    nome = EntradaTeclado.leString ();
                    data = EntradaTeclado.leString ();
                    
                    Deletion.DeleteParaninfoFormatura (nome, data);
                    break;
                    
                case "ListaFormandos":
                    System.out.println("Digite a data (DD/MM/AAAA HH:MM:SS) e o nome do formando a ser deletada.");
                    data = EntradaTeclado.leString ();
                    nome = EntradaTeclado.leString ();
                    
                    Deletion.DeleteListaFormandos (data, nome);
                    break;
                   
                case "Banda":
                    System.out.println("Digite o CPF do lider da banda a ser deletada.");
                    String cpf = EntradaTeclado.leString ();
                    
                    Deletion.DeleteBanda (cpf);
                    break;
                   
                case "EstiloBanda": 
                    System.out.println("Digite o cpf do lider e o estilo da banda a ser deletada.");
                    nome = EntradaTeclado.leString ();
                    String estilo = EntradaTeclado.leString ();
                    
                    Deletion.DeleteEstilosBanda (nome, estilo);
                    break;
                    
                case "IntegrantesBanda":
                    System.out.println("Digite o cpf do lider e do integrante a ser deletado.");
                    String banda = EntradaTeclado.leString ();
                    nome = EntradaTeclado.leString ();
                    
                    Deletion.DeleteIntegrantesBanda (banda, nome);
                    break;
                    
                case "EmailsBanda":
                    System.out.println("Digite o cpf do lider e o email a ser deletado.");
                    nome = EntradaTeclado.leString ();
                    String email = EntradaTeclado.leString ();
                    
                    Deletion.DeleteEmailsBanda (nome, email);
                    break;
                           
                case "TelefonesBanda":
                    System.out.println("Digite o cpf do lider e o telefone a ser deletado.");
                    nome = EntradaTeclado.leString ();
                    String tel = EntradaTeclado.leString ();
                    
                    Deletion.DeleteTelefonesBanda (nome, tel);
                   break;
                   
                case "BandaSeApresenta":
                    System.out.println("Digite a data (DD/MM/AAAA HH:MM:SS) da formatura e o cpf do lider da banda a ser deletada.");
                    data = EntradaTeclado.leString ();
                    nome = EntradaTeclado.leString ();
                    
                    Deletion.DeleteBandaSeApresenta (data, nome);
                    break;
                    
                case "TelefonesFotografia":
                    System.out.println("Digite o cnpj da empresa de fotografia e o telefone a ser deletado.");
                    nome = EntradaTeclado.leString ();
                    tel = EntradaTeclado.leString ();
                    
                    Deletion.DeleteTelefonesFotografia (nome, tel);
                    break;
                    
                case "EmailsFotografia":
                    System.out.println("Digite o cnpj da empresa de fotografia e o email a ser deletado.");
                    nome = EntradaTeclado.leString ();
                    email = EntradaTeclado.leString ();
                    
                    Deletion.DeleteEmailsFotografia (nome, email);
                   break;
                   
                case "Fotografia":
                    System.out.println("Digite o CNPJ da fotografia a ser deletada.");
                    cnpj = EntradaTeclado.leString ();
                    
                    Deletion.DeleteFotografia (cnpj);
                    break;
                   
                case "Evento":
                    System.out.println("Digite a data (DD/MM/AAAA HH:MM:SS) do evento a ser deletado.");
                    data = EntradaTeclado.leString ();
                    
                    Deletion.DeleteEvento (data);
                    break;
                  
                case "CasaDeFestas":
                    System.out.println("Digite o CEP e o numero da casa de festas a ser deletada.");
                    String cep = EntradaTeclado.leString ();
                    int nro = EntradaTeclado.leInt ();
                    
                    Deletion.DeleteCasaFestas (cep, nro);
                    break;
                  
                case "Decora":
                    System.out.println("Digite a data (DD/MM/AAAA HH:MM:SS) de trabalho da decoradora a ser deletada.");
                    data = EntradaTeclado.leString ();
                    
                    Deletion.DeleteDecora (data);
                    break;
                  
                case "Decoradora":
                    System.out.println("Digite o CNPJ da decoradora a ser deletada.");
                    cnpj = EntradaTeclado.leString ();
                    
                    Deletion.DeleteDecoradora (cnpj);
                    break;
                  
                case "EmailsDecoradora":
                    System.out.println("Digite o cnpj da decoradora e o email a ser deletado.");
                     nome = EntradaTeclado.leString ();
                     email = EntradaTeclado.leString ();
                    
                    Deletion.DeleteEmailsDecoradora (nome, email);
                    break;
                  
                case "TelefonesDecoradora":
                    System.out.println("Digite o cnpj da decoradora e o telefone a ser deletado.");
                     nome = EntradaTeclado.leString ();
                     tel = EntradaTeclado.leString ();
                    
                    Deletion.DeleteTelefonesDecoradora (nome, tel);
                    break;
                    
                case "sair":
                    return;
                    //break;
            }
        } 
    }
    
    public static void menuConsulta() throws SQLException, IOException{
        conn = DB_Connection.connect();
        printTables();
        String ord;
        boolean tipo_ord;
        String aux;
        String att;
        String table = EntradaTeclado.leString();
        
        
         while(!"sair".equals(table)){
            switch(table){
                case "Formatura":
                    System.out.println("DATA-ESCOLA-NOME CERIMONIALISTA MISSA-NRO CONVIDADOS-DATA COLACAO");
                    
                    rs = selectFunctions.formaturaAll(stmt, conn);
                    while (rs.next()) {
                    System.out.println(rs.getDate("DATA") + "-"
                            + rs.getString("ESCOLA") + "-"
                            + rs.getString("NOME_CERIMONIALISTA_MISSA") + "-"
                            + rs.getInt("NRO_CONVIDADOS") + "-"
                            + rs.getDate("DATA_COLACAO")
                            );
                     }
                    
                    System.out.println("Deseja ordenar? (S/N)");
                    ord = EntradaTeclado.leString();
                    if(ord.equals("S")){
                        
                        System.out.println("Deseja ordenar por 'Escola' ou por 'Data'?");
                        att = EntradaTeclado.leString();
                        
                        System.out.println("Crescente 'C' ou Decrescente 'D'?");
                        aux = EntradaTeclado.leString();
                        
                        if(aux.equals("C")) tipo_ord = true;
                        else tipo_ord = false;
                        
                        rs = selectFunctions.chooseSelectionOrder(stmt, conn, table, tipo_ord, att);
                        System.out.println("DATA-ESCOLA-NOME CERIMONIALISTA MISSA-NRO CONVIDADOS-DATA COLACAO");
                        while (rs.next()) {
                             System.out.println(rs.getDate("DATA") + "-"
                                + rs.getString("ESCOLA") + "-"
                                + rs.getString("NOME_CERIMONIALISTA_MISSA") + "-"
                                + rs.getInt("NRO_CONVIDADOS") + "-"
                                + rs.getDate("DATA_COLACAO")
                                );
                        }
                        
                    }
                    
                    
                    break;
                    
                case "Escola":
                    
                    break;
                    
                case "AtracaoExtra":
                    
                    break;
                    
                case "FPossuiAExtra":
                    
                    break;
                   
                case "Paraninfo":
                   
                    break;
                    
                case "ParaninfosFormatura":
                   
                    break;
                    
                case "ListaFormandos":
                    
                    break;
                   
                case "Banda":
                   
                    break;
                   
                case "EstiloBanda": 
                    
                    break;
                    
                case "IntegrantesBanda":
                    
                    break;
                    
                case "EmailsBanda":
                    
                    break;
                           
                case "TelefonesBanda":
                   
                   break;
                   
                case "BandaSeApresenta":
                   
                    break;
                    
                case "TelefonesFotografia":
                   
                    break;
                    
                case "EmailsFotografia":
                   
                   break;
                   
                case "Fotografia":
                   
                    break;
                   
                case "Evento":
                   
                    break;
                  
                case "CasaDeFestas":
                   
                    break;
                  
                case "Decora":
                   
                    break;
                  
                case "Decoradora":
                   
                    break;
                  
                case "EmailsDecoradora":
                   
                    break;
                  
                case "TelefonesDecoradora":
                   
                    
                    break;
                    
                case "sair":
                    conn.close();
                    return;
                    //break;
            }
        } 
        
        
        
        if(conn != null) conn.close();
    }
    
    
    
    

    public static void main(String args[]) throws IOException{
        int op = -1;
        mainMenu();
        op = EntradaTeclado.leInt();
        while(op != 0){
           switch(op){
               case 0:
                   break;
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   break;
           }
           mainMenu();
           op = EntradaTeclado.leInt();
        }
        
    }
}
