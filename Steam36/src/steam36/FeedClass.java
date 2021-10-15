package ProjetoJava;

import java.util.Scanner;

public class FeedClass {

	// Atributos
	// public String teste = "FEED DE JOGOS";
	public String nome;
	public double preco;
	
	Scanner ler = new Scanner(System.in);
	
	// Construtor
	public FeedClass() {
		
	}
	
	// Métodos
	public void FeedClass1() {
		int op;
		
		System.out.print("\n ---------------------------------");
		System.out.print("\n FEED DE JOGOS");
		System.out.print("\n Categorias");
		System.out.print("\n 1) Ação e Aventura");
		System.out.print("\n 2) Luta");
		System.out.print("\n 3) RPG");
		System.out.print("\n 4) Esporte");
		System.out.print("\n Opção:"); op = ler.nextInt();
		
		switch (op) {
		
		case 1: this.AventuraAção(); break;
		case 2: this.Luta(); break;
		case 3: this.RPG(); break;
		case 4: this.Esporte(); break;
		default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
		
		}
	}
	
	public void AventuraAção() {
		
		System.out.println("\n TESTE AÇÃO E AVENTURA!");
		this.FeedClass1();
		
		
	}
	
	public void Luta() {
		
		System.out.println("\n TESTE LUTA!");
		this.FeedClass1();
	}
	
	public void RPG() {
		
		System.out.println("\n RPG!");
		this.FeedClass1();
		
	}
	
	public void Esporte() {

		System.out.println("\n TESTE ESPORTE!");
		this.FeedClass1();
		
	}

	
	// Get e Set
	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public double getPreco() { return preco; }

	public void setPreco(double preco) { this.preco = preco; }
	
}
