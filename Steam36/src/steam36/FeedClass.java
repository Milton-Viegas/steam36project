package steam36;

import java.util.*;
import javax.swing.*;

public class FeedClass {

	// Atributos
	// public String teste = "FEED DE JOGOS";
	public String nome;
	public double preco;
	public String luta;

	Scanner ler = new Scanner(System.in);
	int valor = 0;

	// Construtor
	public FeedClass() {
	}	

	// Métodos
	public void FeedClass1() {
		int op;

			JOptionPane.showMessageDialog(null, "\n----------------------------------------\n"
					+ "BEM VINDO AO FEED JOGOS\n----------------------------------------\n");
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
					+ "           CATEGORIAS\n"
					+ " ----------------------------------------\n\n"
					+ " 1) Ação e Aventura\n"
					+ " 2) Luta\n"
					+ " 3) RPG\n"
					+ " 4) Esporte\n"
					+ " 5) Sair\n"
					+ "\n Opção:"));

			switch (op)  {

			case 1: this.AventuraAção(); break;
			case 2: this.Luta(); break;
			case 3: this.RPG(); break;
			case 4: this.Esporte(); break;
			case 5: Main.Menu(); break;
			default: JOptionPane.showMessageDialog(null, "\n OPÇÃO INVÁLIDA!!"); this.FeedClass1(); break;
		}
	}
	public void AventuraAção() { 
		int op;

		Aventura catAventura = new Aventura();
		ArrayList <Game> jogosAventura = catAventura.getLista();
		
			String textoJogos = "";
			for(int i=0;i<jogosAventura.size();i++) {
				textoJogos += (i + 1) + ") " +jogosAventura.get(i).getNomeJogo() +"\n Preço: R$"+jogosAventura.get(i).getPrecoUni()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
			switch (op)  {

			case 1: System.out.print("\n Valor: "+jogosAventura.get(0).getPrecoUni());
			valor += jogosAventura.get(0).getPrecoUni();
			break;
			case 2: System.out.print("\n Valor: "+jogosAventura.get(1).getPrecoUni());
			valor += jogosAventura.get(1).getPrecoUni();
			break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			
			}
			
			System.out.print("\n Deseja comprar novamente?\n 1) Sim\n 2) Finalizar compra\n\n Opção: "); op = ler.nextInt();
			if (op == 1) { this.FeedClass1(); } else {System.out.println("\n CARRINHO!!\n Valor total: R$"+valor);}
	
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
