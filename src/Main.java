
public class Main {

	public static void main(String[] args) {
		Cliente Joao = new Cliente();
		Joao.setNome("João Barbosa");
		
		Conta cc = new ContaCorrente(Joao);
		Conta poupanca = new ContaPoupanca(Joao);

		cc.depositar(200);
		cc.transferir(30, poupanca);
		cc.sacar(0);
		poupanca.transferir(0, cc);


		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}
