package br.confeitariaCelestial.conexaoBD;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {
    private Connection conexao = null;

//Fazer a Conexão do banco com o site
    public Connection getConexao() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/(Banco)?user=root&password=";
            this.conexao = (Connection) DriverManager.getConnection(url);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro na classe ConexaoBD e no metodo getConexao()");
        }
        return this.conexao;
    
    }
}
