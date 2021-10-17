package steam36;

import javax.swing.JOptionPane;

public class PagamentoClass {

	/*Atributos Static para n�o precisar criar um Objeto, e n�o 
	acabar perdendo o valor ao voltar em algum m�todo*/
	public static String nomeTitutar;
	public static String cpf;
	public static String nCartao;
	public static String nValidade;
	public static String nSegCod;
	public static int cont = 0;
	
	// Construtor
	public PagamentoClass() {
		
	}

	// M�todos
	static void cartao() {
		String a, b, c, d, e;
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n"
				+ " CADASTRAR CART�O\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Nome do Titular: "); PagamentoClass.setNomeTitutar(a);
		b = JOptionPane.showInputDialog(" CPF do Titular: "); PagamentoClass.setCpf(b);
		c = JOptionPane.showInputDialog(" Numero do Cart�o: "); PagamentoClass.setnCartao(c);
		d = JOptionPane.showInputDialog(" Validade do Cart�o: "); PagamentoClass.setnValidade(d);
		e = JOptionPane.showInputDialog(" C�digo de Seguran�a: "); PagamentoClass.setnSegCod(e);
		cont++;
		JOptionPane.showMessageDialog(null,"\n CADASTRADO COM SUCESSO!!"); 
		PagamentoClass.confirmar();
	}
	
	static void print() {
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n"
				+ " INFORMA��ES DO CART�O\n ---------------------------------------- "
				+ "\n Nome do Titular: "+getNomeTitutar()+""
						+ "\n CPF do Titular: "+getCpf()+""
								+ "\n Numero do Cart�o: "+getnCartao()+""
										+ "\n Validade do Cart�o: "+getnValidade()+""
												+ "\n C�digo de Seguran�a: "+getnSegCod()+"\n\n");
		FeedClass.Carrinho();
	}
	
	static void confirmar() {
		int op;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("\n Valor total: "+FeedClass.formatarMoeda()+"\n"
				+ "\n Deseja Confirmar a compra?"
				+ "\n 1) Sim\n 2) Voltar\n\n Op��o:"));
		
		if (op == 1) { JOptionPane.showMessageDialog(null,"\n COMPRA REALIZADA COM SUCESSO!!\n"
				+ " A NOTA FISCAL FOI ENVIADA PARA O EMAIL CADASTRADO!!\n\n"
				+ " OBRIGADO PELA PREFERENCIA!!"); Main.Menu(); } 
		else { FeedClass.Carrinho(); }
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

	public static int getCont() { return cont; }

	public static void setCont(int cont) { PagamentoClass.cont = cont; }

}
