/**
	Algoritmo que leia um valor em real e converta e apresente
	esse valor em Euros e em D�lar
 */
package fundamentos;

import java.util.Scanner;

public class ConversaoRealEmDolarEuro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Programa Cambio real em d�lar/euro\n\nQuantos reias desaja trocar? ");
		String r = entrada.nextLine().replace(",", ".");

		double real = Double.parseDouble(r);
		double dolar = real / 5.63;
		double euro = real / 6.60;

		System.out.printf("%.2f reais equivalem a %.2f d�lares ou %.2f euros\n\n", real, dolar, euro);

		System.out.print("Com qual moeda vc deseja trocar ?");
		String d = entrada.next().toLowerCase();

		if (d.equals("dolar") || d.equals("d�lar")) {
			System.out.printf("Voc� trocou %.2f Reais em %.2f D�lares", real, dolar);
		} else if (d.equals("euro")) {
			System.out.printf("Voc� trocou %.2f Reais em %.2f Euros\n", real, euro);
		} else {
			System.out.println("Tipo de moeda Invalida\n");
		}

		System.out.println("Fim");
		entrada.close();
	}
}