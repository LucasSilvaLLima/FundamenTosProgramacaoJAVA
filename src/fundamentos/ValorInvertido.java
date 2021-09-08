/**
	Algoritmo que leia dois valores inteiros A e B, ao final
	apresente os valores invertidos 
	(o valor de A deverá estar armazenado em B e o valor de B deverá estar armazenado em A)
 */
package fundamentos;

import javax.swing.JOptionPane;

public class ValorInvertido {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Digite o 1° valor: ");
		String y = JOptionPane.showInputDialog("Digite o 2° valor: ");
		
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int c = a;
		a = b;
		b = c;
		
		System.out.println("1° Valor:" + a);
		System.out.println("2° Valor:" + b);
		
	}
}