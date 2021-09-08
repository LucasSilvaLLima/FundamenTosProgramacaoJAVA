/**
	Programa que leia um número de dias qualquer e o
	apresente convertido em meses e anos e dias.
 */
package fundamentos;

import java.util.Scanner;

public class DiasEmAnos_e_Meses {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Programa converção dia em mês,ano:\nQuantos dias?: ");
		int d = entrada.nextInt();
		
		int mes = d/30;
		int ano = d/365;
		int dias = 0;
		
		if(d > 365 && ano < 2) {
			dias = d - 365;
			if(dias > 365 ) {
				dias -= 365;
			}
			System.out.printf("%d dias são %d messes ou %d ano(os) e %d dia(as)",d,mes,ano, dias);
		} else {
			System.out.printf("%d dias são %d messes",d, mes);
		}
		entrada.close();
	}
}