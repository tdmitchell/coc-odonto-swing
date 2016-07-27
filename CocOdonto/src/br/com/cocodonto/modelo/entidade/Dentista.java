/**
 * 
 */
package br.com.cocodonto.modelo.entidade;

/**
 * @author TDM-Estudo
 *
 */
public class Dentista {

	private int id;
	private String cro;
	private String nome;
	private String rg;
	private String cpf;
	private SexoType sexo; // Enum que representa o sexo do paciente
	private Endereco endereco;
	private Contato contato;

// Construtor
	public Dentista(int id, String cro, String nome, String rg, String cpf, SexoType sexo, Endereco endereco,
			Contato contato) {
		this(id, cro, nome, rg, cpf, sexo);
		this.endereco = endereco;
		this.contato = contato;
	}

	public Dentista(int id, String cro, String nome, String rg, String cpf, SexoType sexo) {
		this(cro, nome, rg, cpf, sexo);
		this.id = id;

	}
	
	public Dentista(String cro, String nome, String rg, String cpf, SexoType sexo) {
		this();
		this.cro = cro;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}
		
	public Dentista() {
		super();
	}

// Métodos
	// Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCro() {
		return cro;
	}
	public void setCro(String cro) {
		this.cro = cro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public SexoType getSexo() {
		return sexo;
	}
	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}

	//Método hashCode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((cro == null) ? 0 : cro.hashCode());
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	//Método equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dentista other = (Dentista) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (cro == null) {
			if (other.cro != null)
				return false;
		} else if (!cro.equals(other.cro))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	//Método toString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dentista [id=").append(id).append(", cro=").append(cro).append(", nome=").append(nome)
				.append(", rg=").append(rg).append(", cpf=").append(cpf).append(", sexo=").append(sexo)
				.append(", endereco=").append(endereco).append(", contato=").append(contato).append("]");
		return builder.toString();
	}


	

	
	
}
