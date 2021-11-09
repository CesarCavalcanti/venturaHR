package venturaHRcadastro.model.domain;

public class Candidato extends Usuario {
	
	private String tipoConta;
	private String cpf;
	
	public Candidato () {
		
	}
	
	public Candidato(String nome, String endereco, String fone, String email, String senha, String senhaConfirmada,
			String tipoConta, String cpf) {
		super(nome,endereco,fone,email,senha,senhaConfirmada);
		this.tipoConta = tipoConta;
		this.cpf = cpf;
	}
	
	



	@Override
	public String toString() {
		return "Candidato [tipoConta=" + tipoConta + ", cpf=" + cpf + "]";
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
	
}
