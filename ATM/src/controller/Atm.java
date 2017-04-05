package controller;

import java.util.ArrayList;

import model.Conta;
import model.Pessoa;
import tools.easyIO;

public class Atm {
	private ArrayList<Conta> contas;
	private static easyIO io = new easyIO();
	
	public Atm() {
		contas = new ArrayList<Conta>();
	}
		
	public void criarConta(String nome_titular, int num_conta, double saldo_inicial) {
		Pessoa p = new Pessoa(nome_titular);
		Conta c =  new Conta(p, num_conta, saldo_inicial);	
		this.contas.add(c);
		
	}
	
	public int entrarConta(int num_conta) {
		if (getContaByNum(num_conta)!=-1) {
			return num_conta;
		} else {
			return -1;
		}
	}
	
	public boolean levantar(int num_conta, double quantia) {
		int index = getContaByNum(num_conta);
		if (index!=-1) {
			return contas.get(index).levantar(quantia);
		}
		return false;
	}
	
	public boolean depositar(int num_conta, double quantia) {
		int index = getContaByNum(num_conta);
		if (index!=-1) {
			return contas.get(index).depositar(quantia);
		}
		return false;
	}
	
	public boolean transferir(int num_conta, int destino, double quantia) {
		int indexO = getContaByNum(num_conta);
		int indexD = getContaByNum(destino);
		if (indexO!=-1 && indexD!=-1) {
			if(contas.get(indexO).levantar(quantia)) {
				return contas.get(indexD).depositar(quantia);
			}
		}
		return false;
	}
		
	public int getContaByNum(int num) {
		for(Conta c:this.contas) {
			if (c.getNumero()==num) {
				return contas.indexOf(c);
			}			
		}
		return -1; 
	}
	
	public Conta getContaByIndex(int index) {
		return contas.get(index);
	}
	
}
