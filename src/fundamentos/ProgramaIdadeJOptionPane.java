/**
	Programa que leia o ano de nascimento de um usuário e o ano
	atual, calcule e apresente a sua idade
 */
package fundamentos;

import javax.swing.JOptionPane;

public class ProgramaIdadeJOptionPane {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Programa descubra sua idade:\nEm que ano estamos?");
		String b = JOptionPane.showInputDialog("Qual o ano do seu nascimento?");
		
		int ano = Integer.parseInt(a);
		int nascimento = Integer.parseInt(b);
		int idade = ano - nascimento;
		
		System.out.printf("Você tem %d anos",idade);
	}
}