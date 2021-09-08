/**
 	Programa que calcule a apresente a �rea de um triangulo
	ret�ngulo (�REA DO TRIANGULO BASE X ALTURA � 2)
 */
package fundamentos;

import java.util.Scanner;

public class AreaTrianguloRetangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Programa calcular �rea do triangulo:\nDigite a o valor da base: ");
		double base = entrada.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		double altura = entrada.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.println("A �rea do triangulo = " + area);
		entrada.close();
	}
}