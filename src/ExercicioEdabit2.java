import java.util.Scanner;

public class ExercicioEdabit2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int a = sc.nextInt();
		int antecessor = a - 1;
		int sucessor = a + 1;
		
		System.out.println(a);
		System.out.println("O seu antecessor é: " + antecessor);
		System.out.println("O seu sucessor é: " + sucessor);
		sc.close();
	}

}
