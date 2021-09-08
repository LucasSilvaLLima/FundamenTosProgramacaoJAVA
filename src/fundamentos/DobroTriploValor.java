/**
	Le um valor e aprenta o dobro e triplo do mesmmo
 */ 
package fundamentos;

import java.util.Scanner;

public class DobroTriploValor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número qualquer: ");
		double n = entrada.nextDouble();
		
		double dobro = n * 2;
		double triplo = n * 3;
		
		System.out.printf("O dobro de %.1f é %.1f\n", n, dobro);
		System.out.printf("O triplo de %.1f é %.1f", n, triplo);
		
		entrada.close();
	}
}