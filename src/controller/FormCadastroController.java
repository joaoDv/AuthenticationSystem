package controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;
import view.FormCadastroView;

public class FormCadastroController {

	private FormCadastroView view;

	public FormCadastroController(FormCadastroView view) {
		this.view = view;
	}
	
	public void salvaUsuario() {
		
		
		String usuario = view.getTextFieldUsuario().getText();
		String senha = view.getPasswordFieldSenha().getText();
		String tipoDeUsuario = view.getTextFieldTipoUsuario().getText();
					
		
		Usuario usuarioGeral = new Usuario(usuario, senha, tipoDeUsuario);
		
		
		
		try {
			Connection conexao = new Conexao().getConnection();
			UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
			usuarioDao.insert(usuarioGeral);
			
			JOptionPane.showMessageDialog(null, "Usuario Salvo Com Sucesso");
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		
	}
	

}
