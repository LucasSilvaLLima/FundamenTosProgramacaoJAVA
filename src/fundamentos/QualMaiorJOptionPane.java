/**
	Programa que l� dois n�meros e diz qual � o maior 
 */
package fundamentos;

import javax.swing.JOptionPane;

public class QualMaiorJOptionPane {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro o 1� n�mero:"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro o 2� n�mero:"));
		
		if(n1 > n2) {
			JOptionPane.showMessageDialog(null, String.format("%d � o maior", n1,n2));
		} else if(n2 > n1) {
			JOptionPane.showMessageDialog(null, String.format("%d � o maior", n2));
		} else {
			JOptionPane.showMessageDialog(null, String.format("s�o iguais"));
		}
	}
}