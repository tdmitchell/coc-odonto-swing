
public class Cliente {
//Declarando e Atribuindo
	private String nome;
	private String sobrenome;
	private String cpf;

//Construtor
	Cliente(){
	}
	
	Cliente (String nome, String sobrenome, String cpf){
		this.nome = nome;
		this. sobrenome = sobrenome;
		this.cpf = cpf;
	}
		
//M�todos
	//Getters & Setters
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
