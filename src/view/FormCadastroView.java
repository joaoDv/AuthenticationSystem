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
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JButton btnNewButton;

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
		setBounds(100, 100, 542, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(141, 63, 82, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 126, 227, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(147, 40, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(141, 103, 45, 13);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(141, 163, 45, 13);
		contentPane.add(lblSenha);
		

		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 186, 227, 35);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuarioXande = new Usuario("Xande", "132456", "Visitante");
				
				try {
					Connection conexao = new Conexao().getConnection();
					UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
					usuarioDao.insert(usuarioXande);
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(204, 246, 85, 21);
		contentPane.add(btnNewButton);
		

	}
}
