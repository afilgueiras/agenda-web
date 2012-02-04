package br.com.afonso.agenda.jdbc.dao.teste;

import br.com.afonso.agenda.jdbc.dao.ContatoDAO;
import br.com.afonso.agenda.jdbc.modelo.Contato;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class TestaRemoveContato {

	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();

		Contato contato = new Contato();

		contato.setId(3l);

		dao.remove(contato);

		System.out.println("Contato " + contato.getId()
				+ " excluido com sucesso");

	}

}
