package dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexao {
	
	
	public Connection getConnection() throws SQLException {
		Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/meio_ambientedb", "developer", "1234567");
		return conexao;
	}
}
