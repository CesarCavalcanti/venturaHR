package venturaHRcadastro.model.domain;

public class Empresa extends Usuario {
	
	private String razao;
	private String cnpj;
	
	
	
	public Empresa(String nome, String endereco, String fone, String email, String senha, String senhaConfirmada,
			String razao, String cnpj, String string) {
		super(nome, endereco, fone, email, senha, senhaConfirmada);
		this.razao = razao;
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "Empresa [razao=" + razao + ", cnpj=" + cnpj + "]";
	}

	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
