/**
 * 	PROGRAMA QUE LÊ A TEMPERATURA EM °F E CONVERTE EM °C
 */
package fundamentos;

import java.util.Scanner;

public class DesafioTemperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final double FATOR = 32;
		final double AJUSTE = 5.0 / 9.0;

		System.out.print("Insira a temperatura em °F: ");
		double f = entrada.nextDouble();

		double c = (f - FATOR) * AJUSTE;

		System.out.printf("%.2f°F = %.2f°C", f, c);

		entrada.close();
	}
}
