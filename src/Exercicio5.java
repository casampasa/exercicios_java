import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a hora inicial");
		int hinicial = sc.nextInt();
		
		System.out.println("Digite a hora final");
		int hfinal = sc.nextInt();
		
		int duracao;
		
		if (hinicial < hfinal) {
			duracao = hfinal - hinicial;
		}
		else {
			duracao = hinicial + hfinal;
		}
		
		System.out.println("O jogo durou: "+ duracao + " Hora(s)");
		sc.close();

	}

}
