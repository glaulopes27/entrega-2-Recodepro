package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import agenciadeviagem.agencia;
import connection.ConnectionMySQL;




public class agenciadao {

	// create
	public void save(agencia agencia) {

		// cria a query
		String sql = "INSERT INTO contato "+ "(nome_agencia, email_agencia,tel_agencia,id_agencia)" +" VALUES (?, ?, ?, ?)" ;
		// fazer conexao
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, agencia.getNome_agencia());
			pstm.setString(2, agencia.getEmail_agencia());
			pstm.setString(3, agencia.getTel_agencia());
			pstm.setInt(4, agencia.getId_agenciaPK());
			
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {   
			// fecha conexao
			try {
				if (pstm != null) {

					pstm.close();
				}
				if (conn != null) {

					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// read
	public List<agenciadao> getagencia() {

		// criar a query
		String sql = "SELECT * FROM agencia";
		// faz a lista que recebe dados

		List<agenciadao> Listcontas = new ArrayList<agenciadao>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// classe que vai recuperar os dados do banco
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			// captura o que foi executado no psm
			rset = pstm.executeQuery();

			// teste
			while (rset.next()) {
			
				agencia agencia = new agencia();

				agencia.setId_agenciaPK(rset.getInt("id_agencia"));
				agencia.setNome_agencia(rset.getString("nome_agencia"));
				agencia.setTel_agencia(rset.getString("tel_agencia"));
				agencia.setEmail_agencia(rset.getString("email_agencia"));

				agencia.add(agencia);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if (rset != null) {

					rset.close();
				}

				if (pstm != null) {

					pstm.close();
				}

				if (conn != null) {

					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return getagencia();
	}

	// Uppdate
	public void update(agencia agencia) {
		String sql = "UPDATE agencia SET nome_agencia = ? WHERE id_autor = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			// adiciona o valor nos parametros

			pstm.setInt(1, agencia.getId_agenciaPK());
			pstm.setString(2, agencia.getNome_agencia());
			pstm.setString(3, agencia.getEmail_agencia());
			pstm.setString(4, agencia.getTel_agencia());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (pstm != null) {

					pstm.close();
				}
				if (conn != null) {

					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// DELETE

	public void deleteById(int id) {
		String sql = "DELETE FROM Autores WHERE id _agencia = ?";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (pstm != null) {

					pstm.close();
				}
				if (conn != null) {

					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
