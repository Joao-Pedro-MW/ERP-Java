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
<<<<<<< Updated upstream
				// Opção de mudar status de cardapio ficou dentro das opções de pedido
=======
		Scanner sc = new Scanner(System.in);
		boolean controleFluxo = true;
		ArrayList<Cardapio> cardapio = new ArrayList<Cardapio>();
		ArrayList<CardapioBebidas> cardapiob = new ArrayList<CardapioBebidas>();

		while (controleFluxo) {
			System.out.println("Escolha uma opção que deseja:\n [1]Cadastrar pratos \n [2]Cadastrar bebidas \n [3]Remover item \n [4]Atualizar disponibilidade");
			int cadinput = sc.nextInt();

			if (cadinput == 1) {
				System.out.println("Escreva o nome do prato:");
				String nomePrato = sc.next();
				System.out.println("Escreva o codigo do item:");
				int codPrato = sc.nextInt();
				System.out.println("Escreva o valor do prato:");
				float precoPrato = sc.nextFloat();
				System.out.println("Escreva a disponibilidade do prato:");
				int dispPrato = sc.nextInt();

				Cardapio novoPrato = new Cardapio(nomePrato, codPrato, precoPrato, dispPrato);
				cardapio.add(novoPrato);
			}
			if (cadinput == 2) {
				System.out.println("Escreva o nome da bebida:");
				String nomeBebida = sc.next();
				System.out.println("Escreva o codigo do item:");
				int codBebida = sc.nextInt();
				System.out.println("Escreva o valor da Bebida:");
				float precoBebida = sc.nextFloat();
				System.out.println("Escreva a disponibilidade da Bebida:");
				int dispBebida = sc.nextInt();

				CardapioBebidas novaBeb = new CardapioBebidas(nomeBebida, codBebida, precoBebida, dispBebida);
				cardapiob.add(novaBeb);
			}

			if (cadinput == 3) {
				System.out.println("Escreva o código do item que deseja remover:");
				int codRemover = sc.nextInt();
				boolean encontrado = false;

				for (int i = 0; i < cardapio.size(); i++) {
					if (cardapio.get(i).getcodPrato() == codRemover) {
						cardapio.remove(i);
						encontrado = true;
						System.out.println("Item removido com sucesso!");

					}
				}

				if (!encontrado) {
					for (int i = 0; i < cardapiob.size(); i++) {
						if (cardapiob.get(i).getcodBebida() == codRemover) {
							cardapiob.remove(i);
							encontrado = true;
							System.out.println("Item removido com sucesso!");

						}
					}
				}
			}
			if (cadinput == 4) {
				System.out.println("Escreva o código do item que deseja atualizar:");
				int codAtualizar = sc.nextInt();
				boolean encontrado = false;
				for (Cardapio prato : cardapio) {
					if (prato.getcodPrato() == codAtualizar) {
						System.out.println("Digite a nova disponibilidade:");
						int novaDisp = sc.nextInt();
						prato.setdispPrato(novaDisp);
						encontrado = true;
						System.out.println("Disponibilidade atualizada com sucesso!");

					}
				}
				if (!encontrado) {
					for (CardapioBebidas bebida : cardapiob) {
						if (bebida.getcodBebida() == codAtualizar) {
							System.out.println("Digite a nova disponibilidade:");
							int novaDisp = sc.nextInt();
							bebida.setdispBebida(novaDisp);
							encontrado = true;
							System.out.println("Disponibilidade atualizada com sucesso!\n");

						}
					}
				}

				if (!encontrado) {
					System.out.println("Item não encontrado!");
				}
			}

			System.out.println(" LISTA CARDAPIO ");
			for (Cardapio prato : cardapio) {
				System.out.println(" " + prato.prato());

			}

			for (CardapioBebidas bebida : cardapiob) {
				System.out.println(" " + bebida.bebida());
			}

			System.out.println("Você deseja adicionar mais alguma alteração? ( sim/nao )");
			String resposta = sc.next();
			if (resposta.equals("nao")) {
				controleFluxo = false;
			}
		}
		sc.close();
>>>>>>> Stashed changes
				break;
			case 4:
				System.out.println("[1] Cadastrar pedido");
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
	public static Pedido CadastraPedido(Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato) {
		return new Pedido(numeroMesa, idGarcom, cardapioCodPrato);
	}
	
	public static void TotalPedido(Integer numeroMesa,Integer idGarcom, Integer cardapioCodPrato) {
		
	}
	// Acompanhamento de vendas por funcionário
	
	// Fechamento de conta e faturamento
	
	// Relatório de faturamento por restaurante

}
