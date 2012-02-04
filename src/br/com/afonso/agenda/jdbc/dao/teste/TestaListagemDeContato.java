package br.com.afonso.agenda.jdbc.dao.teste;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.afonso.agenda.jdbc.dao.ContatoDAO;
import br.com.afonso.agenda.jdbc.modelo.Contato;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class TestaListagemDeContato {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();

		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("ID: " + contato.getId());
			System.out.printf("Nome: %s \n", contato.getNome());
			System.out.printf("Email: %s \n", contato.getEmail());
			System.out.printf("Endereco: %s \n", contato.getEndereco());

			Date data = contato.getDataNascimento().getTime();
			String dataFormatada = new SimpleDateFormat("dd/MM/yyyy")
					.format(data);

			System.out.printf("Data de Nascimento: %s \n", dataFormatada);
			System.out.println();
		}
	}

}
