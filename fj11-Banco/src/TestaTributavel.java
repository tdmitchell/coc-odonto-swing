
public class TestaTributavel {

	public static void main(String[] args) {
		// Criando Cliente
		Cliente cl1 = new Cliente();
		cl1.setNome("Theo");
		cl1.setSobrenome("Mitchell");
		cl1.setCpf("111.888.222.00");

		Cliente cl2 = new Cliente();
		cl2.setNome("Lauciana");
		cl2.setSobrenome("Mitchell");
		cl2.setCpf("222.666.888.99");

		// Criando Contas e Seguro de Vida
		ContaCorrente c1 = new ContaCorrente("123456-7", 2000);
		c1.setTitular(cl1);

		Conta c2 = new ContaCorrente("987654-3", 5000);
		c2.setTitular(cl2);
		
		SeguroDeVida sv1 = new SeguroDeVida();
		sv1.setNumeroSeguro("999.999-1");
		sv1.setTitular(cl1);
		sv1.setValorContratado(1000000);
		sv1.setContaCorrente(c1);

		//Fazendo Polimorfismo para a conta c1
//		Tributavel t = c1;
		
		// Depositando
		System.out.println("-----Depositando 1.000 em c1");
		c1.deposita(1000);
		System.out.println("-----Depositando 10.000 em c2");
		c2.deposita(10000);
				
		// Calculando Tributos
		System.out.println("Tributo da Conta c1 (1%): "+c1.calculaTributos());
//		System.out.println("Tributo da Conta c1 (ref Tributavel): "+t.calculaTributos());
//		System.out.println("Tributo da Conta c1 (ref Tributavel): "+t.getSaldo());	//PQ não está aceitando????????
//		System.out.println("Tributo da Conta c1 (1%): "+c2.calculaTributos());		//PQ não está aceitando???????? a referencia é de uma conta para um objeto conta corrente
		System.out.println("Tributo do Seguro de Vida (c1): "+sv1.calculaTributos());
		c1.mostraConta();
//		c2.mostraConta();
		
		
		
		

	}

}
