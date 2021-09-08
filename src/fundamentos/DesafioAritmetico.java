/**
	([ 6 * (3 + 2)]²	-	((1 - 5) * (2 - 7))²)³
			/	    	 
	      3 * 2
	      			    /
	      			   10³ 
	      			   
 	RESOLUÇÃO DA SEGUINTE EQUAÇÃO ARITMETICA
 */
 package fundamentos;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		double part1 = 6 * (3 + 2);
		part1 = Math.pow(part1, 2) / (3 * 2);
				
		double part2 = (1 - 5) * (2 - 7) /2;
		part2 = Math.pow(part2, 2);
		
		double part3 = part1 - part2;
		part3 = Math.pow(part3, 3);
		
		double part4 = Math.pow(10, 3);
		
		double resultado = part3 / part4;
		
		System.out.println(resultado);
	}
}