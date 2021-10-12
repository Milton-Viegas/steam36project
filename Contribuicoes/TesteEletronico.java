

import java.util.Scanner;

public class TesteEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eletronico eletronico1 = new Eletronico();
	
		Scanner leia = new Scanner(System.in);
		
		int opcaoPagamento, opcaoVoltagem, opcaoProduto;
		 
		System.out.println("\t\tProdutos: \n"
				+ "[1] --> Playstation 5\n"
				+ "[2] --> Iphone 12\n"
				+ "[3] --> Camera Canon R6");
		opcaoProduto = leia.nextInt();
		
		System.out.println("Escolha sua opcao de voltagem:"
				+ "\n[1] - 127v"
				+ "\n[2] - 220v");
		opcaoVoltagem = leia.nextInt();
		
		System.out.println("O pagamento sera feito a vista?\n[1] - Sim\n[2] - Nao ");
		opcaoPagamento = leia.nextInt();
		
		if (opcaoProduto == 1)
		{
			eletronico1.setNome("Playstation 5");
			eletronico1.setPreco(4300);
			eletronico1.setCategoria("Games");
		
		}
		
		else if (opcaoProduto == 2)
		{
			eletronico1.setNome("Iphone 12");
			eletronico1.setPreco(6000);
			eletronico1.setCategoria("Celulares");
		}
		
		else if (opcaoProduto == 3)
		{
			eletronico1.setNome("Camera Canon R6");
			eletronico1.setPreco(18000);
			eletronico1.setCategoria("Cameras");
		}
		
		else 
		{
			System.out.println("Opcao Invalida");
		}
				
		if (opcaoVoltagem == 1)
		{
			eletronico1.setVoltagem("127v");
		}
		
		else
		{
			eletronico1.setVoltagem("220v");
		}
		
		if(opcaoPagamento == 1)
		{
			eletronico1.PrecoAVista(eletronico1.getPreco());
		}
		
		
		System.out.println(eletronico1.getNome() + "\nPreco: R$" + eletronico1.getPreco() + "\nCom a voltagem de: " + eletronico1.getVoltagem());
		
	}
}