import java.util.Scanner;

public class ExercicioEdabit4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite quantos anos tem: ");
		int anos = sc.nextInt();
		System.out.println("Digite quantos meses tem: ");
		int meses = sc.nextInt();
		System.out.println("Digite quantos dias tem: ");
		int dias = sc.nextInt();
		
		int a = anos * 365;
		int b = meses * 30;
		int resultado = a+b+dias;
		System.out.println("A quantidade de dias de vida que a pessoa possui é: " + resultado);
		
		sc.close();

	}

}
