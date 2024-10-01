package fag;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objetos.*;

public class principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Mesa> listaMesas = new ArrayList<Mesa>();
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		List<Pedido> listaPedidos = new ArrayList<Pedido>();
		List<Cardapio> listaCardapio = new ArrayList<Cardapio>();
		
		listaFuncionarios.add(new Funcionario("Kaique",05,1));


		ArrayList<CardapioBebidas> cardapiob = new ArrayList<CardapioBebidas>();
		
		ArrayList<CardapioBebidas> listaCardapioBebidas = new ArrayList<CardapioBebidas>();

		// Ainda vai ser implementado a parte de limitar acesso conforme o antigo principal_old.java
		System.out.println("Olá, oque deseja fazer:\n");
		System.out.println("[1] Gerenciar funcionários\n"
						 + "[2] Gerenciar mesas\n"
						 + "[3] Gerenciar cardapio\n"
						 + "[4] Gerenciar pedidos\n"
						 + "[5] Extrair relatórios\n"
						 + "[6] Sair\n"
						 + "----------------------------");
		Integer opcaoMenu = scan.nextInt();
		
		switch (opcaoMenu) {
			case 1:
				// Gerenciar funcionários
				// Implementar as funções criadas CadastraCarcom e demais para gerenciar os funcionários,
				// Eles devem ser listados na lista ListaMesas
				int escolha;
				System.out.println("[1] Mostrar Funcionários\n"+"[2] Adicionar Funcionário\n[3] Excluir Funcionario");
				escolha = scan.nextInt();
				
				if (escolha == 1) {
					for(Funcionario listaf : listaFuncionarios) {
						System.out.println(listaf);
					}
					if (escolha == 2) {
						System.out.println("Nome:");
						String nome = scan.next();
						System.out.println("Escolha o cargo:\n[1] Garçom\n[2] Cozinheiro\n[3] Gerente");
		                int cargo = scan.nextInt();
		                
		                int novoId = listaFuncionarios.size() + 1;  // Gera ID baseado no tamanho da lista
		                
		                listaFuncionarios.add(new Funcionario(nome, novoId, cargo));
		                
		                System.out.println("Funcionário adicionado com sucesso.");
					}
					if(escolha == 3 ) {
						System.out.println("Insira o nome do funcionario corretamente");
						String nome = scan.next();
						String removenome;
						boolean encontrado = false;

						
						for (int i = 0; i < listaFuncionarios.size(); i++) {
						    // Verifica se o nome do funcionário corresponde ao nome que você deseja remover
						    if (listaFuncionarios.get(i).getNome().equals(removenome)) {
						        listaFuncionarios.remove(i); // Remove o funcionário encontrado
						        encontrado = true;
						        System.out.println("Item removido com sucesso!");
						        break; // Interrompe o loop já que o funcionário foi encontrado e removido
						    }
						}

						if (!encontrado) {
						    System.out.println("Funcionário não encontrado.");
						}
							
					}
				}
				
				
				
				break;
			case 2:
				System.out.println("[1]");
				break;
			case 3:
				// Gerenciar cardapio
				// Implementar função para gerenciar o cardapio, como cadastrar itens e mudar a disponibilidade
				// Opção de mudar status de cardapio ficou dentro das opções de pedido

		
					System.out.println("Escolha uma opção que deseja:\n "
							+ "[1]Cadastrar pratos "
							+ "\n [2]Cadastrar bebidas "
							+ "\n [3]Remover item "
							+ "\n [4]Atualizar disponibilidade");
					
					int cadinput = scan.nextInt();
					
					if (cadinput == 1) {
						System.out.println("Escreva o nome do prato:");
						String nomePrato = scan.next();
						System.out.println("Escreva o codigo do item:");
						int codPrato = scan.nextInt();
						System.out.println("Escreva o valor do prato:");
						float precoPrato = scan.nextFloat();
						System.out.println("Escreva a disponibilidade do prato:");
						int dispPrato = scan.nextInt();
		
						Cardapio novoPrato = new Cardapio(nomePrato, codPrato, precoPrato, dispPrato);
						listaCardapio.add(novoPrato);

	
				System.out.println("Escolha uma opção que deseja:\n [1]Cadastrar pratos \n [2]Cadastrar bebidas \n [3]Remover item \n [4]Atualizar disponibilidade");
				int cadinput = scan.nextInt();
				
				if (cadinput == 1) {
					System.out.println("Escreva o nome do prato:");
					String nomePrato = scan.next();
					System.out.println("Escreva o codigo do item:");
					int codPrato = scan.nextInt();
					System.out.println("Escreva o valor do prato:");
					float precoPrato = scan.nextFloat();
					System.out.println("Escreva a disponibilidade do prato:");
					int dispPrato = scan.nextInt();
	
					Cardapio novoPrato = new Cardapio(nomePrato, codPrato, precoPrato, dispPrato);
					listaCardapio.add(novoPrato);
				}
				if (cadinput == 2) {
					System.out.println("Escreva o nome da bebida:");
					String nomeBebida = scan.next();
					System.out.println("Escreva o codigo do item:");
					int codBebida = scan.nextInt();
					System.out.println("Escreva o valor da Bebida:");
					float precoBebida = scan.nextFloat();
					System.out.println("Escreva a disponibilidade da Bebida:");
					int dispBebida = scan.nextInt();
	
					CardapioBebidas novaBeb = new CardapioBebidas(nomeBebida, codBebida, precoBebida, dispBebida);
					listaCardapioBebidas.add(novaBeb);
				}
	
				if (cadinput == 3) {
					System.out.println("Escreva o código do item que deseja remover:");
					int codRemover = scan.nextInt();
					boolean encontrado = false;
	
					for (int i = 0; i < listaCardapio.size(); i++) {
						if (listaCardapio.get(i).getcodPrato() == codRemover) {
							listaCardapio.remove(i);
							encontrado = true;
							System.out.println("Item removido com sucesso!");
	
						}

					}
	
					if (!encontrado) {
						for (int i = 0; i < listaCardapioBebidas.size(); i++) {
							if (listaCardapioBebidas.get(i).getcodBebida() == codRemover) {
								listaCardapioBebidas.remove(i);
								encontrado = true;
								System.out.println("Item removido com sucesso!");
	
							}
						}
					}
				}
				if (cadinput == 4) {
					System.out.println("Escreva o código do item que deseja atualizar:");
					int codAtualizar = scan.nextInt();
					boolean encontrado = false;
					for (Cardapio prato : listaCardapio) {
						if (prato.getcodPrato() == codAtualizar) {
							System.out.println("Digite a nova disponibilidade:");
							int novaDisp = scan.nextInt();
							prato.setdispPrato(novaDisp);
							encontrado = true;
							System.out.println("Disponibilidade atualizada com sucesso!");
	
						}
					}
					if (!encontrado) {
						for (CardapioBebidas bebida : listaCardapioBebidas) {
							if (bebida.getcodBebida() == codAtualizar) {
								System.out.println("Digite a nova disponibilidade:");
								int novaDisp = scan.nextInt();
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
				for (Cardapio prato : listaCardapio) {
					System.out.println(" " + prato.prato());
	
				}
	
				for (CardapioBebidas bebida : listaCardapioBebidas) {
					System.out.println(" " + bebida.bebida());
				}
	
				System.out.println("Você deseja adicionar mais alguma alteração? ( sim/nao )");
				String resposta = scan.next();
				if (resposta.equals("nao")) {
	
				}
				scan.close();
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

						//listaPedidos.add(CadastraPedido(numeroMesa, idGarcom, codigoPrato));

						System.out.println("Informe a quantidade do prato:");
						int quantidadeItems = scan.nextInt();
						listaPedidos.add(CadastraPedido(listaPedidos,numeroMesa, idGarcom, codigoPrato,quantidadeItems));

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
	public static Pedido CadastraPedido(List listaPedidos,Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato, Integer qtdItens) {
		// Implementar redução de estoque
		Integer idPedido = listaPedidos.size() + 1;
		return new Pedido(idPedido,numeroMesa, idGarcom, cardapioCodPrato, qtdItens);
	}
	

	//public static void TotalPedido(Integer numeroMesa,Integer idGarcom, Integer cardapioCodPrato) {
		//Double total = 
	//}

	public static void TotalPedido(Integer numeroMesa,Integer idGarcom, Integer cardapioCodPrato) {
		
	}
	// Acompanhamento de vendas por funcionário
	
	// Fechamento de conta e faturamento
	
	// Relatório de faturamento por restaurante

}
