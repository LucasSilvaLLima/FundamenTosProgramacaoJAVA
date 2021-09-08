/**
	Programa que l� seu sal�rio e aplica o reajuste devido
 */
package fundamentos;

import javax.swing.JOptionPane;

public class ReajusteSalarialrJOptionPane {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu sal�rio atual:"));
		double salarioFinal;
		double reajuste;

		if (salario >= 1000 && salario < 1800) {
			salarioFinal = salario * (1 + 0.2);
			reajuste = salarioFinal - salario;
			JOptionPane.showMessageDialog(null, String.format(
					"%s\nSal�rio digitado: %.2f\nPercentual do reajuste: 20%%\nReajuste salarial: %.2f\nSal�rio final %.2f.",
					nome, salario, reajuste, salarioFinal));

		} else if (salario >= 1800) {
			salarioFinal = salario * (1 + 0.1);
			reajuste = salarioFinal - salario;
			JOptionPane.showMessageDialog(null, String.format(
					"%s\nSal�rio digitado: %.2f\nPercentual do reajuste: 10%%\nReajuste salarial: %.2f\nSal�rio final %.2f.",
					nome, salario, reajuste, salarioFinal));
		} else {
			salarioFinal = salario;
			reajuste = salarioFinal - salario;
			JOptionPane.showMessageDialog(null, String.format(
					"%s\nSal�rio digitado: %.2f\nPercentual do reajuste: 0%%\nReajuste salarial: %.2f\nSal�rio final %.2f.",
					nome, salario, reajuste, salarioFinal));
		}

	}

}