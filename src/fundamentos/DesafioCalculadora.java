/**
	PROGRAMA QUE LÊ O PRIMEIRO NÚMERO, O PERADOR "* , / , + , - , %" E O SEGUNDO NÚMERO
 */
package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Digite o 1° valor: ").replace(",", ".");
		String op = JOptionPane.showInputDialog("Digite o operador: ");
		String num2 = JOptionPane.showInputDialog("Digite o 2° valor: ").replace(",", ".");
		
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		
		if(n1 == 0 || n2 == 0) {
			double resultado = "*".equals(op) ? n1 * n2: 0;  
			resultado = "/".equals(op) ? n1 / n2: resultado;  
			resultado = "+".equals(op) ? n1 + n2: resultado; 
			resultado = "-".equals(op) ? n1 - n2: resultado; 
			resultado = "%".equals(op) ? n1 % n2: resultado; 
			
			JOptionPane.showMessageDialog(null, "Não existe divisão por 0");
		} else {
			double resultado = "*".equals(op) ? n1 * n2: 0; 
			resultado = "/".equals(op) ? n1 / n2: resultado; 
			resultado = "+".equals(op) ? n1 + n2: resultado; 
			resultado = "-".equals(op) ? n1 - n2: resultado; 
			resultado = "%".equals(op) ? n1 % n2: resultado; 

			JOptionPane.showMessageDialog(null, "O resultado da operação é: \n" + resultado);
		}
 		
		
	}
}
