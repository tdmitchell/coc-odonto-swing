
public class SeguroDeVida implements Tributavel{
//Declarando e Atribuindo
	private String numeroSeguro;
	private double valorContratado;
	private Cliente titular;
	private ContaCorrente contaCorrente;
	private double tributo=42;
		
//Métodos
	//Método da Interface Tributável
	@Override
	public double calculaTributos() {
		this.getContaCorrente().saca(tributo);;
		return this.tributo;
	}
	
	//Getters & Setters
	public void setNumeroSeguro(String numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}
	public void setValorContratado(double valorContratado) {
		this.valorContratado = valorContratado;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	
	
}
