package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConvresao {

	public static void main(String[] args) {

		String num1 = JOptionPane.showInputDialog("Insira seu 1° Salário:").replace(",", ".");
		String num2 = JOptionPane.showInputDialog("Insira seu 2° Salário:").replace(",", ".");
		String num3 = JOptionPane.showInputDialog("Insira seu 3° Salário:").replace(",", ".");

		double salario1 = Double.parseDouble(num1);
		double salario2 = Double.parseDouble(num2);
		double salario3 = Double.parseDouble(num3);
		double media = (salario1 + salario2 + salario3) / 3;

		JOptionPane.showMessageDialog(null, String.format("A média dos 3 salários é %.2f", media));
	}
}

// Programa que lê 3 salários e mostra a média.
// Desafio para trocar ',' por '.' (Para treinar e conhecer a notação ponto).