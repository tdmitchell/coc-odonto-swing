
public class ContaPoupanca extends Conta {

//Construtor	
	public ContaPoupanca(String numeroConta) {
		super(numeroConta, 0);
	}

//M�todos	
	//M�todo Atualiza��o da Conta por uma taxa							s� para Conta Poupan�a!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//	@Override
	public void atualizaConta(double taxaSelic){
		super.setSaldo(super.getSaldo()*(1+taxaSelic/100));
	}


}
