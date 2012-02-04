package br.com.afonso.agenda.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.afonso.agenda.jdbc.ConnectionFactory;
import br.com.afonso.agenda.jdbc.modelo.Contato;

/**
 * @author afonso.jota@gmail.com (Afonso J. Filgueiras)
 */
public class ContatoDAO {

	private Connection connection;

	public ContatoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Contato contato) {
		String sql = "insert into CONTATOS(NOME,EMAIL,ENDERECO,DATA_NASCIMENTO) values(?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
					.getTimeInMillis()));

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new DAOException();
		}
	}

	public List<Contato> getLista() {
		String sql = "select * from CONTATOS";

		List<Contato> contatos = new ArrayList<Contato>();

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Contato contato = new Contato();

				contato.setId(rs.getLong("ID"));
				contato.setNome(rs.getString("NOME"));
				contato.setEmail(rs.getString("EMAIL"));
				contato.setEndereco(rs.getString("ENDERECO"));

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("DATA_NASCIMENTO"));
				contato.setDataNascimento(data);

				contatos.add(contato);
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new DAOException();
		}

		return contatos;
	}

	public void altera(Contato contato) {
		Long id = contato.getId();
		String sql = "update CONTATOS set NOME = ?, EMAIL = ?, ENDERECO = ? , DATA_NASCIMENTO = ? where ID = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento()
					.getTimeInMillis()));
			stmt.setLong(5, contato.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new DAOException();
		}
	}

	public void remove(Contato contato) {
		String sql = "delete from CONTATOS where ID = ?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, contato.getId());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new DAOException();
		}
	}

}
