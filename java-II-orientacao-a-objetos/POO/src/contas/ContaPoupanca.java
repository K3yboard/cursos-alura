package contas;

public class ContaPoupanca extends Conta {

	@Override
	void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa * 3);
	}

	// public void atualiza(double taxa) {
	// super.atualiza(taxa * 3);
	// }
}
