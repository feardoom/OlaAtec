package model;

public class Venda {
	private int id_venda;
	private Pessoa cliente;
	private Carro carro;
	private int mes;
	
	public Venda() {
		
	}

	public Venda(int id_venda, Pessoa cliente, Carro carro, int mes) {
		super();
		this.id_venda = id_venda;
		this.cliente = cliente;
		this.carro = carro;
		this.mes = mes;
	}

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	
	
}
