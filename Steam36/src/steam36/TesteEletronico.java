package steam36;

import java.util.Scanner;

public class TesteEletronico {

	public static void main(String[] args) {

		Eletronico eletronico1 = new Eletronico("Mario Kart", 389);

		Scanner leia = new Scanner(System.in);

		int opcaoPagamento, opcaoProduto;

		System.out.println(
				"\t\tProdutos: \n" + "[1] --> Mario Kart\n" + "[2] --> Street Fighter XV\n" + "[3] --> FIFA 2022");
		opcaoProduto = leia.nextInt();

		System.out.println("O pagamento sera feito a vista?\n[1] - Sim\n[2] - Nao ");
		opcaoPagamento = leia.nextInt();

		if (opcaoProduto == 1) {
			eletronico1.setNomeJogo("Mario Kart");
			eletronico1.setPreco(389);
			eletronico1.setCategoria("Aventura");

		}

		else if (opcaoProduto == 2) {
			eletronico1.setNomeJogo("Street Fighter XV");
			eletronico1.setPreco(259);
			eletronico1.setCategoria("Luta");
		}

		else if (opcaoProduto == 3) {
			eletronico1.setNomeJogo("FIFA 2022");
			eletronico1.setPreco(359);
			eletronico1.setCategoria("Esporte");
		}

		else {
			System.out.println("Opcao Invalida");
		}

		if (opcaoPagamento == 1) {
			eletronico1.PrecoAVista(eletronico1.getPreco());
		}  //criar opção INVALIDA!!!

		System.out.println(eletronico1.getNomeJogo() + "\nPreco: R$" + eletronico1.getPreco());
	}
}
