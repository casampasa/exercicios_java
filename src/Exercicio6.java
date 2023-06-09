import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Digite o valor do salário:");
		double salario = sc.nextDouble();
		double imposto;
		
		
		if (salario >= 0.00 && salario <= 2000.00) {
			imposto = 0.00;
			System.out.println("Isento");
		}
		else if (salario >= 2000.01 && salario <= 3000.00){
			System.out.println("8%");
			imposto = (salario - 2000.00) * 0.08;
		}
		else if (salario >= 3000.01 && salario <= 4500.00){
			System.out.println("18%");
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.8;
		}
		else {
			System.out.println("28%");
		}
		sc.close();
	}

}
