package fag;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objetos.*;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Mesa> listaMesas = new ArrayList<Mesa>();
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		
		System.out.println("Olá, oque deseja fazer:");
		System.out.println("[1] Gerenciar funcionários"
						 + "[2] Gerenciar mesas"
						 + "[3] Gerenciar cardapio"
						 + "[4] Gerenciar pedidos"
						 + "[5] Extrair relatórios"
						 + "----------------------------");
		Integer opcaoMenu = scan.nextInt();
		
		switch (opcaoMenu) {
			case 1:
				// Gerenciar funcionários
				// Implementar as funções criadas CadastraCarcom e demais para gerenciar os funcionários,
				// Eles devem ser listados na lista ListaMesas
				break;
			case 2:
				System.out.println("[1]");
				break;
			case 3:
				// Gerenciar cardapio
				// Implementar função para gerenciar o cardapio, como cadastrar itens e mudar a disponibilidade
				break;
			case 4:
				// Gerenciar pedidos
				text;
				break;
			case 5:
				// Extrair relatórios
				text;
				break;
			default:
				System.out.println("Ops, esta opção não existe!");
		}
		}
		
		
		
		// Gestão funcionários
		public static Funcionario CadastraCarcom(String nome, Integer id) {
			return new Funcionario (nome,id,1);
		}
		public static Funcionario CadastraCozinheiro(String nome, Integer id) {
			return new Funcionario (nome,id,2);
		}
		public static Funcionario CadastraGerente(String nome, Integer id) {
			return new Funcionario (nome,id,3);
		}
		
		// Gerenciamento cardápio
		
		// Cadastro mesas
		public static Mesa CadastraMesa(ArrayList listaMesas, String numeromesa, String qtdpedido, String capacidadepessoa, Boolean disponibilidade) {
			return new Mesa(numeromesa, qtdpedido, capacidadepessoa, disponibilidade);
		}
		
		// Registro de pedidos
		
		// Acompanhamento de vendas por funcionário
		
		// Fechamento de conta e faturamento
		
		// Relatório de faturamento por restaurante

	}

}
