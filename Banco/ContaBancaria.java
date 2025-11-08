package Banco;

public class ContaBancaria {
	private double saldo; // Determina o saldo da conta.

	private double limite; // Determina o limite de crédito do cheque especial.

	
	public ContaBancaria(double valorSaldo, double valorLimite){
		this.saldo = valorSaldo;
		this.limite = valorLimite;
	}


	public double getSaldo(){
		return saldo;
	}

	protected double getLimite(){
		return limite;
	}

	public double getSaldoComLimite(){
		return saldo+limite;
	}

	
	public boolean sacar(double valor) throws ContaException {
	    if (valor > 500) {
	        throw new ContaException("Saque acima do limite permitido");
	    }

	    if (saldo + limite - valor < 0) {
	        throw new ContaException("Saldo insuficiente");
	    }

	    saldo -= valor;
	    return true;
	}

	

	public void depositar(double valor) throws ContaException {
		if(valor > 1000) {
			throw new ContaException("Depósito acima do limite permitido");
		}
		saldo += valor;
		
	}


}
