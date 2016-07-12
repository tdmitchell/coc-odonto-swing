
public class TestaConta {

	public static void main(String[] args) {
		//Criando Cliente
		Cliente cl1 = new Cliente();
		cl1.setNome("Theo");
		cl1.setSobrenome("Mitchell");
		cl1.setCpf("111.888.222.00");
		
		Cliente cl2 = new Cliente();
		cl2.setNome("Lauciana");
		cl2.setSobrenome("Mitchell");
		cl2.setCpf("222.666.888.99");
		
		//Criando Contas
		Conta c1 = new ContaCorrente("123456-7", 2000);
		c1.setTitular(cl1);
		c1.mostraConta();

		Conta c2 = new ContaCorrente("987654-3", 5000);
		c2.setTitular(cl2);
		c2.mostraConta();
		
		Conta c3 = new ContaPoupanca("111111-0");
		c3.setTitular(cl2);
		c3.deposita(200000);
		
		//Depositando 
		System.out.println("-----Depositando 1000 em c1");
		c1.deposita(1000);
		c1.mostraConta();
		System.out.println("-----Depositando 500 em c2");
		c2.deposita(500);
		c2.mostraConta();
		
		//Sacando (sem o Limite) 
		System.out.println("-----Sacando 200 de c1 (sem o Limite)");
		c1.saca(200);
		c1.mostraConta();

		//Sacando (com o Limite) 
		System.out.println("-----Sacando 1000 de c1 (com o Limite)");
		c1.saca(1000);
		c1.mostraConta();
		
		//Sacando 6000 (fora Limite)
		System.out.println("-----Sacando de c1 (fora Limite)");
		c1.saca(6000);
		c1.mostraConta();

		//Sacando valor negativo
		System.out.println("-----Sacando valor negativo de c1 ");
		c1.saca(-100);
		c1.mostraConta();
		
		//Sacando ZERO
		System.out.println("-----Sacando ZERO de c1 ");
		c1.saca(0);
		c1.mostraConta();

		//Depositando 
		System.out.println("-----Depositando 400 em c1 ");
		c1.deposita(400);
		c1.mostraConta();

		//Transferindo
		System.out.println("-----Transferindo 300 para c1");
		c2.mostraConta();		
		c2.transfere(300, c1);
		c1.mostraConta();
		c2.mostraConta();
		
		//Transferindo
		System.out.println("-----Transferindo 7000 para c1");
		c2.mostraConta();		
		c2.transfere(7000, c1);
		c1.mostraConta();
		c2.mostraConta();

		//Atualizando Contas
		AtualizadorDeContas abc = new AtualizadorDeContas(10); 
		abc.rodaRelatorio(c1);
		abc.rodaRelatorio(c2);
		abc.rodaRelatorio(c3);
		
	}

}
