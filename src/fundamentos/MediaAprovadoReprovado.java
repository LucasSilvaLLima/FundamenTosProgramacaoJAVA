/**
 * programa que leia duas notas para um aluno. Calcular e apresentar a sua média, sendo que:
		SE a média for menor do que 3 o aluno está REPROVADO;
		SE a média for >=6 o aluno está APROVADO;
		SE a média for >=3 e < 6 avisar via mensagem que o aluno está em EXAME. 
		Solicitar então uma nota de EXAME, extrair uma nova média entre a média anterior e a nota de EXAME. 
		Caso a nova média seja >=6 o aluno será APROVADO. Caso contrário está reprovado.
 */
package fundamentos;

import java.util.Scanner;

public class MediaAprovadoReprovado {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Programa calcular média\nDigite sua primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if(media < 3) {
			System.out.println("REPROVADO");
		} else if(media >= 3 && media < 6) {
			System.out.print("Você esta em exame \nDigite a nota do seu Exame: ");
			double exame = entrada.nextDouble();
			if((exame + media) / 2 >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		} else {
			System.out.println("Aprovado");
		}
		entrada.close();
	}
}
