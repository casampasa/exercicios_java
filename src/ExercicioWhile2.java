import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int x = 0;
		int y = 4;
		
		while (x<3) {
			y = y + 2;
			x = x + 1;
			
			System.out.println(x + "-" + y);
		}

	}

}
