package br.com.afonso.agenda.jdbc.teste;

import br.com.afonso.agenda.jdbc.ConnectionFactory;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class TestaConexao {

	public static void main(String[] args) {
		System.out.println("Conectando ao banco..");

		new ConnectionFactory().getConnection();

		System.out.println("Conexão aberta!");
	}

}
