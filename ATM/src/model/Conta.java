package model;

public class Conta {
	private Pessoa titular;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}

	public Conta(Pessoa titular, int numero, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}

	public Pessoa getTitular() {
		return titular;
	}

	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean depositar(double quantia) {
		this.saldo+=quantia;
		return true;
	}
	
	public boolean levantar(double quantia) {
		if (quantia <= saldo) {
			this.saldo-=quantia;
			return true;
		}
		return false;
	}
	
}
