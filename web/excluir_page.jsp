<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confeitaria Celestial</title>
    </head>
    <body>
        <main id="excluirmain">
            <h1></h1>
            <form action="cadastro.jsp" method="POST">
                <label>
                    Id
                    <input type="text" name="txtId" value="<%=request.getParameter("id")%>">
                </label>
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
                <input type="submit" value="Excluir">
            </form>
            <div>
                <a href="lista_produto_page.jsp"><button>Cancelar</button></a>
            </div>
        </main>
    </body>
</html>
