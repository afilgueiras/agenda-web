<%@ page import="java.util.*, br.com.afonso.agenda.jdbc.dao.*, br.com.afonso.agenda.jdbc.modelo.*, java.text.SimpleDateFormat" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Lista de Contatos</title>
	</head>
	<body>
		<table>
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Endereço</th>
				<th>Data de Nascimento</th>
			</tr>
		<%
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		
		for(Contato contato : contatos){
		%>
			<tr>
				<td><%=contato.getNome()%></td>
				<td><%=contato.getEmail()%></td>
				<td><%=contato.getEndereco()%></td>
				<td><%Date data = contato.getDataNascimento().getTime();%>
				<%String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(data);%>
				<%=dataFormatada%>
				</td>
			</tr>
		<%
		}
		%>
		</table>
	</body>
</html>