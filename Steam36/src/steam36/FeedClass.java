package steam36;

import java.text.NumberFormat;
import java.util.*;
import javax.swing.*;

public class FeedClass {

	// Atributos
	public String nome;
	public double preco;
	public String luta;
	public static int valor = 0;	// Atributo Static para manipular em outra Classe
	
	Scanner ler = new Scanner(System.in);
	
	// Construtor
	public FeedClass() {
	}	

	// Métodos
	public void Feed() {
		int op;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n "
				+ "           CATEGORIAS\n"
				+ " ----------------------------------------\n\n"
				+ " 1) Ação e Aventura\n"
				+ " 2) Luta\n"
				+ " 3) RPG\n"
				+ " 4) Esporte\n"
				+ " ----------------------------------------\n"
				+ " 5) Carrinho\n"
				+ " 6) Home\n"
				+ "\n Opção:"));

		switch (op)  {
		
		case 1: this.AventuraAção(); break;
		case 2: this.Luta(); break;
		case 3: this.RPG(); break;
		case 4: this.Esporte(); break;
		case 5: this.Carrinho(); break;
		case 6: Main.Menu(); break;
		default: JOptionPane.showMessageDialog(null, "\n OPÇÃO INVÁLIDA!!"); this.FeedClass1(); break;
		}
	}
	
	public void bemvindo() {
		JOptionPane.showMessageDialog(null, "\n----------------------------------------\n"
				+ "BEM VINDO AO FEED JOGOS\n----------------------------------------\n");
	}
	
	public void FeedClass1() {
		
		this.bemvindo();
		this.Feed();
		
	}
	
	
	public void AventuraAção() { 
		int op;

		Aventura catAventura = new Aventura();
		ArrayList <Game> jogosAventura = catAventura.getLista();
		
			String textoJogos = "";
			for(int i=0;i<jogosAventura.size();i++) {
				textoJogos += (i + 1) + ") " +jogosAventura.get(i).getNomeJogo() +"\n Preço: "+jogosAventura.get(i).formatarMoeda()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n----------------------------------------\n"
					+ "       JOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
			switch (op)  {

			case 1: System.out.print("\n Valor: "+jogosAventura.get(0).formatarMoeda());
			valor += jogosAventura.get(0).getPrecoUni();
			break;
			case 2: System.out.print("\n Valor: "+jogosAventura.get(1).formatarMoeda());
			valor += jogosAventura.get(1).getPrecoUni();
			break;
			case 3: System.out.print("\n Valor: "+jogosAventura.get(2).formatarMoeda());
			valor += jogosAventura.get(2).getPrecoUni();
			break;
			case 4: System.out.print("\n Valor: "+jogosAventura.get(3).formatarMoeda());
			valor += jogosAventura.get(3).getPrecoUni();
			break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			
			}
			
			System.out.print("\n\n Deseja continuar comprando?\n 1) Sim\n 2) Realizar Compra\n\n Opção: "); op = ler.nextInt();
			if (op == 1) { this.Feed(); } else { this.Carrinho(); }
	
	}

	public void Luta() {
		int op;

		Luta catLuta = new Luta();
		ArrayList <Game> jogosLuta = catLuta.getLista();

			String textoJogos = "";
			for(int i=0;i<jogosLuta.size();i++) {
				textoJogos += (i + 1) + ") " +jogosLuta.get(i).getNomeJogo() +"\n Preço: "+jogosLuta.get(i).getPrecoUni()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op)  {

			case 1: System.out.print("\n Valor: "+jogosLuta.get(0).formatarMoeda());
			valor += jogosLuta.get(0).getPrecoUni();
			break;
			case 2: System.out.print("\n Valor: "+jogosLuta.get(1).formatarMoeda());
			valor += jogosLuta.get(1).getPrecoUni();
			break;
			case 3: System.out.print("\n Valor: "+jogosLuta.get(2).formatarMoeda());
			valor += jogosLuta.get(2).getPrecoUni();
			break;
			case 4: System.out.print("\n Valor: "+jogosLuta.get(3).formatarMoeda());
			valor += jogosLuta.get(3).getPrecoUni();
			break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;

			}
			
			System.out.print("\n\n Deseja continuar comprando?\n 1) Sim\n 2) Realizar Compra\n\n Opção: "); op = ler.nextInt();
			if (op == 1) { this.Feed(); } else { this.Carrinho(); }
	
	}
	public void RPG() {	//MENU DE JOGOS DE RPG
		int op;

		RPG catRPG = new RPG();
		ArrayList <Game> jogosRPG = catRPG.getLista();

			String textoJogos = "";
			for(int i=0;i<jogosRPG.size();i++) {
				textoJogos += (i + 1) + ") " +jogosRPG.get(i).getNomeJogo() +"\n Preço: "+jogosRPG.get(i).getPrecoUni()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op)  {

			case 1: System.out.print("\n Valor: "+jogosRPG.get(0).formatarMoeda());
			valor += jogosRPG.get(0).getPrecoUni();
			break;
			case 2: System.out.print("\n Valor: "+jogosRPG.get(1).formatarMoeda());
			valor += jogosRPG.get(1).getPrecoUni();
			break;
			case 3: System.out.print("\n Valor: "+jogosRPG.get(2).formatarMoeda());
			valor += jogosRPG.get(2).getPrecoUni();
			break;
			case 4: System.out.print("\n Valor: "+jogosRPG.get(3).formatarMoeda());
			valor += jogosRPG.get(3).getPrecoUni();
			break;
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			}
			
			System.out.print("\n\n Deseja continuar comprando?\n 1) Sim\n 2) Realizar Compra\n\n Opção: "); op = ler.nextInt();
			if (op == 1) { this.Feed(); } else { this.Carrinho(); }
			
	}

	public void Esporte() {//MENU DE JOGOS DE ESPORTE
		int op;

		Esporte catEsporte = new Esporte();
		ArrayList <Game> jogosEsporte = catEsporte.getLista();

			String textoJogos = "";
			for(int i=0;i<jogosEsporte.size();i++) {
				textoJogos += (i + 1) + ") " +jogosEsporte.get(i).getNomeJogo() +"\n Preço: "+jogosEsporte.get(i).getPrecoUni()+"\n\n";
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n"
					+ "\tJOGOS DISPONÍVEIS\n----------------------------------------\n"
					+ textoJogos));
				
					
			switch (op)  {

			case 1: System.out.print("\n Valor: "+jogosEsporte.get(0).formatarMoeda());
			valor += jogosEsporte.get(0).getPrecoUni();
			break;
			case 2: System.out.print("\n Valor: "+jogosEsporte.get(1).formatarMoeda());
			valor += jogosEsporte.get(1).getPrecoUni();
			break;
			case 3: System.out.print("\n Valor: "+jogosEsporte.get(2).formatarMoeda());
			valor += jogosEsporte.get(2).getPrecoUni();
			break;
			case 4: System.out.print("\n Valor: "+jogosEsporte.get(3).formatarMoeda());
			valor += jogosEsporte.get(3).getPrecoUni();
			default: System.out.print("\n OPÇÃO INVÁLIDA!!"); break;
			} 
			
			System.out.print("\n\n Deseja continuar comprando?\n 1) Sim\n 2) Realizar Compra\n\n Opção: "); op = ler.nextInt();
			if (op == 1) { this.Feed(); } else { this.Carrinho(); }
	}
	
	public void Carrinho() {
		int op;
		System.out.println("\n ----------------------------------------\n"
				+ "\tCARRINHO\n ----------------------------------------");
		System.out.print(" VALOR TOTAL: "+this.formatarMoeda()+"\n");
		System.out.print("\n 1) Adicionar Forma de pagamento");
		System.out.print("\n 2) Exibir Forma de pagamento cadastrado");
		System.out.print("\n 3) Exibir carrinho");
		System.out.print("\n Opção: "); op = ler.nextInt();
		
		switch (op) {
		
		case 1: PagamentoClass.cartao(); break;
		case 2: PagamentoClass.print(); break;
		case 3: this.exibirCarrinho(); break;
		default: JOptionPane.showMessageDialog(null,"\n Opção Inválida!!"); this.Carrinho(); break;
		
		}
	}

	public void exibirCarrinho() {
		
	}
	
	public String formatarMoeda() {	// Formatar Preço para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;
	}
	
	// Get e Set
	public String getNome() { return nome; }

	public static int getValor() { return valor; }

	public static void setValor(int valor) { FeedClass.valor = valor; }

	public void setNome(String nome) { this.nome = nome; }

	public double getPreco() { return preco; }

	public void setPreco(double preco) { this.preco = preco; }

}
