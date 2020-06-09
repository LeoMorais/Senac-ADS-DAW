<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Biblioteca</title>
</head>
<body>
    <div>
        <div>
            <h2>Biblioteca</h2>
            <hr/>
            <a href="/cadastrar">
                <button type="submit">Cadastrar novo</button>
            </a>
            <a href="/livros"><br>
                <button type="submit">Listar</button>
            </a>
            <br/><br/>
            <div>
                <div>
                    <div>Biblioteca</div>
                </div>
                <div>
                    <table border=1 frame=hsides rules=rows>
                        <tr>
                            <th>Id</th>
                            <th>Titulo</th>
                            <th>Editora</th>
                            <th>Ano</th>
                        </tr>
                        <c:forEach var="livro" items="${livros}">
                            <tr>
                                <td>${livro.id}></td>
                                <td>${livro.titulo}</td>
                                <td>${livro.editora}</td>
                                <td>${livro.ano}</td>
                                <td>
                                    <a href="/${livro.id}">Editar</a>
                                    <form action="/${livro.id}/delete" method="post">
                                        <input type="submit" value="Excluir" />
                                    </form>
                                </td> 
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>