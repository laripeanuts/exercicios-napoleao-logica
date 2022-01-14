import java.util.Scanner;

public class ExercicioNapoleao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga primeira nota:");
		double notaA = scan.nextDouble();
		System.out.println("Diga segunda nota:");
		double notaB = scan.nextDouble();
		System.out.println("Diga terceira nota:");
		double notaC = scan.nextDouble();

		double media = 0;
		final double APROVACAO = 8;
		
		if ( notaA < notaB && notaA < notaC ) {
			media = ( notaB + notaC) / 2;
			System.out.println("A media é: " + media);
		} else if ( notaB < notaA && notaB < notaC) {
			media = ( notaA + notaC ) / 2;
			System.out.println("A media é" + media);
		} else {
			media = ( notaA + notaB ) /2;
			System.out.println("A media é: " + media);
		}
		
		if ( media >= APROVACAO ) {
				System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
	}

}
