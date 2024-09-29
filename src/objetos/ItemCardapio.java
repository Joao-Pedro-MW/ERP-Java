package objetos;

import java.util.Scanner;
import java.util.ArrayList;

public class ItemCardapio {

	public static void main(String[] args) {
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
	}
}

