import java.util.Scanner;

public class ExercicioSelecao4 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga idade");
		int idade = scan.nextInt();
		System.out.println("Diga sua altura");
		double altura = scan.nextDouble();
		
		if (idade > 16 && altura >= 1.70) {
			System.out.println("elegivel");
		} else {
			System.out.println("fora");
		}
	}
}