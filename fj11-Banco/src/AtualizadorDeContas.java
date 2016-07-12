
public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;

//Construtor
	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	
//Métodos
	//Método para gerar relatório
	public void rodaRelatorio(Conta c){
		System.out.println("Antes da Atualização");
		c.mostraConta();
		System.out.println("Atualizando");
		c.atualizaConta(selic);
		this.saldoTotal += c.getSaldo();
		System.out.println("Depois da Atualização");
		c.mostraConta();
		System.out.println("Saldo Total depois da Atualização: "+this.saldoTotal);
	}

	//Getters & Setters
	public double getSaldoTotal() {
		return saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}



}
