package controller;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;
import view.Login;
import view.MenuView;

public class LoginController {

	private Login view;

	public LoginController(Login view) {
		this.view = view;
	}
	
	
	public void autenticar() throws SQLException {
		
		//Buscar um Usuario da view
		String usuario = view.getTxtUsuario().getText();
		String senha = view.getPasswordField().getText();
		String tipoUsuario = view.getTxtUsuario().getText();
		
		Usuario usuarioAutenticar = new Usuario(usuario, senha, tipoUsuario);
		//Verificar se existe no banco
		
		Connection conexao = new Conexao().getConnection();
		UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
		
		boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
		
		//se existe, mostrar menu 
		if(existe) {
			JOptionPane.showMessageDialog(view, "Bem vindo " + usuario);
			MenuView telaDeMenu = new MenuView();
			telaDeMenu.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(view, "Usuario ou senha inválidos");
		}
		
		
		

	}
}
