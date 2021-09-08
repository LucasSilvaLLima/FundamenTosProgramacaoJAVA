/**
 	Programa que calcule a apresente a área de um triangulo
	retângulo (ÁREA DO TRIANGULO BASE X ALTURA ÷ 2)
 */
package fundamentos;

import java.util.Scanner;

public class AreaTrianguloRetangulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Programa calcular área do triangulo:\nDigite a o valor da base: ");
		double base = entrada.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		double altura = entrada.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.println("A área do triangulo = " + area);
		entrada.close();
	}
}