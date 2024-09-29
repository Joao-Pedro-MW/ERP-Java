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
		List<Pedido> listaPedidos = new ArrayList<Pedido>();
		List<Cardapio> listaCardapio = new ArrayList<Cardapio>();
		
		// Ainda vai ser implementado a parte de limitar acesso conforme o antigo principal_old.java
		System.out.println("Olá, oque deseja fazer:");
		System.out.println("[1] Gerenciar funcionários"
						 + "[2] Gerenciar mesas"
						 + "[3] Gerenciar cardapio"
						 + "[4] Gerenciar pedidos"
						 + "[5] Extrair relatórios"
						 + "[6] Sair"
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
				// Opção de mudar status de cardapio ficou dentro das opções de pedido
				break;
			case 4:
				System.out.println("[1] Cadastrar pedido"
								 + "[2] Ver total");
				Integer opcaoPedido = scan.nextInt();
				switch(opcaoPedido) {
					case 1:
						System.out.print("Informe o número da mesa:");
						int numeroMesa = scan.nextInt();
						System.out.print("Informe seu ID:");
						int idGarcom = scan.nextInt();
						System.out.println("Informe o número do prato:");
						int codigoPrato = scan.nextInt();
						listaPedidos.add(CadastraPedido(numeroMesa, idGarcom, codigoPrato));
						System.out.println("Pedido enviado!");
				break;
					}
			case 5:
				// Extrair relatórios
				System.out.println("Bzzz");;
				break;
			case 6:
				System.out.println("Você escolheu sair :)");
				
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
	
	// Pedidos
	public static Pedido CadastraPedido(Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato, Integer qtdItens) {
		// Implementar redução de estoque
		return new Pedido(numeroMesa, idGarcom, cardapioCodPrato, qtdItens);
	}
	
	public static void TotalPedido(Integer numeroMesa,Integer idGarcom, Integer cardapioCodPrato) {
		Double total = 
	}
	// Acompanhamento de vendas por funcionário
	
	// Fechamento de conta e faturamento
	
	// Relatório de faturamento por restaurante

}
