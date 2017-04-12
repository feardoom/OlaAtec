package model;

public class Carro {
	private String marca;
	private String modelo;
	private int matricula;
	private double preco;
	private int cavalos;
	
	public Carro() {
		
	}

	public Carro(String marca, String modelo, int matricula, double preco, int cavalos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.preco = preco;
		this.cavalos = cavalos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCavalos() {
		return cavalos;
	}

	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	
	
	
}
