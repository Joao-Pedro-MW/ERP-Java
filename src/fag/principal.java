package fag;

import java.util.List;
import java.util.Scanner;

import objetos.Cadastrofuncionarios;
import objetos.Mesa;

public class principal {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("1) Entrar Como Administrador\n2) Entrar como funcionário\n");
		int escolhausuario = scan.nextInt();
		
		while(true) {
		if(escolhausuario == 1) {
			
			String loginInput = "";
			String SenhaImput = "";
			String login="admadm";
			String senha="123123";
			
			
			System.out.println("Faça o Login\n\nUsuário:\nSenha:\n");
			loginInput = scan.next();
			SenhaImput = scan.next();
			
				if(!loginInput.equals(login)) {
					System.out.println("Login Incorreto");
					continue;
				}
				if(!SenhaImput.equals(senha)) {
					System.out.println("Senha Incorreta");
					continue;
				}
				if(login.equals(loginInput) && senha.equals(SenhaImput)) {
					System.out.println("BEM VINDO!!");
					break;
				}
				
		}
		
		
		}
		
		
	}

}
