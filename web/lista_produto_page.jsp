<%@page import="java.util.ArrayList"%>
<%@page import="br.confeitariaCelestial.DAO.ProdutoDAO"%>
<%@page import="br.confeitariaCelestial.DTO.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confeitaria Celestial</title>
    </head>
    <body>
        <header id="listaheader">
                <a href="cadastro_page.jsp"><button id="btn-lista-novo-livro">Novo Livro</button></a>
                <a href="index.html"><button id="btn-lista-voltar">Voltar</button></a>
        </header>
        <main id="listamain">
            <h1 id="listah1">Produtos</h1>
            <%
                ProdutoDAO objProdutoDAO = new ProdutoDAO();
                ArrayList<Produto> l = objProdutoDAO.listarProditos();
                
                for(int i = 0; i < l.size(); i++){
                  out.print("<div><p>Nome: "+l.get(i).getNome()+"</p>");
                  out.print("<p>Preço: "+l.get(i).getPreco()+"</p>");
                  out.print("<p>Quantidade: "+l.get(i).getQuantidade()+"</p>");
                  
                  out.print("<a> href='nome da pagina alterar?"
                  + "&nome="+l.get(i).getNome()+""
                  + "&preco="+l.get(i).getPreco()+""
                  + "&quantidade"+l.get(i).getQuantidade()+"'><button>Alterar</button></a>");
                  
                  out.print("<a> href='nome da pagina excluir?"
                  + "&nome="+l.get(i).getNome()+""
                  + "&preco="+l.get(i).getPreco()+""
                  + "&quantidade"+l.get(i).getQuantidade()+"'><button>Excluir</button></a>");
                }
            %>
        </main>
    </body>
</html>
