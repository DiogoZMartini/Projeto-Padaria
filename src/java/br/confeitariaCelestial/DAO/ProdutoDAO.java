package br.confeitariaCelestial.DAO;

import br.confeitariaCelestial.DTO.Produto;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;

public class ProdutoDAO {

    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet resultado;
    private ArrayList<Produto> listadeprodutos = new ArrayList<>();

//Cadastro de Produto
    public void cadastrarProduto(Produto objProduto) {

    }

//Alteração do Produto
    public void alterarProduto(Produto objProduto){
        
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
