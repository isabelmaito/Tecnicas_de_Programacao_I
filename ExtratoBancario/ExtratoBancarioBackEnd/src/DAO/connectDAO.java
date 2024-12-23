/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package DAO;
 
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;
 
/**
 *
 * @author Alunos
 */
public class connectDAO {
    Connection con;
    public Connection connectDB(){
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;"
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return con;
        // con.close();
    }
    
    public void insereRegistroJFBD(String tabela, String strDados){
    
        con = connectDB();
        Statement stmt;
        try{
            stmt = con.createStatement();
            
            String sql = "INSERT INTO dbo."+tabela+" VALUES ("+ strDados+")";
            JOptionPane.showMessageDialog(null, "String de Insert: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
                    
        } catch (SQLException erro){
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
            
      }
}
    
    public void alteraRegistroJFBD(String tabela, String strDados, String condicao) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            
            String sql = "UPDATE dbo."+tabela+" SET "+strDados+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de update: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Alteração executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public void excluiRegistroJFBD(String tabela, String condicao) {
        con = connectDB();
        Statement stmt;
        try {
            stmt = con.createStatement();
            
            String sql = "DELETE FROM dbo."+tabela+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de delete: "+sql);
            
            try {
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Exclusão executada com sucesso!");
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }

    public List<String> consultaRegistroJFBD(String tabela, String campos, String condicao) {
        con = connectDB();
        Statement stmt;
        ResultSet rs;
        List<String> lista = new ArrayList<>();
        try {
            stmt = con.createStatement();
            
            String sql = "SELECT "+campos+" FROM dbo."+tabela+" WHERE "+condicao;
            JOptionPane.showMessageDialog(null, "String de select: "+sql);
            
            try {
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    lista.add(rs.getString(1));
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
            }
            con.close();
        } catch (SQLException erro) {
            Logger.getLogger(connectDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
        return lista;
    }
    
}


