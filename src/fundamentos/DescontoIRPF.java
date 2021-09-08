/**
Programa que le o salário de um empregado e apresente o desconto do IRPF segundo a tabela abaixo:
	_________________________________________________________________________________
	|Base de cálculo mensal em R$ | Alíquota %	| Parcela a deduzir do imposto em R$|
	|=============================|=============|===================================|
	|	Até 1.434,59			  |		=		|				=					|
	|=============================|=============|===================================|
	| 	De 1.434,60 até 2.150,00  |	   7,5%		|			107,59					|
	|=============================|=============|===================================|
	| 	De 2.150,01 até 2.866,70  |	   15,0%	|			268,84					|
	|===============================================================================|
	| 	De 2.866,71 até 3.582,00  |	   22,5%	|			483,84					|
	|===============================================================================|
	| 	Acima de 3.582,00		  |	   27,5%	|			662,94					|
	|=============================|=============|===================================|
	
	Exemplo: Se o salário lido for igual a R$ 4000,00 o cálculo será: IRPF ← 4000*27.5/100 - 662,94
 */
package fundamentos;

import java.util.Scanner;

public class DescontoIRPF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu sálario: ");
		double salario = entrada.nextDouble();
		double desconto;
		if(salario >= 1434.60 && salario <= 2150) {
			desconto = (salario * 7.5 / 100) - 107.59;
			System.out.printf("O desconto é de %.3f", desconto);
		} else if(salario > 2150 && salario <= 2866.70) {
			desconto = (salario * 15 / 100) - 268.84;
			System.out.printf("O desconto é de %.3f", desconto);
		} else if(salario > 2866.70 && salario <= 3582) {
			desconto = (salario * 22.5 / 100) - 483.84;
			System.out.printf("O desconto é de %.3f", desconto);
		} else if(salario > 3582) {
			desconto = (salario * 27.5 / 100) - 662.94;
			System.out.printf("O desconto é de %.3f", desconto);
		} else {
			System.out.println("Você não possui desconto !!!");
		}
		entrada.close();
	}
}
