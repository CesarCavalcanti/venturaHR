package venturaHRcadastro.model.domain;

public abstract class Usuario {
	
	private String nome;
	private String endereco;
	private String fone;
	private String email;
	private String senha;
	private String senhaConfirmada;

	public Usuario(String nome, String endereco, String fone, String email, String senha, String senhaConfirmada) {
		this.nome = nome;
		this.endereco = endereco;
		this.fone = fone;
		this.email = email;
		this.senha = senha;
		this.senhaConfirmada = senhaConfirmada;
	}


	public Usuario() {
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenhaConfirmada() {
		return senhaConfirmada;
	}
	public void setSenhaConfirmada(String senhaConfirmada) {
		this.senhaConfirmada = senhaConfirmada;
	}
	
	
}
