

public class DataVERIFICAR_UsoOuNao {
	int dia, mes, ano;
	
	//Método Mostra data Formatada
	void dataFormatada(){
		System.out.println("Data de Entrada: "+ this.dia + "/" + this.mes +"/" + this.ano);
	}

//GETTERS e SETTERS
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
}
