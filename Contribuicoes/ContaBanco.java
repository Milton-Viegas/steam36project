import java.text.NumberFormat;
import java.util.Scanner;

public class ContaClass {

	// Atributos
	private String nome;
	private String end;
	private String cpf;
	private String banco;
	private double saldo;
	
	Scanner ler = new Scanner(System.in);
	
	// Construtor
	public ContaClass( String nome, String end, String cpf, String banco, double saldo) {
		this.nome = nome;
		this.end = end;
		this.cpf = cpf;
		this.setBanco(banco);
		this.saldo = saldo;
	}
	
	// Métodos
	public void print() {	// Exibir Atributos
		System.out.print("\n -----------------------------");
		System.out.print("\n CONTA BANCARIA");
		System.out.print("\n Banco: "+banco);
		System.out.print("\n Cliente: "+nome);
		System.out.print("\n Endereço: "+end);
		System.out.print("\n CPF: "+cpf);
		System.out.print("\n Saldo: "+this.formatarMoeda());
	}
	
	public void sacar() {
		double a;
		System.out.print("\n Digite o valor do SAQUE: "); a = ler.nextDouble();
		if (a > saldo) {System.out.print("\n Saldo Insuficiente!!");}
		else {saldo -= a;}	// Descontar saldo
	}
	
	public void depositar() {
		double a;
		System.out.print("\n Digite o valor do DEPOSITO: "); a = ler.nextDouble();
		saldo += a;	// Incrementar saldo
	}
	
	public String formatarMoeda() {	// Formatar saldo para R$ 0.000,00
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(saldo);
		return formatoMoeda;
	}

	// Get e Set
	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }

	public String getEnd() { return end; }

	public void setEnd(String end) { this.end = end; }

	public String getCpf() { return cpf; }

	public void setCpf(String cpf) { this.cpf = cpf; }

	public double getSaldo() { return saldo; }

	public void setSaldo(double saldo) { this.saldo = saldo; }

	public String getBanco() { return banco; }

	public void setBanco(String banco) { this.banco = banco; }
	
}