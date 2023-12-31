package br.confeitariaCelestial.DAO;

import br.confeitariaCelestial.DTO.Produto;
import br.confeitariaCelestial.conexaoBD.ConexaoBD;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet resultado;
    private ArrayList<Produto> listadeprodutos = new ArrayList<>();

//Cadastro de Produto
    public void cadastrarProduto(Produto objProduto) throws ClassNotFoundException {
        String sql = "insert into (tabela)(campos) value(?,(quantidade de campos))";
        this.conexao = new ConexaoBD().getConexao();
        try{
            this.pstm = conexao.prepareStatement(sql);
            this.pstm.setString(1, objProduto.getNome());
            this.pstm.setDouble(2, objProduto.getPreco());
            this.pstm.setInt(3, objProduto.getQuantidade());
            
            this.pstm.execute();
            this.pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro classe PadariaDAO metodo cadastrarProduto()  ==> "+e);
        }
    }

//Alteração do Produto por ID
    public void alterarProduto(Produto objProduto) throws ClassNotFoundException{
        String sql = "update (tabela)"
                + "set (campo) = ?, set (campo) = ?, set (campo) = ?"
                + "where (campo do ID) = ?";
        this.conexao = new ConexaoBD().getConexao();
        try {
            this.pstm = conexao.prepareStatement(sql);
            this.pstm.setString(1, objProduto.getNome());
            this.pstm.setDouble(2, objProduto.getPreco());
            this.pstm.setInt(3, objProduto.getQuantidade());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro classe PadariaDAO metodo alterarProduto()  ==> "+e);
        }
    }
    
//Exclusão do Produto
    public void excluirProduto(Produto objProduto) throws ClassNotFoundException{
        String sql = "delete from (tabela) where (campo do ID) = ?";
        this.conexao = new ConexaoBD().getConexao();
        try {
            this.pstm = conexao.prepareStatement(sql);
            this.pstm.setInt(1, objProduto.getId());
            
            this.pstm.execute();
            this.pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro classe PadariaDAO metodo excluirProduto()  ==> "+e);
        }
    }
    
//Listagem de Produtos
    public ArrayList<Produto> listarProditos() throws ClassNotFoundException{
        String sql = "SELECT * FROM (tabela)";
        this.conexao = new ConexaoBD().getConexao();
        try {
            this.pstm = conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while (this.resultado.next()) {                
                Produto objProduto = new Produto();
                objProduto.setNome(this.resultado.getString("(Nome do Campo do Nome)"));
                objProduto.setPreco(this.resultado.getDouble("(Nome do campo do Preço)"));
                objProduto.setQuantidade(this.resultado.getInt("(Nome do campo da Quantia)"));
                
                this.listadeprodutos.add(objProduto);
                this.pstm.execute();
                this.pstm.close();
            }   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro classe PadariaDAO metodo listarProdutos()  ==> "+e);
        }
        
       return this.listadeprodutos; 
    }
    
//Pesquisa de Produtos por Nome
    public ArrayList<Produto> pesquisarProdutoPorNome() throws ClassNotFoundException{
        String sql = "SELECT * FROM (tabela) were (campo do Nome) = ?";
        this.conexao = new ConexaoBD().getConexao();
        try {
            this.pstm = conexao.prepareStatement(sql);
            this.resultado = this.pstm.executeQuery(sql);
            
            while (this.resultado.next()) {                
                Produto objProduto = new Produto();
                objProduto.setNome(this.resultado.getString("(Nome do campo do Nome"));
                objProduto.setPreco(this.resultado.getDouble("(Nome do campo do Proço)"));
                objProduto.setQuantidade(this.resultado.getInt("(Nome do campo da Quantidade)"));
                
                this.listadeprodutos.add(objProduto);
                this.pstm.execute();
                this.pstm.close();
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro classe PadariaDAO metodo pesquisarProdutoPorNome()  ==> "+e);
        }
        
        return this.listadeprodutos;
    }
}
