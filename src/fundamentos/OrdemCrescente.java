/**
 	Programa que leia três valores inteiros A, B e C 
 	e os apresente em forma crescente (menor para o maior).
 */
package fundamentos;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira 3 números que eu mostro em ordem crescente.");
		System.out.print("Digite o 1°: ");
		int a = entrada.nextInt();
		System.out.print("Digite o 2°: ");
		int b = entrada.nextInt();
		System.out.print("Digite o 3°: ");
		int c = entrada.nextInt();
		
		if(a < b && a < c && b < c) {
			System.out.printf("%d > %d > %d", a, b, c);
			
		} else if(a < b && a < c && c < b) {
			System.out.printf("%d > %d > %d", a,  c,  b);
			
		} else if(b < a && b < c && a < c) {
			System.out.printf("%d > %d > %d", b, a, c);
			
		} else if(b < a && b < c && c < a) {
			System.out.printf("%d > %d > %d", b, c, a);
			
		} else if(c < a && c < b && a < b) {
			System.out.printf("%d > %d > %d", c, a, b);
			
		}else if(c < a && c < b && b < a) {
			System.out.printf("%d > %d > %d",c, b, a);
		}
		entrada.close();
	}
}
