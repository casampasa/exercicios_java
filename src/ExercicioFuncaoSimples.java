import java.util.Scanner;

public class ExercicioFuncaoSimples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 n�meros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c);

		showResult(maior);
		/*
		 * if (a > b && a > c) { System.out.println("O maior � = " + a);
		 * 
		 * } else if (b > c) { System.out.println("O maior � = " + b);
		 * 
		 * } else { System.out.println("O maior � = " + c); }
		 */
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;

		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("O maior = " + value);
	}

}