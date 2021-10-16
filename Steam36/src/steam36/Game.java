package Steam36;

public class Game {

	// Atributos

	private String nomeJogo;
	private double precoUni;
	private int qtd;


	// construtores

	public Game(String nomeJogo,int qtd, double precoUni) {
		this.nomeJogo = nomeJogo;
		this.qtd = qtd;
		this.precoUni = precoUni;
	}
	public Game() {
		this.nomeJogo = "Mario";
		this.qtd = 1;
		this.precoUni = 300;
		
	}
	// Getters & Setters
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public double getPrecoUni() {
		return precoUni;
	}
	public void setPrecoUni(double precoUni) {
		this.precoUni = precoUni;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}




}
