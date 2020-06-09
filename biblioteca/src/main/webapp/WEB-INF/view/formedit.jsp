<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <%@ page isELIgnored="false" %>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Book Library</title>
</head>
<body>
    <div>
        <h2>Atualizar cadastro de livro</h2>
        <div>
            <div>
                <form:form action="${livros.id}/update"  method="post">
                    <div>
                        <div>
                            Livro: ${livros.id}
                        </div>
                        <div>       
							Titulo: <input type="text" value="${livros.titulo}" name="titulo"/><br>
							Editora: <input type="text" value="${livros.editora}" name="editora"/><br>
							Ano: <input type="text" value="${livros.ano}" name="ano"/><br><br>
                        </div>
                    
                    </div>
                    <div>
                        <div>
                            <button type="submit">Atualizar dados</button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    </body>
</html>