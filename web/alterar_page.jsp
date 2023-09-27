<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <main id="alterarmain">
            <h1></h1>
            <form action="cadastro.jsp" method="POST">
                <label>
                    Nome:
                    <input type="text" name="txtNome" value="<%=request.getParameter("nome")%>">
                </label>
                <label>
                    Preço:
                    <input type="number" name="numPreco" value="<%=request.getParameter("preco")%>">
                </label>
                <label>
                    Quantidade:
                    <input type="number" name="numQuantidade" value="<%=request.getParameter("quantidade")%>">
                </label>
                <input type="submit" value="Alterar">
            </form>
            <div>
                <a href="lista_produto_page.jsp"><button>Cancelar</button></a>
            </div>
        </main>
    </body>
</html>
