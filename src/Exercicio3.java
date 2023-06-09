import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o item do produto");
		int produto = sc.nextInt();
		System.out.println("Digite a quantidade do produto");
		int quantidade = sc.nextInt();
	    double total;
	
		
		if (produto == 1) {
			total = quantidade * 4.0;
		}
		else if (produto == 2) {
			total = quantidade *4.5;
			
		}
		else if (produto == 3) {
			total = quantidade * 5.0;
			
		}
		else if (produto == 4) {
			total = quantidade * 2.0;
			
		}
		else {
			total = quantidade * 1.5;
		}
	
		
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();

	}

}
