import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		
		System.out.println("Qual o n�mero?");
		numero = sc.nextInt();
		
		if (numero < 0) {
		    System.out.println("NEGATIVO");
		}
		else {
				System.out.println("N�O NEGATIVO");
			}
		
			
		sc.close();
		}
		
	
	}


