package Steam36;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.List;

import java.util.ArrayList;

import Steam36.Aventura;

import Steam36.Luta;

import Steam36.RPG;

import Steam36.Esporte;

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
					+ "1) Aventura/Ação\n"
					+ "2) Luta\n"
					+ "3) RPG\n"
					+ "4) Esporte\n"));

			switch (op)  {

			case 1: this.AventuraAção(); break;
			case 2: this.Luta(); break;
			case 3: this.RPG(); break;
			case 4: this.Esporte(); break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			}
		} while (op == 0);
	}
	public void AventuraAção() { //MENU DE JOGOS DE AVENTURA
		int op;

		Aventura catAventura = new Aventura();
		ArrayList <Game> jogosAventura = catAventura.getLista();

		do { 
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

	public void Luta() {	//MENU DE JOGOS DE LUTA
		int op;

		Luta catLuta = new Luta();
		ArrayList <Game> jogosLuta = catLuta.getLista();

		do { //Menu's Games
			String textoJogos = "";
			for(int i=0;i<jogosLuta.size();i++) {
				textoJogos += (i + 1) + ") Nome: " +jogosLuta.get(i).getNomeJogo() +" Preço: "+jogosLuta.get(i).getPrecoUni()+"\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op)  {

			case 2: System.out.print(jogosLuta.get(0)); break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;

			} 
		}	while (op == 0);
	
	}

	public void RPG() {			//MENU DE JOGOS DE RPG
		int op;

		RPG catRPG = new RPG();
		ArrayList <Game> jogosRPG = catRPG.getLista();

		do { //Menu's Games
			String textoJogos = "";
			for(int i=0;i<jogosRPG.size();i++) {
				textoJogos += (i + 1) + ") Nome: " +jogosRPG.get(i).getNomeJogo() +" Preço: "+jogosRPG.get(i).getPrecoUni()+"\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op)  {

			case 3: System.out.print(jogosRPG.get(0)); break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;

			} 
		}	while (op == 0);
	
	}

	public void Esporte() {			//MENU DE JOGOS DE ESPORTE
		int op;

		Esporte catEsporte = new Esporte();
		ArrayList <Game> jogosEsporte = catEsporte.getLista();

		do { 
			String textoJogos = "";
			for(int i=0;i<jogosEsporte.size();i++) {
				textoJogos += (i + 1) + ") Nome: " +jogosEsporte.get(i).getNomeJogo() +" Preço: "+jogosEsporte.get(i).getPrecoUni()+"\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op)  {

			case 3: System.out.print(jogosEsporte.get(0)); break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;

			} 
		}	while (op == 0);
	
	}
	// Get e Set
	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public double getPreco() { return preco; }

	public void setPreco(double preco) { this.preco = preco; }

}
