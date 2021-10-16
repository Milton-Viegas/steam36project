package steam36;

import java.awt.Font;
import java.net.URL;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Alterando Fonte do JOptionPane
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 14)));
		
		Scanner ler = new Scanner(System.in);	// Não está sendo usado
		int op;
		
		// Objetos
		PessoaCadastro pc = new PessoaCadastro();
		FeedClass fc = new FeedClass();
		
		// Gif no JOptionPane
		final ImageIcon icon = new ImageIcon(new URL("https://bityli.com/gLdSwA"));
		
		JOptionPane.showMessageDialog(null,null,null, JOptionPane.INFORMATION_MESSAGE, icon);
		JOptionPane.showMessageDialog(null,"\n ----------------------------------------\n BEM VINDO AO STEAM 36!!\n ----------------------------------------");
		
		do {	// Menu de Opções
		op = Integer.parseInt(JOptionPane.showInputDialog("\n ----------------------------------------\n "
				+ "Escolha a opção\n ----------------------------------------\n "
				+ "1) Login\n 2) Cadastro\n 3) Informações\n\n Opção: "));
		
		switch (op) {
		case 1: pc.login(); break;
		case 2: pc.cadastro(); break;
		case 3: pc.print(); break;
		
		default: JOptionPane.showMessageDialog(null,"\n Opção Inválida!!"); break;
		}
		
		// Loop para manter o usuário no menu
		op = Integer.parseInt(JOptionPane.showInputDialog("\n 1) FEED DE JOGOS\n 0) VOLTAR\n\n Opção:"));
		} while (op == 0);	
		
		fc.printInfo();
		
	}
}
