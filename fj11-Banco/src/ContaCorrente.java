
public class ContaCorrente extends Conta implements Tributavel {
//Declarando
	private double tributo;
	
//Construtor	
	ContaCorrente(String numeroConta, double limite) {
		super(numeroConta, limite);
	}

//M�todos	
	//M�todo Atualiza��o da Conta por uma taxa							s� para Conta Poupan�a!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	@Override
	public void atualizaConta(double taxaSelic) {
	}
	
	//Implementando Interface Tributavel
	@Override
	public double calculaTributos() {
//		return super.getSaldo() * 0.01;
		this.tributo = super.getSaldo() * 0.01;
		this.saca(tributo);
		return this.tributo;

	}

}
