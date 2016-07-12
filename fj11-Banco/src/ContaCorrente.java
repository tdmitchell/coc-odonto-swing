
public class ContaCorrente extends Conta implements Tributavel {
//Declarando
	private double tributo;
	
//Construtor	
	ContaCorrente(String numeroConta, double limite) {
		super(numeroConta, limite);
	}

//Métodos	
	//Método Atualização da Conta por uma taxa							só para Conta Poupança!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
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
