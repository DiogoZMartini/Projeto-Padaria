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
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objProduto.getNome());
            pstm.setDouble(2, objProduto.getPreco());
            pstm.setInt(3, objProduto.getQuantidade());
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro classe PadariaDAO metodo cadastrarProduto()  ==> "+e);
        }
    }

//Alteração do Produto por ID
    public void alterarProduto(Produto objProduto) throws ClassNotFoundException{
        String sql = "update (tabela)"
                + "(campos) = ?"
                + "where (campo do ID) = ?";
        this.conexao = new ConexaoBD().getConexao();
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objProduto.getNome());
            pstm.setDouble(2, objProduto.getPreco());
            pstm.setInt(3, objProduto.getQuantidade());
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro classe PadariaDAO metodo alterarProduto()  ==> "+e);
        }
    }
    
//Exclusão do Produto
    public void excluirProduto(Produto objProduto){
        
    }
    
//Listagem de Produtos
    public ArrayList<Produto> listarProditos(){
       return this.listadeprodutos; 
    }
    
//Pesquisa de Produtos por Nome
    public ArrayList<Produto> pesquisarProdutoPorNome(){
        return this.listadeprodutos;
    }
}
