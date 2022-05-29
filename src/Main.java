
public class Main {

	public static void main(String[] args) {
		
		Cliente elis = new Cliente();
		elis.setNome("Elis");
		elis.setSobrenome("Regina");
		elis.setEmail("elisdev@gmail.com");
		
		
		Conta cc = new ContaCorrente(elis);
		Conta cp = new ContaPoupanca(elis);
		
		cc.depositar(1000);
		cc.transferir(300, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}
}
