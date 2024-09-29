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
		
		System.out.println("1) Entrar Como Administrador\n"
				         + "2) Entrar como funcionário\n");
		
		int escolhausuario = scan.nextInt();
		
		
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
