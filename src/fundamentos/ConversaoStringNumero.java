/**
	EXEMPLO DE COMO CONVERTER UMA STRING EM NÚMERO
 */
package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
	String valor1 = JOptionPane.showInputDialog("Digite 1° valor").replace(",", ".");
	String valor2 = JOptionPane.showInputDialog("Digite 2° valor").replace(",", ".");
	
	double numero1 = Double.parseDouble(valor1);
	double numero2 = Double.parseDouble(valor2);
	double soma = numero1 + numero2;
	
	System.out.println("A soma dos dois valores é " + soma);
	}
}
