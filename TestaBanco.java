package mrbank;

public class TestaBanco {

	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); //Criar uma instância = copia
//		pessoaNumero1.nome = "Maria do Bairro";
//		pessoaNumero1.profissao = "Agricultora";
//		pessoaNumero1.cpf = "643.829.641-48";
//		System.out.println("Nome: "+pessoaNumero1.nome);
//		System.out.println("Profissão: "+pessoaNumero1.profissao);
//		System.out.println("CPF: "+pessoaNumero1.cpf);
//				
//		PessoaNumero1.rg
//		
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "João dos Tomates";
//		System.out.println("========================");
//		System.out.println("Nome: "+pessoaNumero2.nome);
//		System.out.println("Nome: "+ pessoaNumero1.nome);
//		
//		Pessoa pessoaNova = new Pessoa(); //Instanciar a classe pessoa
//		pessoaNova.setNome("José das Couves");
//		System.out.println("Nome: "+pessoaNova.getNome());
		
//		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates", "259.800.966-55", "123,456-78");
		
//		System.out.println("Nome "+pessoaComConstrutor1.getNome());
//		System.out.println("CPF: " +pessoaComConstrutor1.getCpf());
//		System.out.println("RG: "+ pessoaComConstrutor1.getRg());
		
		
		PessoaFisica pfFlavia = new PessoaFisica();
		pfFlavia.setNome("Meire-Rosa");
		pfFlavia.setEmail("meirematematica");
		pfFlavia.setTelefone("21971549772");
		pfFlavia.setCpf("879.359.983-88");
		pfFlavia.setProfissao("Professora");
		pfFlavia.setRg("");
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(10000); >>Não se deve operar diretamente esta infor
		conta1.setTitular(pfFlavia);
		conta1.depositar(100000);
		
		
		
		
		
		System.out.println("Agência: "+conta1.getAgencia());
		System.out.println("Conta: "+conta1.getNumeroConta());
		System.out.println("Saldo: "+ conta1.getSaldo());
		System.out.println("Titular: "+conta1.getTitular().getNome());
		System.out.printf("Saldo Atual: R$%.2f\n ",+conta1.getSaldo());
		
		
		Conta conta2 = new Conta();//Aqui pode criar com o método construtor
		conta2.setAgencia(5582);
		conta2.setNumeroConta(2234);
		
		conta1.transferir(10000, conta2);
		
		conta1.sacar(20);
		
		//if(conta1.sacar(20)) {
			//System.out.println();
		//}
		
		
		System.out.println("Saldo Atual Meire: R$ "+conta1.getSaldo());
		System.out.println("Saldo Atual Marcos: R$ "+conta2.getSaldo());
	
	
	ContaCorrente cc1 = new ContaCorrente();
	cc1.depositar(1000);
	System.out.println("Saldo:" + cc1.getSaldo());
	System.out.println("Limite:" + cc1.getLimit());
	cc1.sacar(1500);
	System.out.println("Saldo"+cc1.getSaldo());
	System.out.println("SaldocomLimite:"+cc1.getLimit());
	
	}
}
