package ProjetoJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int op;
		Scanner ler = new Scanner(System.in);
		
		PessoaCadastro pc = new PessoaCadastro();
		PessoaLogin pl = new PessoaLogin();
		
		System.out.println("\n BEM-VINDO AO STEAM 36!!");
	
		do {
		System.out.print("\n ----------------------------------------");
		System.out.print("\n Escolha a op��o");
		System.out.print("\n 1) Login");
		System.out.print("\n 2) Cadastro");
		System.out.print("\n 3) Informa��es");
		System.out.print("\n Op��o: "); op = ler.nextInt();
		
		switch (op) {
		case 1: pl.login(); break;
		case 2: pc.cadastro(); break;
		case 3: pc.print(); break;
		default: System.out.println("\n Op��o Inv�lida!!"); break;
		}
		
		System.out.print("\n Digite 0 para voltar: "); op = ler.nextInt();
		} while (op == 0);

	}
}
