/**
	Algoritmo que recebe o raio de uma circunfer�ncia e apresenta a area da mesma
*/
package fundamentos;

import java.util.Scanner;

public class AreaCircuferencia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raio;
		final double PI = 3.14;
		double area;
		
		System.out.print("Digite o valor do raio da circunfer�ncia: ");
		raio = entrada.nextDouble();
		
		area = PI * Math.pow(raio, 2);
		
		System.out.println("A �rea da circunfer�ncia = " + area);
		entrada.close();
	}
}