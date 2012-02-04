package br.com.afonso.agenda.jdbc.dao.teste;

import java.util.Calendar;

import br.com.afonso.agenda.jdbc.dao.ContatoDAO;
import br.com.afonso.agenda.jdbc.modelo.Contato;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class TestaAlteraContato {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();

		Contato contato = new Contato();

		contato.setId(2L);
		contato.setNome("Pato Donald ");
		contato.setEmail("pato.donald@yahoo.com");
		contato.setEndereco("Av. Disney - Flórida");
		contato.setDataNascimento(Calendar.getInstance());

		dao.altera(contato);

		System.out.println("Contato Alterado");
	}

}
