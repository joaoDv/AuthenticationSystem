package model;

public class Usuario {
	private int id;
	private String nome_usuario;
	private String senha;
	private String tipo_usuario;
	
	
	
	public Usuario(int id, String nome_usuario, String senha, String tipo_usuario) {
		super();
		this.id = id;
		this.nome_usuario = nome_usuario;
		this.senha = senha;
		this.tipo_usuario = tipo_usuario;
	}
	
	public Usuario( String nome_usuario, String senha, String tipo_usuario) {
		super();
		this.nome_usuario = nome_usuario;
		this.senha = senha;
		this.tipo_usuario = tipo_usuario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
}
