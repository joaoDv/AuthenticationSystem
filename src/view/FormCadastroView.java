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

import controller.FormCadastroController;
import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FormCadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldSenha;
	private JButton btnNewButton;
	private JTextField textFieldTipoUsuario;
	private FormCadastroController controller;

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
		controller = new FormCadastroController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldId = new JTextField();
		textFieldId.setBounds(283, 43, 82, 30);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(206, 107, 227, 30);
		contentPane.add(textFieldUsuario);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(317, 23, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsurio.setBounds(295, 84, 127, 13);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(295, 153, 45, 13);
		contentPane.add(lblSenha);
		

		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(206, 176, 227, 35);
		contentPane.add(passwordFieldSenha);
		
		btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.salvaUsuario();
			}
		});
		btnNewButton.setBounds(269, 296, 85, 21);
		contentPane.add(btnNewButton);
		
		textFieldTipoUsuario = new JTextField();
		textFieldTipoUsuario.setColumns(10);
		textFieldTipoUsuario.setBounds(206, 243, 227, 30);
		contentPane.add(textFieldTipoUsuario);
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de Usu\u00E1rio");
		lblTipoDeUsurio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoDeUsurio.setBounds(269, 220, 127, 13);
		contentPane.add(lblTipoDeUsurio);
		

	}

	public JTextField getTextFieldId() {
		return textFieldId;
	}

	public void setTextFieldId(JTextField textFieldId) {
		this.textFieldId = textFieldId;
	}

	public JTextField getTextFieldUsuario() {
		return textFieldUsuario;
	}

	public void setTextFieldUsuario(JTextField textFieldUsuario) {
		this.textFieldUsuario = textFieldUsuario;
	}

	public JPasswordField getPasswordFieldSenha() {
		return passwordFieldSenha;
	}

	public void setPasswordFieldSenha(JPasswordField passwordFieldSenha) {
		this.passwordFieldSenha = passwordFieldSenha;
	}

	public JTextField getTextFieldTipoUsuario() {
		return textFieldTipoUsuario;
	}

	public void setTextFieldTipoUsuario(JTextField textFieldTipoUsuario) {
		this.textFieldTipoUsuario = textFieldTipoUsuario;
	}
}
