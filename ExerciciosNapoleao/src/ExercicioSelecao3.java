import java.util.Scanner;

public class ExercicioSelecao3 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a altura:");
		double altura = scan.nextDouble();
		System.out.println("Informe o peso:");
		double peso = scan.nextDouble();
		double imc = peso / Math.pow(altura, 2);
		
		if (imc >= 25) {
			System.out.println("Você esta acima do peso");
		} else {
			System.out.println("Você esta ok");
		}
	}	
}