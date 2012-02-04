package br.com.afonso.agenda.jdbc.dao.teste;

import java.util.Calendar;

import br.com.afonso.agenda.jdbc.dao.ContatoDAO;
import br.com.afonso.agenda.jdbc.modelo.Contato;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class TestaInsereContato {

	public static void main(String[] args) {
		Contato contato = new Contato();

		contato.setNome("Afonso Jota");
		contato.setEmail("afonso.jota@gmail.com");
		contato.setEndereco("Av. Marechal Agostinho dos Santos");
		contato.setDataNascimento(Calendar.getInstance());

		ContatoDAO dao = new ContatoDAO();

		dao.adiciona(contato);

		System.out.println("Contato Gravado!");
	}

}
