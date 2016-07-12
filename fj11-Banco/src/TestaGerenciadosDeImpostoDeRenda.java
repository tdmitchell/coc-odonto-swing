
public class TestaGerenciadosDeImpostoDeRenda {

	public static void main(String[] args) {
		// Criando Cliente
		Cliente cl1 = new Cliente();
		cl1.setNome("Theo");
		cl1.setSobrenome("Mitchell");
		cl1.setCpf("111.888.222-00");

		// Criando Contas e Seguro de Vida
		ContaCorrente c1 = new ContaCorrente("123456-7", 2000);
		c1.setTitular(cl1);
		c1.deposita(1000);

		SeguroDeVida sv1 = new SeguroDeVida();
		sv1.setNumeroSeguro("999.999-1");
		sv1.setTitular(cl1);
		sv1.setValorContratado(1000000);
		sv1.setContaCorrente(c1);
		
		//Criando Gerenciados de IR
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		gerenciador.adiciona(c1);
		System.out.println("Total do IR: "+gerenciador.getTributo());
		System.out.println("Total de IR Acumulado: "+gerenciador.getTotalIR());
		gerenciador.adiciona(sv1);
		System.out.println("Total do IR: "+gerenciador.getTributo());
		System.out.println("Total de IR Acumulado: "+gerenciador.getTotalIR());
		System.out.println();
		c1.mostraConta();

		
		
		
	}

}
