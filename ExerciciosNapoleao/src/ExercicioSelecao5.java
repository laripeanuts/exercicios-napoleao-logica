import java.util.Scanner;

public class ExercicioSelecao5 {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga idade");
		int idade = scan.nextInt();
		System.out.println("Diga sua altura");
		double altura = scan.nextDouble();
		
		if (idade >= 14 && idade <= 18 && altura >= 1.78) {
			System.out.println("Selecionado!");
		} else {
			System.out.println("Fora");
		}
	}
	
}
