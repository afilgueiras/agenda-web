package br.com.afonso.agenda.jdbc.dao;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class DAOException extends RuntimeException {

	public DAOException() {
		String erro = "Falha com o DAO";
		System.out.println(erro);
	}

}
