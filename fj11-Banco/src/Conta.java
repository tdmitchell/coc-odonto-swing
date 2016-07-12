
abstract class Conta {
	
//Declarando e Atribuindo	
	private String numeroConta;
	private double saldo;
	private double limite;
	private double limiteAtual;
	private Cliente titular;
	private boolean saqueEfetuado=false;						//ELIMINAR e transformar o Método saca em booleano!!!!!!
//	private double taxaBancaria=0.10;
	private double taxaBancaria;
	private double taxaBancariaTotal;

		
//Construtores
	Conta(String numeroConta, double limite){
		setNumeroConta(numeroConta);
		setLimite(limite);
		limiteAtual += limite;
	}
	
//Metodos
	//Método Mostra a Conta
/*	public void mostraConta(){
		System.out.println("Conta Numero: "+this.getNumeroConta());
		System.out.println("Titular da Conta: "+this.titular.getNome()+" "+this.getTitular().getSobrenome());
		System.out.println("CPF do Titular: "+this.titular.getCpf());
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("Limite Inicial: "+this.getLimite());
		System.out.println("Limite Atual: "+this.getLimiteAtual());
		System.out.println("Taxa Bancaria Total: "+this.getTaxaBancariaTotal());
		System.out.println("#######################");
	}
*/	
	public void mostraConta(){
		System.out.println("Conta Numero: "+this.getNumeroConta());
		System.out.println("Titular da Conta: "+this.titular.getNome()+" "+this.getTitular().getSobrenome());
		System.out.println("CPF do Titular: "+this.titular.getCpf());
		System.out.printf("Saldo:  %.2f", this.getSaldo());
		System.out.println("");
		System.out.printf("Limite Atual:  %.2f", this.getLimiteAtual());
		System.out.println("");
		System.out.printf("Taxa Bancaria Total:  %.2f", this.getTaxaBancariaTotal());
		System.out.println("");
		System.out.println("#######################");
	}

//	System.out.printf("Programação Progressiva\n");
	
	//Método Deposita
	public void deposita(double valor){
		if(valor>0){
			if(this.limiteAtual+valor <= limite){
				this.setSaldo(this.getSaldo() + (valor - taxaBancaria));
				this.limiteAtual += valor;
				this.taxaBancariaTotal += taxaBancaria;
			} else{
				this.setSaldo(this.getSaldo() + (valor - taxaBancaria));
				this.limiteAtual = limite;
				this.taxaBancariaTotal += taxaBancaria;
			}
		} else
			System.out.println("Operação Inválida!!!!");
		
	}
	
	//Método Saca
	public void saca(double valor){
		if(valor>0){
			if((this.getSaldo()+this.limiteAtual-taxaBancaria)>valor){
				this.setSaldo(this.getSaldo() - (valor + taxaBancaria));
				this.taxaBancariaTotal += taxaBancaria;
				if(this.getSaldo()<0){
					this.limiteAtual += (this.getSaldo());
				}
				this.saqueEfetuado=true;
			} else{
				System.out.println("Saldo Insuficiente!");
			}	
		} else
			System.out.println("Operação Inválida!!!!");
	}

	//Método Transfere
	public void transfere(double valor, Conta conta){
		this.saqueEfetuado=false;
		this.saca(valor);
		if(this.saqueEfetuado==true){
			conta.deposita(valor);
		} else
			System.out.println("Saldo Insuficiente!");
	}
	
	//Método Atualização da Conta por uma taxa							só para Conta Poupança!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	abstract void atualizaConta(double taxaSelic);
	
	//Métodos Getters & Setters
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getLimiteAtual() {
		return limiteAtual;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getTaxaBancariaTotal() {
		return taxaBancariaTotal;
	}
	
	
}
