package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsurio;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUsurio = new JTextField();
		txtUsurio.setBounds(144, 50, 124, 33);
		contentPane.add(txtUsurio);
		txtUsurio.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio");
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(144, 22, 90, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(SystemColor.text);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(144, 93, 90, 29);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(144, 120, 124, 33);
		contentPane.add(passwordField);
		
		JToggleButton botaoEntrar = new JToggleButton("Entrar");
		botaoEntrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botaoEntrar.setBounds(144, 166, 124, 21);
		contentPane.add(botaoEntrar);
		
		JToggleButton botaoCadastro = new JToggleButton("Cadastrar");
		botaoCadastro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botaoCadastro.setBounds(144, 197, 124, 21);
		contentPane.add(botaoCadastro);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/res/fundoLogin.jpg")));
		lblNewLabel_1.setBounds(-11, 0, 353, 238);
		contentPane.add(lblNewLabel_1);
		
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MenuView telaDeMenu = new MenuView();
				telaDeMenu.setVisible(true);
			}
		});
		
		botaoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormCadastroView telaDeCadastro = new FormCadastroView();
				telaDeCadastro.setVisible(true);
			}
		});

	}
}
