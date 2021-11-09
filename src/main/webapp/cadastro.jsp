<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de candidato</title><
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<form action="User" method="post">
	
	  <div class="container">           
		  <table class="table table-bordered" border="2">
		  	<tr>
		        <td colspan="2" align="center">Cria��o de contas - Cadastro de usu�rios.</td>
		  	</tr>
		      <tr>
		        <td>Nome:</td>
		        <td>
		        	<input type="text" name="nome" size="50" maxlength="50" value="Cesar de sena">
		        </td>
		      </tr>
		      <tr>
		        <td>Email:</td>
		        <td>
		        	<input type="email" name="email" size="50" maxlength="50" value="bangjogos1@gmail.com">
		        </td>
		      </tr>
		      
		      <tr>
		        <td>Endere�o:</td>
		        <td>
		        	<input type="text" name="endereco" size="50" maxlength="50" value="Rua Douradinha 117 M">
		        </td>
		      </tr>
		      
		      <tr>
		        <td>Telefone:</td>
		        <td>
		        	<input type="text" name="fone" size="30" maxlength="30" value="81996924416">
		        </td>
		      </tr>
		      
		      <tr>
		        <td>Senha:</td>
		        <td>
		        	<input type="password" name="senha" size="30" maxlength="30" value="123456">
		        </td>
		      </tr>
		      
		      <tr>
		        <td>Confirme a senha:</td>
		        <td>
		        	<input type="password" name="senhaConfirmada" size="30" maxlength="30" value="123456">
		        </td>
		      </tr>
		      
		      <tr>
		        <td>Tipo de conta:</td>
		        <td>
		        	<label class="radio-inline"><input type="radio" name="tipoConta" value="C" checked>Candidato</label>
		        	<label class="radio-inline"><input type="radio" name="tipoConta" value="E">Empresa</label>
		        </td>
		      </tr>
		      
		      <tr>
		        <td>CPF:</td>
		        <td>
		        	<input type="text" name="cpf" size="30" maxlength="30" value="70774769440">
		        </td>
		      </tr>
		      
		      <tr>
		        <td>Raz�o Social:</td>
		        <td>
		        	<input type="text" name="razao" size="40" maxlength="40" value="Oxente sabor do nordeste">
		        </td>
		      </tr>
		      
		      <tr>
		        <td>CNPJ:</td>
		        <td>
		        	<input type="text" name="cnpj" size="30" maxlength="30" value="88896988547455">
		        </td>
		      </tr>
		      
		      <tr>
		        <td colspan="2" align="center">
		        	<button type="submit" class="btn btn-primary">Cadastrar</button>
		        </td>
		  	</tr>
		  </table>
	  </div>
	 
	</form>
	
</body>
</html>