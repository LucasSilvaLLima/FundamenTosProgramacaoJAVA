/**
 	Criar um programa que leia os valores A, B e C de uma equação de segundo grau (Ax2+BX+C).
 	 	
 	 	Calcular as duas raízes reais de X lembrando que:
		
		Se Δ < 0: não existem raízes reais para a equação;
		Se Δ = 0: existe apenas uma raiz real para a equação;
		Se Δ > 0: existem duas raízes reais para a equação.
 */
package fundamentos;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Equação de segundo grau: Ax²+Bx+C");
		System.out.print("Digite o valor de A:");
		double a = entrada.nextDouble();
		System.out.print("Digite o valor de B:");
		double b = entrada.nextDouble();
		System.out.print("Digite o valor de C:");
		double c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta < 0 ) {
			System.out.println("Não existe raizes reais para a equação");
		} else if(delta == 0 ) {
			double umaRaiz  = (-b)/2*a;
			System.out.println("Existe apenas uma raiz real para equação\nSolução = " + umaRaiz);
		} else {
			System.out.println("Existem duas raízes reais para a equação");
			double x_positivo = (-b + Math.sqrt(delta)) / 2 * a;
			System.out.println("X' = " + x_positivo);
			double x_negativo = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println("X\" = " + x_negativo);
		}
		entrada.close();
	}
}