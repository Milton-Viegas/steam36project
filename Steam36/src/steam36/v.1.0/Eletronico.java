package steam36;

public class Eletronico {

	// Atributos

	String nomeJogo;
	String categoria;
	double preco;

	// construtores

	public Eletronico(String nomeJogo, double preco) {
		this.nomeJogo = nomeJogo;
		this.preco = preco;
	}

	// Getters & Setters

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// metodo
	public double PrecoAVista(double precoRecebido) {
		double desconto;
		desconto = precoRecebido * 0.1;
		this.preco = precoRecebido - desconto;
		return preco;
	}
}
