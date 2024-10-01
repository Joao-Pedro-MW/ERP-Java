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
		ArrayList<CardapioBebidas> listaCardapioBebidas = new ArrayList<CardapioBebidas>();
		// Ainda vai ser implementado a parte de limitar acesso conforme o antigo principal_old.java
		System.out.println("Olá, oque deseja fazer:\n");
		System.out.println("[1] Gerenciar funcionários\n"
						 + "[2] Gerenciar mesas\n"
						 + "[3] Gerenciar cardapio\n"
						 + "[4] Gerenciar pedidos\n"
						 + "[5] Extrair relatórios\n"
						 + "[6] Sair\n"
						 + "----------------------------zn");
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
		                
		                int novoId = listaFuncionarios.size() + 1;
		                
		                listaFuncionarios.add(new Funcionario(nome, novoId, cargo));
		                
		                System.out.println("Funcionário adicionado com sucesso.");
					}
					if(escolha == 3 ) {
						System.out.println("Insira o nome do funcionario corretamente");
						String nome = scan.next();
						String removenome = "";
						boolean encontrado = false;

						
						for (int i = 0; i < listaFuncionarios.size(); i++) {
						    
						    if (listaFuncionarios.get(i).getNome().equals(removenome)) {
						        listaFuncionarios.remove(i);
						        encontrado = true;
						        System.out.println("Item removido com sucesso!");
						        break;
						    }
						}

						if (!encontrado) {
						    System.out.println("Funcionário não encontrado.");
						}
							
					}
				}
				
				
				
				break;
			case 2:
				
				System.out.println("[1] Mostrar Mesas\n [2] Adicionar Mesa\n [3] Remover Mesa\n");
				int escolhamesa = scan.nextInt();
				
					if (escolhamesa == 1) {
						for(Mesa listamesa : listaMesas) {
							System.out.println(listamesa);
						}
						if (escolhamesa == 2) {
							System.out.println("Número da Mesa");
							String mesa = scan.next();
							System.out.println("Capacidade da mesa");
							String capacidadepessoa = scan.next();
							System.out.println("Informe a Disponibilidade da mesa: [1] Disponível\n [2] Ocupada\n");
							int disponibilidade = scan.nextInt();
							
							listaMesas.add(new Mesa(mesa, capacidadepessoa, disponibilidade));
							
						}
					}

				
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
					// REMOVER INPUT DE TEXTO, MANTER INPUT NÚMERICO
					System.out.println("Você deseja adicionar mais alguma alteração? ( sim/nao )");
			case 4:
					System.out.println("[1] Cadastrar pedido\n"
						 + "[2] Ver total de bebidas\n"
						 + "[3] Ver total de comida\n");
					Integer opcaoPedido = scan.nextInt();
					switch(opcaoPedido) {
							case 1:
							System.out.print("Informe o número da mesa:");
							int numeroMesa = scan.nextInt();
							System.out.print("Informe seu ID de garçom:");
							int idGarcom = scan.nextInt();
							System.out.println("Informe o número do prato:");
							int codigoItem = scan.nextInt();
							System.out.println("Informe a quantidade do prato:");
							int quantidadeItems = scan.nextInt();
							Pedido novoPedido = CadastraPedido(listaPedidos,numeroMesa, idGarcom, codigoItem,quantidadeItems);
							listaPedidos.add(novoPedido);
							System.out.println("Pedido enviado!");
							System.out.println("Número do pedido:" + novoPedido.getIdPedido());
							break;
						case 2:
							System.out.println("Qual o número do pedido:");
							Integer numPedidoBebida = scan.nextInt();
							TotalPedidoBebida(listaPedidos, listaCardapioBebidas, numPedidoBebida);
							break;
						case 3:
							System.out.println("Qual o número do pedido:");
							Integer numPedido = scan.nextInt();
							TotalPedidoComida(listaPedidos, listaCardapio, opcaoPedido);
							break;
						}
			case 5:
				// Extrair relatórios
				// vendar por funcionario
				
				// faturamento diário
				
				// pagamento comissão
				System.out.println("Bzzz");;
				break;
			case 6:
				System.out.println("Você escolheu sair :)");
				break;
			default:
				System.out.println("Ops, esta opção não existe!");
				break;
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
	public static Mesa CadastraMesa(ArrayList listaMesas, String numeromesa, String capacidadepessoa, Integer disponibilidade) {
		return new Mesa(numeromesa, capacidadepessoa, disponibilidade);
	}
	
	// Pedidos
	public static Pedido CadastraPedido(List listaPedidos,Integer numeroMesa, Integer idGarcom, Integer cardapioCodPrato, Integer qtdItens) {
		// Implementar redução de estoque
		Integer idPedido = listaPedidos.size() + 1;
		return new Pedido(idPedido,numeroMesa, idGarcom, cardapioCodPrato, qtdItens);
	}
	public static void TotalPedidoComida(List<Pedido> listaPedido,List<Cardapio> listaCardapio, Integer idPedido) {
		Pedido pedido = listaPedido.get(idPedido-1);
		Float vlrBebida = listaCardapio.get(pedido.getCardapioCodItem()-1).getprecoPrato();
		Float totalPedido = pedido.getQuantidadeItem() + vlrBebida;
		System.out.println("O total do pedido é: " + totalPedido);
	}
	public static void TotalPedidoBebida(List<Pedido> listaPedido,ArrayList<CardapioBebidas> listaCardapioBebidas, Integer idPedido) {
		Pedido pedido = listaPedido.get(idPedido-1);
		Float vlrBebida = listaCardapioBebidas.get(pedido.getCardapioCodItem()-1).getprecoBebida();
		Float totalPedido = pedido.getQuantidadeItem() + vlrBebida;
		System.out.println("O total do pedido é: " + totalPedido);
		
	}
	// Acompanhamento de vendas por funcionário
	
	// Fechamento de conta e faturamento
	
	// Relatório de faturamento por restaurante

}
