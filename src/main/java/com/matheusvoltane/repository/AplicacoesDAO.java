package com.matheusvoltane.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.matheusvoltane.model.Aplicacoes;

public class AplicacoesDAO {
	private Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/investment-control?useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String pass = "voltane";
		
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		return conn;
	}
	
	private void closeConnection(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void adicionar(Aplicacoes aplicacao) throws	Exception  {
		String query = "INSERT INTO	tb_aplicacoes VALUES (0,?,?)";
		Connection conn = null;
		
		try {
			conn = this.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, aplicacao.getNumeroAplicacao());
			ps.setString(2, aplicacao.getNomeAplicacao());
			
			ps.execute();
			
		} catch (SQLException e) {
			throw new Exception(e);
		}finally {
			this.closeConnection(conn);
		}
	}

	public void remover(Aplicacoes aplicacao) throws Exception {
		String query = "DELETE FROM tb_aplicacoes WHERE nome_aplicacao = ?";
		Connection conn = null;
		
		try {
			conn = this.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, aplicacao.getNomeAplicacao());
			
			ps.execute();
		} catch (SQLException e) {
			throw new SQLException(e);
		}finally {
			this.closeConnection(conn);
		}
		
	}
}
