package fundamentos;

public class DesafioLogico {

	public static void main(String[] args) {
		// Altere Aqui trabalho 1 e 2
		boolean trabalho1 = false;
		boolean trabalho2 = false;

		boolean tv52 = trabalho1 && trabalho2;
		System.out.println("Comprou TV 52\": " + tv52);

		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV 32\": " + tv32);
		
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("Tomou sorvete: " + sorvete);
		
		boolean saudavel = !sorvete;
		System.out.println("Mais saudável: " + saudavel);
	}
}

/* Desafio Lógico:
 * Se os dois trabalhos derem certo: Compra tv 52", Toma Sorvete e Não fica saudável
 * Se apenas um trabalho der certo: Compra tv 32", Toma Sorvete e Não fica Saudável
 * Se nenhum trabalho der certo: Não compra Nenhuma tv, Não toma Sorvete e Fica Saudável. 
 */



