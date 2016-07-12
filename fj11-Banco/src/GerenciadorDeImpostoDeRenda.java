
public class GerenciadorDeImpostoDeRenda {
//Declarando e Atribuindo	
	private double tributo;
	private double totalIR;
	
//Construtor
	
	
//Métodos	
	//
	void adiciona (Tributavel t){
		System.out.println("Adicionando tributável: "+t);
		this.tributo = t.calculaTributos();					//PQ quando coloca esta linha altera o valor do totalIR??????????? 
		this.totalIR += t.calculaTributos();
	}
	
	//Getters & Setters
	public double getTotalIR() {
		return this.totalIR;
	}
	public double getTributo() {
		return tributo;
	}

	
	
}
