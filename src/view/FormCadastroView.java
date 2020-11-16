package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class FormCadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldSenha;
	private JButton btnNewButton;
	private JTextField textFieldTipoUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastroView frame = new FormCadastroView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCadastroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(68, 53, 82, 30);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(205, 53, 227, 30);
		contentPane.add(textFieldUsuario);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(92, 30, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(295, 30, 45, 13);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(351, 103, 45, 13);
		contentPane.add(lblSenha);
		

		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(271, 133, 227, 35);
		contentPane.add(passwordFieldSenha);
		
		btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String usuario = textFieldUsuario.getText();
				String senha = passwordFieldSenha.getText();
				String tipoDeUsuario = textFieldTipoUsuario.getText();				
				
				Usuario usuarioXande = new Usuario(usuario, senha, tipoDeUsuario);
				
				
				
				try {
					Connection conexao = new Conexao().getConnection();
					UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
					usuarioDao.insert(usuarioXande);
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(205, 218, 85, 21);
		contentPane.add(btnNewButton);
		
		textFieldTipoUsuario = new JTextField();
		textFieldTipoUsuario.setColumns(10);
		textFieldTipoUsuario.setBounds(10, 136, 227, 30);
		contentPane.add(textFieldTipoUsuario);
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de Usu\u00E1rio");
		lblTipoDeUsurio.setBounds(68, 103, 82, 13);
		contentPane.add(lblTipoDeUsurio);
		

	}
}
