
public class ExercicioStringSplit {

	public static void main(String[] args) {
		
		/* 
		  Este programa imprime o valor de cada vetor
		 */
		String s = "potato apple lemon orange banana";
		
		String[] vect = s.split(" ");
		System.out.println(vect[0]); //vetor da primeira posição sempre é igual a 0
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		System.out.println(vect[4]);

	}

}
