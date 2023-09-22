<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confeitaria Celestial</title>
    </head>
    <body>
        <main id="cadastromain">
            <h1></h1>
            <form action="#" method="POST">
                <label>
                    Nome:
                    <input type="text" name="txtNome">
                </label>
                <label>
                    Preço:
                    <input type="number" name="numPreco">
                </label>
                <label>
                    Quantidade:
                    <input type="number" name="numQuantidade">
                </label>
                <input type="submit" value="Cadastrar">
            </form>
            <div>
                <a href=""><button>Cancelar</button></a>
            </div>
        </main>
    </body>
</html>
