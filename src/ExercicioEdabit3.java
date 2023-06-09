import java.util.Scanner;

public class ExercicioEdabit3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salarioMinimo = 1300;
		System.out.println("Digite o valor do seu salário: ");
		double salario = sc.nextDouble();
		
		double quantidadeSalarios = salario / salarioMinimo;
		System.out.println("Quantidade de salários mínimos: " + quantidadeSalarios);
				
		sc.close();
				
	}

}
