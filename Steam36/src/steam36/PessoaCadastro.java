package steam36;

import java.util.*;
import javax.swing.*;

public class PessoaCadastro{

	// Atributos
	public static String nome;
	public static String usuario;
	public static String senha;
	public static String email;
	public static String nascimento;
	
	Scanner ler = new Scanner(System.in);
	
	// Contrutor
	public PessoaCadastro() { // Vazio para podermos implementar no m�todo cadastro
	}
	
	// M�todos
	static void cadastro() {	// Implementa dados aos Atributos da PessoaCadastro
		String a, b, c, d, e;
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n           "
				+ "CADASTRO\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Nome: "); PessoaCadastro.setNome(a);
		b = JOptionPane.showInputDialog(" Usu�rio: "); PessoaCadastro.setUsuario(b);
		c = JOptionPane.showInputDialog(" Senha: "); PessoaCadastro.setSenha(c);
		d = JOptionPane.showInputDialog(" Email: "); PessoaCadastro.setEmail(d);
		e = JOptionPane.showInputDialog(" Data de Nascimento: "); PessoaCadastro.setNascimento(e);
		JOptionPane.showMessageDialog(null,"\n CADASTRADO COM SUCESSO!!");
	}
	
	static void login() {	// Compara Strings Atributos com as String do m�todo para validar login
		String a, b;
		
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n              "
				+ "LOGIN\n ----------------------------------------");
		a = JOptionPane.showInputDialog(" Usu�rio: ");
		b = JOptionPane.showInputDialog(" Senha: ");
		
		if (a.equals(getUsuario()) && b.equals(getSenha()) ) {	// Compara Strings
		JOptionPane.showMessageDialog(null,"\n SEJA BEM VINDO "+getNome()+"!!"); }
		
		else { JOptionPane.showMessageDialog(null,"\n USUARIO E SENHA INCORRETOS"); PessoaCadastro.login(); }
	}
		
	static void print() {
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n          "
				+ "INFORMA��ES\n ---------------------------------------- "
				+ "\n Nome: "+getNome()+""
						+ "\n Usu�rio: "+getUsuario()+""
								+ "\n Senha: "+getSenha()+""
										+ "\n Email: "+getEmail()+""
												+ "\n Data de Nascimento: "+getNascimento()+"\n\n");
	}
	
	// Get e Set
	public static String getNome() { return nome; }

	public static void setNome(String nome) { PessoaCadastro.nome = nome; }

	public static String getUsuario() { return usuario; }

	public static void setUsuario(String usuario) { PessoaCadastro.usuario = usuario; }

	public static String getSenha() { return senha; }

	public static void setSenha(String senha) { PessoaCadastro.senha = senha; }

	public static String getEmail() { return email; }

	public static void setEmail(String email) { PessoaCadastro.email = email; }

	public static String getNascimento() { return nascimento; }

	public static void setNascimento(String nascimento) { PessoaCadastro.nascimento = nascimento; }

	
}
