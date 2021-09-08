/**
 	PROGRAMA QUE LÊ DOIS NUMEROS E MOSTRA A SOMA, SUB, MULT, DIV
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
		
		numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número: "));
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		multiplicacao = numero1 * numero2;
		divisao = numero1 / numero2;
		
		if(numero1 == 0 || numero2 == 0) {
			JOptionPane.showMessageDialog(null, "A soma dos dois números é " + soma
					+ "\nA multiplicação é: " + multiplicacao
					+ "\nNão é possivel dividir por 0 "
					+ "\nA subtração é: " + subtracao);
					
		} else {
			JOptionPane.showMessageDialog(null, "A soma dos dois números é " + soma
					+ "\nA multiplicação é: " + multiplicacao
					+ "\nA divisão é: " + divisao
					+ "\nA subtração é: " + subtracao);
		
		}
		
	}
}
