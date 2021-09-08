/**
	Algoritmo que apresente a tabuada de um número inteiro
	informado pelo usuário
 */
package fundamentos;

import java.util.Scanner;
public class AlgoritmoTabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Programa Tabuada:\nA tabuada de qual número você quer? ");
		int n =entrada.nextInt();
		
		System.out.printf("%d x 1 = %d\n",n,n);
		System.out.printf("%d x 2 = %d\n",n,n*2);
		System.out.printf("%d x 3 = %d\n",n,n*3);
		System.out.printf("%d x 4 = %d\n",n,n*4);
		System.out.printf("%d x 5 = %d\n",n,n*5);
		System.out.printf("%d x 6 = %d\n",n,n*6);
		System.out.printf("%d x 7 = %d\n",n,n*7);
		System.out.printf("%d x 8 = %d\n",n,n*8);
		System.out.printf("%d x 9 = %d\n",n,n*9);
		System.out.printf("%d x 10 = %d\n",n,n*10);
		entrada.close();
	}
}
