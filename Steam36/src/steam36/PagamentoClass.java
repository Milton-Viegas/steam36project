package steam36;

import javax.swing.JOptionPane;

public class PagamentoClass {

	/*Atributos Static para não precisar criar um Objeto, e não 
	acabar perdendo o valor ao voltar em algum método*/
	public static String nomeTitutar;
	public static String cpf;
	public static String nCartao;
	public static String nValidade;
	public static String nSegCod;
	
	// Construtor
	public PagamentoClass() {
		
	}

	// Métodos
	static void cartao() {
		String a, b, c, d, e;
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n        "
				+ "CADASTRAR CARTÃO\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Nome do Titular: "); PagamentoClass.setNomeTitutar(a);
		b = JOptionPane.showInputDialog(" CPF do Titular: "); PagamentoClass.setCpf(b);
		c = JOptionPane.showInputDialog(" Numero do Cartão: "); PagamentoClass.setnCartao(c);
		d = JOptionPane.showInputDialog(" Validade do Cartão: "); PagamentoClass.setnValidade(d);
		e = JOptionPane.showInputDialog(" Código de Segurança: "); PagamentoClass.setnSegCod(e);
		JOptionPane.showMessageDialog(null,"\n CADASTRADO COM SUCESSO!!");
	}
	
	static void print() {
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n        "
				+ "INFORMAÇÕES\n ---------------------------------------- "
				+ "\n Nome: "+getNomeTitutar()+""
						+ "\n Usuário: "+getCpf()+""
								+ "\n Senha: "+getnCartao()+""
										+ "\n Email: "+getnValidade()+""
												+ "\n Data de Nascimento: "+getnSegCod()+"\n\n");
	
	}
	
	static void confirmar() {
		
		System.out.print(" Valor total: "+FeedClass.getValor());
		System.out.print("\n Deseja Confirmar a compra?");
		System.out.print("\n 1) Sim\n ");
		
	}
	
	
	// Get e Set
	public static String getNomeTitutar() { return nomeTitutar; }

	public static void setNomeTitutar(String nomeTitutar) { PagamentoClass.nomeTitutar = nomeTitutar; }

	public static String getCpf() { return cpf; }

	public static void setCpf(String cpf) { PagamentoClass.cpf = cpf; }

	public static String getnCartao() { return nCartao; }

	public static void setnCartao(String nCartao) { PagamentoClass.nCartao = nCartao; }

	public static String getnValidade() { return nValidade; }

	public static void setnValidade(String nValidade) { PagamentoClass.nValidade = nValidade; }

	public static String getnSegCod() { return nSegCod; }

	public static void setnSegCod(String nSegCod) { PagamentoClass.nSegCod = nSegCod; }
}
