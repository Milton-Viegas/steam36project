package Steam36;

public class Carrinho {
	private Games[] carrinho;
	private double Totalprice;
	
	public Carrinho() {
		carrinho = new Games[3];
	}
	public double calculateTotalprice[] {
		for (int i=0;i<carrinho.length;i++) {
			Totalprice += carrinho[i].getTotalpreco();
		}
		return Totalprice;
	}
}
