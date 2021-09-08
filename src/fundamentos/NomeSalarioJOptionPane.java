/**
	PROGRAMA QUE RECEBE SEU NOME SEU SALÁRIO E FAZ UM REAJUSTE DE 10% DE ALMENTO
 */
package fundamentos;

import javax.swing.JOptionPane;

public class NomeSalarioJOptionPane {

	public static void main(String[] args) {
		String nome;
		double salario;

		nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu salário: "));
		
		double salarioReajuste = salario * (1 + 0.1);
		double reajuste = salarioReajuste - salario;
		
		JOptionPane.showMessageDialog(null, String.format("Nome: %s \nSalário %.2f \nPercentual de reajuste: 10%% \nValor reajuste: %.2f \nSalário com reajuste: %.2f"
														, nome, salario, reajuste, salarioReajuste));
	}
}