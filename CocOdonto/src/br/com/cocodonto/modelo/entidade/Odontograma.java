/**
 * 
 */
package br.com.cocodonto.modelo.entidade;

/**
 * @author TDM-Estudo
 *
 */
public class Odontograma {
	private int id;

	public Odontograma(int id) {
		super();
		this.id = id;
	}

//Construtor		
	public Odontograma() {
		super();
	}

//Métodos
	//Método hashCode()	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Odontograma other = (Odontograma) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
