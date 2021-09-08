/**
	Algoritmo que calcule e apresente o volume de uma lata de
	óleo qualquer
 */
package fundamentos;

import javax.swing.JOptionPane;

public class VolumeCilindro {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Programa Volume do cilindro.\nQual o valor do rio da lata ?");
		String b = JOptionPane.showInputDialog("Qual o valor da altura da lata ?");
	
		double raio = Double.parseDouble(a);
		double altura = Double.parseDouble(b);
		final double PI = 3.14;
		double volume = PI*Math.pow(raio, 2)*altura;
		System.out.println("O volume da lata é " + volume);
	}
}