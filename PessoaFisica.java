package mrbank;

public class PessoaFisica extends PessoaHeranca{//gcuf
	private String cpf;
	private String rg;
	private String profissao;
	
	public PessoaFisica() {
		
	}
	public String getCpf() {//gcuf
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public PessoaFisica(String cpf, String rg, String profissao) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}
	
	
	
}
