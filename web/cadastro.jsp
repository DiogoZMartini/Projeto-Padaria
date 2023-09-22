<%@page import="br.confeitariaCelestial.DAO.ProdutoDAO"%>
<%@page import="br.confeitariaCelestial.DTO.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="refresh" content="0.001; (pagina da loja)">
    </head>
    <body>
        <%
            Produto objProduto = new Produto();
            objProduto.setNome(request.getParameter("txtNome"));
            objProduto.setPreco(Double.parseDouble(request.getParameter("numPreco")));
            objProduto.setQuantidade(Integer.parseInt(request.getParameter("numQuantidade")));
            ProdutoDAO objProdutoDAO = new ProdutoDAO();
            objProdutoDAO.cadastrarProduto(objProduto);
        %>
    </body>
</html>
