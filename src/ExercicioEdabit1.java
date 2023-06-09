import java.util.Scanner;

public class ExercicioEdabit1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de vitórias: ");
		int vitorias = sc.nextInt();
		System.out.println("Digite a quantidade de empates: ");
		int empates = sc.nextInt();
		System.out.println("Digite a quantidade de derrotas: ");
		int derrotas = sc.nextInt();
		int a = vitorias * 3;
		int b = empates * 1;
		int c = derrotas * 0;
		
		
		int pontos = a+b+c;
		
		System.out.println("Pontuação: " + pontos);
	}

}
