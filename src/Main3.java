import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int NumeroFuncionario, HorasTrabalhadas;
		double ValorHora, CalculoSalario;

		NumeroFuncionario = sc.nextInt();
		HorasTrabalhadas = sc.nextInt();
		ValorHora = sc.nextDouble();
		CalculoSalario = HorasTrabalhadas * ValorHora;

		System.out.printf("NUMBER: %2d%nSALARY: U$%.2f", NumeroFuncionario, CalculoSalario);
		sc.close();
	}

}
