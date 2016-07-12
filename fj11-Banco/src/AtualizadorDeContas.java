
public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;

//Construtor
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
//M�todos
	//M�todo para gerar relat�rio
	public void rodaRelatorio(Conta c){
		System.out.println("Antes da Atualiza��o");
		c.mostraConta();
		System.out.println("Atualizando");
		c.atualizaConta(selic);
		this.saldoTotal += c.getSaldo();
		System.out.println("Depois da Atualiza��o");
		c.mostraConta();
		System.out.println("Saldo Total depois da Atualiza��o: "+this.saldoTotal);
	}

	//Getters & Setters
	public double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}



}
