/**
 * Um programa que leia o peso e a altura de um usuário. 
 * Informar o seu IMC junto com a respectiva condição
 */
package fundamentos;

import java.util.Scanner;

public class CalculoIMC {

	
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Progama Calculo IMC.");
		 System.out.print("Digite seu peso em quilograma: ");
		 double peso = entrada.nextDouble();
		 System.out.print("Digite sua altura em metros: Ex: 1.75");
		 double altura = entrada.nextDouble();
		 
		 double imc = peso/Math.pow(altura, 2);
		 
		 if(imc < 18.5) {
			 System.out.println("Excesso de magreza");
			 System.out.println("O seu imc é " + imc);
		 } else if(imc >= 18.5 && imc <= 25) {
			 System.out.println("Peso Normal");
			 System.out.println("O seu imc é " + imc);
		 } else if(imc > 25 && imc <= 30) {
			 System.out.println("Excesso de peso");
			 System.out.println("O seu imc é " + imc);
		 } else if(imc > 30 && imc <= 35) {
			 System.out.println("Obesidade Grau 1");
			 System.out.println("O seu imc é " + imc);
		 } else if(imc > 35 && imc <= 40) {
			 System.out.println("Obesidade Grau 2");
			 System.out.println("O seu imc é " + imc);
		 } else {
			 System.out.println("Obesidade Grau 3");
			 System.out.println("O seu imc é " + imc);
		 }
		 entrada.close();
	}
}
