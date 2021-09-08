package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConvresao {

	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("Insira seu 1� Sal�rio:").replace(",", ".");
		String num2 = JOptionPane.showInputDialog("Insira seu 2� Sal�rio:").replace(",", ".");
		String num3 = JOptionPane.showInputDialog("Insira seu 3� Sal�rio:").replace(",", ".");

		double salario1 = Double.parseDouble(num1);
		double salario2 = Double.parseDouble(num2);
		double salario3 = Double.parseDouble(num3);
		double media = (salario1 + salario2 + salario3) / 3;

		JOptionPane.showMessageDialog(null, String.format("A m�dia dos 3 sal�rios � %.2f", media));
	}
}

// Programa que l� 3 sal�rios e mostra a m�dia.
// Desafio para trocar ',' por '.' (Para treinar e conhecer a nota��o ponto).