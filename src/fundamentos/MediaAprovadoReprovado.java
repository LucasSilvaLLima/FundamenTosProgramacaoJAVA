/**
 * programa que leia duas notas para um aluno. Calcular e apresentar a sua m�dia, sendo que:
		SE a m�dia for menor do que 3 o aluno est� REPROVADO;
		SE a m�dia for >=6 o aluno est� APROVADO;
		SE a m�dia for >=3 e < 6 avisar via mensagem que o aluno est� em EXAME. 
		Solicitar ent�o uma nota de EXAME, extrair uma nova m�dia entre a m�dia anterior e a nota de EXAME. 
		Caso a nova m�dia seja >=6 o aluno ser� APROVADO. Caso contr�rio est� reprovado.
 */
package fundamentos;

import java.util.Scanner;

public class MediaAprovadoReprovado {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Programa calcular m�dia\nDigite sua primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		double nota2 = entrada.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if(media < 3) {
			System.out.println("REPROVADO");
		} else if(media >= 3 && media < 6) {
			System.out.print("Voc� esta em exame \nDigite a nota do seu Exame: ");
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
