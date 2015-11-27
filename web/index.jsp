<%-- 
    Document   : index
    Created on : 26-11-2015, 23:08:16
    Author     : bernardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="AgregarCedente" name="registro" class="form-horizontal">
                        <h1>Registro de Cedente</h1>
                        <label>Rut</label>
                        <input name="txtRut" class="form-control input-sm" type="text" />
                        <label>Nombre</label>
                        <input name="txtNombre" class="form-control input-sm" type="text" />
                        <label>Rubro</label>
                        <input name="txtRubro" class="form-control input-sm" type="text" />
                        <input type="hidden" name="op" value="Registro">
                         <br /> 
                        <button type="submit" class="btn btn-primary btn-lg btn-block">Registrar</button>
                    </form>
    </body>
</html>
