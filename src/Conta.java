
public abstract class Conta implements InterfaceDaConta {
	
	private static final int NUMERO_AGENCIA = 1;
	private static int NUMERO_CONTA = 1;
	
	protected int agencia;
	protected int numeroDaConta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = NUMERO_AGENCIA;;
		this.numeroDaConta = NUMERO_CONTA++;
		this.cliente = cliente;
		
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;	
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirDadosContas() {
		
		System.out.println(String.format("Titular: %s", this.cliente.getNome() + " " + this.cliente.getSobrenome()));
		System.out.println(String.format("Email: %s", this.cliente.getEmail()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da Conta: %d", this.numeroDaConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Tubank, o banco da Tua vida!"));
	}
}

	


