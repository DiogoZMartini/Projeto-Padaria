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
}
