package Steam36;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.List;

import java.util.ArrayList;

import Steam36.Aventura;

public class FeedClass {

	// Atributos
	// public String teste = "FEED DE JOGOS";
	public String nome;
	public double preco;
	public String luta;

	Scanner ler = new Scanner(System.in);


	// Construtor
	public FeedClass() {
	}	

	// Métodos
	public void FeedClass1() {
		int op;


		//Objetos


		do { // Menu's Feed
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "BEM VINDO AO FEED JOGOS\n----------------------------------------\n"
					+ "       LISTA DE CATEGORIAS\n"
					+ "1) Aventura/Ação\n"));

			switch (op)  {

			case 1: this.AventuraAção(); break;
			case 2: this.Luta(); break;
			case 3: this.RPG(); break;
			case 4: this.Esporte(); break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			}
		} while (op == 0);
	}
	public void AventuraAção() { 
		int op;

		Aventura catAventura = new Aventura();
		ArrayList <Game> jogosAventura = catAventura.getLista();

		do { //Menu's Games
			String textoJogos = "";
			for(int i=0;i<jogosAventura.size();i++) {
				textoJogos += (i + 1) + ") Nome: " +jogosAventura.get(i).getNomeJogo() +" Preço: "+jogosAventura.get(i).getPrecoUni()+"\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op)  {

			case 1: System.out.print(jogosAventura.get(0)); break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;

			} 
		}	while (op == 0);
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
