/**
	PROGRAMA QUE L� O PRIMEIRO N�MERO, O PERADOR "* , / , + , - , %" E O SEGUNDO N�MERO
 */
package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("Digite o 1� valor: ").replace(",", ".");
		String op = JOptionPane.showInputDialog("Digite o operador: ");
		String num2 = JOptionPane.showInputDialog("Digite o 2� valor: ").replace(",", ".");
		
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		
		if(n1 == 0 || n2 == 0) {
			double resultado = "*".equals(op) ? n1 * n2: 0;  
			resultado = "/".equals(op) ? n1 / n2: resultado;  
			resultado = "+".equals(op) ? n1 + n2: resultado; 
			resultado = "-".equals(op) ? n1 - n2: resultado; 
			resultado = "%".equals(op) ? n1 % n2: resultado; 
			
			JOptionPane.showMessageDialog(null, "N�o existe divis�o por 0");
		} else {
			double resultado = "*".equals(op) ? n1 * n2: 0; 
			resultado = "/".equals(op) ? n1 / n2: resultado; 
			resultado = "+".equals(op) ? n1 + n2: resultado; 
			resultado = "-".equals(op) ? n1 - n2: resultado; 
			resultado = "%".equals(op) ? n1 % n2: resultado; 

			JOptionPane.showMessageDialog(null, "O resultado da opera��o �: \n" + resultado);
		}
 		
		
	}
}
