package br.com.cocodonto.modelo.entidade;

public class Contato {
	private String email;
	private String telefone;
	private String celular;

//Construtor
	public Contato() {
	}

//M�todos	
	//Getters & Setters
	public String getE() {
		return email;
	}
	public void setE(String e) {
		this.email = e;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}

	//M�todo hashCode()
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}
	
	//M�todo equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	//ToString()
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contato [email= ")
				.append(email)
				.append(", telefone= ")
				.append(telefone)
				.append(", celular= ")
				.append(celular)
				.append(" ]");
		return builder.toString();
	}
	

	
	
	
	
}