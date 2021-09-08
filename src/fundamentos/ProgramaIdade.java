/**
 	programa que leia o ano de nascimento de um usuário e o ano atual. 
 	Calcule e apresente a sua idade junto com mensagem correspondente:
 	
 	Idade < 10 anos: criança;
	Idade >=10 e < 18: Adolescente;
	Idade >=18 e Idade <60: Adulto;
	Idade >=60 : Idoso.
 */
package fundamentos;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano do seu nascimento: ");
		int anoNascimento = entrada.nextInt();
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = entrada.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		if(idade < 10) {
			System.out.println("Criança");
		} else if(idade >= 10 && idade < 18) {
			System.out.println("Adolecente");
		} else if(idade >= 18 && idade < 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		entrada.close();
	}
}