
public class ContaPoupanca extends Conta {

//Construtor	
	public ContaPoupanca(String numeroConta) {
		super(numeroConta, 0);
	}

//Métodos	
	//Método Atualização da Conta por uma taxa							só para Conta Poupança!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//	@Override
	public void atualizaConta(double taxaSelic){
		super.setSaldo(super.getSaldo()*(1+taxaSelic/100));
	}


}
