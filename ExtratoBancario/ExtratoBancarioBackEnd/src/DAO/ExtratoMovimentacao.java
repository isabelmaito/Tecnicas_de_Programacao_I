package DAO;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class ExtratoMovimentacao {
    private String tabela = "ExtratoMov";
    private String Num_conta;
    private String Num_agencia;
    private String Documento;
    private String Data_mov;
    private String Credito_debito;
    private Integer ID_hist;

    public ExtratoMovimentacao() {
    }
    
    public ExtratoMovimentacao(String Num_conta, String Num_agencia, String Documento, String Data_mov, String Credito_debito, Integer ID_hist) {
        if (!ValidaExtratoMovimentacao(Num_conta, Num_agencia, Documento, Data_mov, Credito_debito, ID_hist)){
            System.out.println("Erro");
        }
        this.Num_conta = Num_conta;
        this.Num_agencia = Num_agencia;
        this.Documento = Documento;
        this.Data_mov = Data_mov;
        this.Credito_debito = Credito_debito;
        this.ID_hist = ID_hist;
    }

    public String getNum_conta() {
        return Num_conta;
    }

    public void setNum_conta(String Num_conta) throws Exception{
        if(ValidaNumConta(Num_conta)){
           this.Num_conta = Num_conta;
    }else{
            JOptionPane.showMessageDialog(null, "Conta não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getNum_agencia() {
        return Num_agencia;
    }

    public void setNum_agencia(String Num_agencia) throws Exception{
        if(ValidaNum_agencia(Num_agencia)){
           this.Num_agencia = Num_agencia;
    }else{
            JOptionPane.showMessageDialog(null, "Agencia precisa ter 5 dígitos.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) throws Exception{
        if(ValidaDocumento(Documento)){
           this.Documento = Documento;
    }else{
            JOptionPane.showMessageDialog(null, "Documento não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getData_mov() {
        return Data_mov;
    }

    public void setData_mov(String Data_mov) throws Exception{
        if(ValidaDataMov(Data_mov)){
           this.Data_mov = Data_mov;
    }else{
            JOptionPane.showMessageDialog(null, "Data precisa ter 8 dígitos.");
            throw new Exception("Dados invalidos");
        }
    }
    
    public String getCredito_debito() {
        return Credito_debito;
    }

    public void setCredito_debito(String Credito_debito) throws Exception{
        if(ValidaCredito_debito(Credito_debito)){
          this.Credito_debito = Credito_debito;
    }else{
            JOptionPane.showMessageDialog(null, "Credito não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    }

    public Integer getID_hist() {
        return ID_hist;
    }

    public void setID_hist(Integer ID_hist) throws Exception{
        if(ValidaIDHist(ID_hist)){
          this.ID_hist = ID_hist;
    }else{
            JOptionPane.showMessageDialog(null, "ID não pode ser vazio.");
            throw new Exception("Dados invalidos");
        }
    } 
        
    private boolean ValidaNumConta(String Num_conta){
            return Num_conta != null &&
               !Num_conta.isBlank() &&
               !Num_conta.isEmpty();
    }
    
    private boolean ValidaNum_agencia(String Num_agencia){
        return Num_agencia != null &&
               !Num_agencia.isBlank() &&
               !Num_agencia.isEmpty() &&
               Num_agencia.length() == 5;
    }

    private boolean ValidaDocumento(String Documento){
            return Documento != null &&
               !Documento.isBlank() &&
               !Documento.isEmpty();
    }
    
    private boolean ValidaDataMov(String Data_mov){
            return Data_mov != null &&
               !Data_mov.isBlank() &&
               !Data_mov.isEmpty() &&
               Data_mov.length() == 8;
    }
    
    private boolean ValidaCredito_debito(String Credito_debito){
            return Credito_debito != null &&
               (Credito_debito.equalsIgnoreCase("C") || 
               Credito_debito.equalsIgnoreCase("D")); 
    }
    
  
    private boolean ValidaIDHist(Integer ID_hist){
            return ID_hist != null;
    }

    private boolean ValidaExtratoMovimentacao(String Num_conta, String Num_agencia, String Documento, String Data_mov, String Credito_debito, Integer ID_hist){
        return ValidaNumConta(Num_conta) &&
               ValidaNum_agencia(Num_agencia) &&
               ValidaDocumento(Documento) &&
               ValidaDataMov(Data_mov) &&
               ValidaCredito_debito(Credito_debito) &&
               ValidaIDHist(ID_hist);
    }
    
    public String dadosSQLValues(){
        String dadosExtratos;
        dadosExtratos = "'"
                + this.getNum_agencia() + "','"                
                + this.getNum_conta() + "','"
                + this.getData_mov() + "','"                
                + this.getDocumento() + "','"


                + this.getCredito_debito() + "','"
                + this.getDebito() + "','"
                + this.getID_hist() + "','"

                ;
        
        return dadosExtratos;
    }
}
