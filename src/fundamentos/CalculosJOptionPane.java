/**
 	PROGRAMA QUE L� DOIS NUMEROS E MOSTRA A SOMA, SUB, MULT, DIV
 */
package fundamentos;

import javax.swing.JOptionPane;

public class CalculosJOptionPane {

	public static void main(String[] args) {
		
		double numero1;
		double numero2;
		
		double soma;
		double subtracao;
		double multiplicacao;
		double divisao;
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um n�mero: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um n�mero: "));
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		if(numero1 == 0 || numero2 == 0) {
			JOptionPane.showMessageDialog(null, "A soma dos dois n�meros � " + soma
					+ "\nA multiplica��o �: " + multiplicacao
					+ "\nN�o � possivel dividir por 0 "
					+ "\nA subtra��o �: " + subtracao);
					
		} else {
			JOptionPane.showMessageDialog(null, "A soma dos dois n�meros � " + soma
					+ "\nA multiplica��o �: " + multiplicacao
					+ "\nA divis�o �: " + divisao
					+ "\nA subtra��o �: " + subtracao);
		
		}
		
	}
}
