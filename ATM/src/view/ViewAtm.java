package view;

import controller.Atm;
import model.Conta;
import tools.easyIO;

public class ViewAtm {
	
	private static easyIO io = new easyIO();
	private Atm GAtm; 
	
	public ViewAtm() {
		GAtm = new Atm();
		menuAtm();
	}
	
	public void menuAtm() {
		int op;
		do {
			io.writeL("Escolha uma opcao");
			io.writeL("1. Criar Conta");
			io.writeL("2. Entrar na conta");
			io.writeL("0. Sair");
			op = io.readN();
			switch (op) {
			case 1:
				criarConta();
				break;
			case 2:
				entrarConta();
				break;
			}
			
		}while(op!=0);
	}
	
	public void menuConta(int num_conta) {
		int op;
		do {
			io.writeL("\nConta num: " + num_conta);
			io.writeL("Escolha uma opcao");
			io.writeL("1. Levantar");
			io.writeL("2. Depositar");
			io.writeL("3. Transferir");
			io.writeL("4. Detalhes conta");
			io.writeL("0. Sair");
			op = io.readN();
			switch (op) {
			case 1:
				if (GAtm.levantar(num_conta, quantia())) {
					io.writeL("Quantia levantada!");
				} else {
					io.writeL("Não foi possível levantar essa quantia!");
				}
				break;
			case 2:
				if (GAtm.depositar(num_conta, quantia())) {
					io.writeL("Quantia depositada!");
				} else {
					io.writeL("Não foi possível depositar!");
				}
				break;
			case 3:
				if (GAtm.transferir(num_conta, transferir(), quantia())) {
					
				} else {
					io.writeL("Não foi possível fazer a transferência!");
				}
				break;
			case 4:
				mostrarDetalhe(GAtm.getContaByIndex(GAtm.getContaByNum((num_conta))));
				break;
			}
			
		}while(op!=0);
	}
	
	public void mostrarDetalhe(Conta c) {
		io.writeL("\nNumero da conta: " + c.getNumero());
		io.writeL("Nome do titular: " + c.getTitular().getNome());
		io.writeL("Saldo da conta:" + c.getSaldo());
	}
	
	public double quantia() {
		io.writeL("Introduza a quantia");
		return io.readD();
	}

	
	public int transferir() {
		io.writeL("Introduza o numero da conta do destino");
		return io.readN();
	}
	
	public void criarConta() {
		
		io.writeL("\nIntroduza o Nome do titular");
		String nome_titular = io.readS();
		
		io.writeL("Introduza o Numero da conta");
		int num_conta = io.readN();
		
		io.writeL("Introduza o Saldo Inicial da Conta");
		double saldo_inicial = io.readD();
		
		GAtm.criarConta(nome_titular, num_conta, saldo_inicial);
	}
	
	public void entrarConta() {
		io.writeL("\nIntroduza o Numero da conta");
		int num_conta = GAtm.entrarConta(io.readN());
		if(num_conta!=-1) {
			menuConta(num_conta);
		} else {
			io.writeL("\nConta com esse numero inexistente");
		}
	}
}
