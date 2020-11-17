package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import model.Usuario;

//RESPONSAVEL POR INSERIR,SALVAR E EDITAR USUARIOS NO BANCO
public class UsuarioDAO {
	
	private final Connection connection;
	
	public UsuarioDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void insert(Usuario usuario) throws SQLException {

			String sql = "insert into usuarios(nome_usuario,senha,tipo_usuario) values('"+usuario.getNome_usuario()+"', '"+usuario.getSenha()+"', '"+usuario.getTipo_usuario()+"');";
			PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.execute();	
			

	}

	public boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {
		String sql = "select * from usuarios where nome_usuario = '"+usuario.getNome_usuario()+"' and senha = '"+usuario.getSenha()+"';";
		PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
	
		
		return resultSet.next();
	}
	
	public boolean usuarioAdministrador(Usuario usuario) throws SQLException {
		String sql = "select tipo_usuario from usuarios;";
		PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
		
		return resultSet.next();
	}


}
